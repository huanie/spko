parser grammar SExpressionParser;

options { tokenVocab=SExpressionLexer; }

sexpression: LEFT_PAREN form RIGHT_PAREN
           | LEFT_BRACKET form RIGHT_BRACKET
           | LEFT_CURLY form RIGHT_CURLY
           ;

form: head arguments // (+ + + w wow)
    | form sexpression
    ;

head: SYMBOLS;

arguments: (WS? SYMBOLS WS?)*;