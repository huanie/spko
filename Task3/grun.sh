#!/bin/sh
gui="java -cp SExpression.jar org.antlr.v4.gui.TestRig SExpression
sexpression -gui $1"
echo $gui
eval $gui
