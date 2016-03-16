grammar TargetingExpressionAST_Java;


options {
	output = AST;
	ASTLabelType=pANTLR3_BASE_TREE;
	language = Java;
}

tokens {
	NOT		= 'NOT';
	AND		= 'AND';
	OR		= 'OR';
	EQ		= '=';
	NEQ		= '!=';
	GT		= '>';
	GTE		= '>=';
	LET		= '<';
	LETE		= '<=';
	IN		= 'IN';
	NOT_IN		= 'NOT_IN';
	BETWEEN		= 'BETWEEN';
	NOT_BETWEEN	= 'NOT_BETWEEN';
	CONTAINS	= 'CONTAINS';
	NOT_CONTAINS	= 'NOT_CONTAINS';
	EXISTS		= 'EXISTS';
	NOT_EXISTS	= 'NOT_EXISTS';
	LIST		= 'LIST';
	ENTITY		= 'ENTITY';
}

@header {
//package com.aol.one.peach.targeting.antlr;
}

@lexer::header {
//package com.aol.one.peach.targeting.antlr;
}

@rulecatch {
/*catch (RecognitionException e) {
	throw e;
}*/
}

start	:	expr EOF;

expr	:	expr2 (OR^ expr2)*;

expr2	:	expr3 (AND^ expr3)*;

expr3	:	(NOT^)? expr4;

expr4	:	entity -> ^(ENTITY entity)
	|	pexpr
	;

pexpr	:	'(' expr ')' -> expr;

entity	:	KEY comp singlelist
	|	KEY list_op list
	|	KEY exists_op nolist
	;

nolist	:	(WS)? -> ^(LIST);

singlelist
	:	VALUE -> ^(LIST VALUE);

list	:	'(' VALUE (',' VALUE)* ')' -> ^(LIST VALUE+);

VALUE	:	'"' (options {greedy=false;} : .)* '"';

KEY	:	'[' (options {greedy=false;} : .)* ']';

list_op
	:	BETWEEN
	|	NOT_BETWEEN
	|	IN
	|	NOT_IN
	|	CONTAINS
	|	NOT_CONTAINS
	;

unary_op:	NOT;

binary_op
	:	AND
	|	OR
	;

exists_op
	:	EXISTS
	|	NOT_EXISTS
	;

comp	:	EQ
	|	NEQ
	|	GT
	|	LET
	|	GTE
	|	LETE
	;

WS	:	('\t'|'\r'|'\n'|' ')+ { $channel=HIDDEN; };
