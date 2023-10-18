lexer grammar Aufgabe2Lexer;

Clock: WORD
     | TIME
     ;

fragment WORD: 'Midnight'
             | 'Noon'
	     | '12' WS 'midnight'
	     | '12' WS 'noon'
	     ;

fragment TIME: HOUR SEPARATOR MINUTE WS FORMAT;

fragment FORMAT: 'a.m.'
               | 'p.m.'
      	       ; 

fragment SEPARATOR: ':';

fragment HOUR: [1-9]
             | '1'[0-2]
	     ;

fragment MINUTE: [0-9]
               | [0-5][0-9]
    	       ;

WS: [ \t\r\n]+ -> channel(HIDDEN);