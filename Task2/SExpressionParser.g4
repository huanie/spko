parser grammar SExpressionParser;

options { tokenVocab=SExpressionLexer; }

sexpression: LEFT_PAREN head rest* RIGHT_PAREN
           | LEFT_BRACKET head rest* RIGHT_BRACKET
           | LEFT_CURLY head rest* RIGHT_CURLY
           | literal
           ;

literal: SYMBOL;

head: SYMBOL
    | sexpression;

rest: (WS? SYMBOL WS?)+
    | sexpression+
    ;