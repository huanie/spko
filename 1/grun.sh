#!/bin/sh
#c="java -cp Expr.jar org.antlr.v4.gui.TestRig Expr tokens -tokens $1 > ${1%.*}-tokens.txt"
c="java -cp Aufgabe2.jar  org.antlr.v4.gui.TestRig Aufgabe2 tokens -tokens $1"
echo $c
eval $c
