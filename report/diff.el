(require 'treesit)
(require 'compile)
(require 'outline)

(defconst typst-ts-mode-outline-regexp "=+ "
  "Regexp identifying Typst header.")

(defun typst-ts-mode-outline-level ()
  "Return the level of the heading at point."
  (save-excursion
    (end-of-line)
    (if (re-search-backward "^=+ " nil t)
	(1- (- (match-end 0) (match-beginning 0)))
      0)))

(defconst typst-ts-mode-outline-heading-alist
  '(("= " . 1)
    ("== " . 2)
    ("=== " . 3)
    ("==== " . 4)
    ("===== " . 5)
    ("====== " . 6)))

(defun typst-ts-mode-heading--at-point-p ()
  "Whether the current line is a heading.
Return the heading node when yes otherwise nil."
  (let ((node (treesit-node-parent
	       (treesit-node-at
                (save-excursion
                  (beginning-of-line-text)
                  (point))))))
    (if (string= (treesit-node-type node) "heading")
	node
      nil)))

(defun typst-ts-mode-heading-up ()
  "Switch the current heading with the heading above."
  (interactive)
  (typst-ts-mode-meta--dwim 'up))

(defun typst-ts-mode-heading-down ()
  "Switch the current heading with the heading below."
  (interactive)
  (typst-ts-mode-meta--dwim 'down))

(defun typst-ts-mode-heading-increase ()
  "Increase the heading level."
  (interactive)
  (typst-ts-mode-meta--dwim 'right))

(defun typst-ts-mode-heading-decrease ()
  "Decrease heading level."
  (interactive)
  (typst-ts-mode-meta--dwim 'left))

(defun typst-ts-mode-meta--dwim (direction)
  "Do something depending on the context with meta key + DIRECTION.
`left': `typst-ts-mode-heading-decrease',
`right': `typst-ts-mode-heading-increase',
`up': `typst-ts-mode-heading-up',
`down': `typst-ts-mode-heading-down'.
When there is no relevant action to do it will execute the relevant function in
the `GLOBAL-MAP' (example: `right-word')."
  (let ((heading (typst-ts-mode-heading--at-point-p))
	;; car function, cdr string of function for `substitute-command-keys'
	(call-me/string
	 (pcase direction
	   ('left
	    (cons #'outline-promote
		  "\\[typst-ts-mode-heading-decrease]"))
	   ('right
	    (cons #'outline-demote
		  "\\[typst-ts-mode-heading-decrease]"))
	   ('up
	    (cons #'outline-move-subtree-up
		  "\\[typst-ts-mode-heading-up]"))
	   ('down
	    (cons #'outline-move-subtree-down
		  "\\[typst-ts-mode-heading-down]"))
	   (_ (error "%s is not one of: `right' `left'" direction)))))
    (if heading
	(call-interactively (car call-me/string))
      (call-interactively
       (keymap-lookup global-map (substitute-command-keys (cdr call-me/string)))))))

(defvar typst-ts-mode-map
  (let ((map (make-sparse-keymap)))
    (define-key map (kbd "C-c C-c c") #'typst-ts-mode-compile-and-preview)
    (define-key map (kbd "C-c C-c C") #'typst-ts-mode-compile)
    (define-key map (kbd "C-c C-c w") #'typst-ts-mode-watch-toggle)
    (define-key map (kbd "C-c C-c p") #'typst-ts-mode-preview)
    (define-key map (kbd "M-<left>") #'typst-ts-mode-heading-decrease)
    (define-key map (kbd "M-<right>") #'typst-ts-mode-heading-increase)
    (define-key map (kbd "M-<down>") #'typst-ts-mode-heading-down)
    (define-key map (kbd "M-<up>") #'typst-ts-mode-heading-up)
    (define-key map (kbd "TAB") #'typst-ts-mode-cycle)
    map))
