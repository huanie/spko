lexer grammar Aufgabe2Lexer;

Clock: WORD
     | TIME
     ;

WORD: 'Midnight'
    | 'Noon'
    | '12' ' ' 'midnight'
    | '12' ' ' 'noon'
    ;

TIME: HOUR SEPARATOR MINUTE FORMAT
    ;

FORMAT: 'a.m.'
      | 'p.m.'
      ;

SEPARATOR: ':'
         ;

HOUR: [1-9][0-9]?
    | '2'[0-3]
    ;

MINUTE: [0-9]
      | [0-5][0-9]
      ;

WS: [ \t\r\n]+ -> channel(HIDDEN);