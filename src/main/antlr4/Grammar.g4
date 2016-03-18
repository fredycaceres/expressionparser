grammar Grammar;

@header {
package org.example.expression.antlr;
}

@rulecatch {
/*catch (RecognitionException e) {
	throw e;
}*/
}
/* Lexical rules*/

	NOT		: 'NOT';
	AND		: 'AND';
	OR		: 'OR';
	EQ		: '=';
	NEQ		: '!=';
	GT		: '>';
	GTE		: '>=';
	LET		: '<';
	LETE	: '<=';
	IN		: 'IN';
	NOT_IN		: 'NOT_IN';
	BETWEEN		: 'BETWEEN';
	NOT_BETWEEN	: 'NOT_BETWEEN';
	CONTAINS	: 'CONTAINS';
	NOT_CONTAINS	: 'NOT_CONTAINS';
	EXISTS		: 'EXISTS';
	NOT_EXISTS	: 'NOT_EXISTS';
	LIST		: 'LIST';
	ENTITY		: 'ENTITY';
    LBRACK      : '[';
    RBRACK      : ']';

 /* Parser rules*/

expression: single_expr EOF;

single_expr: expr2 (OR expr2)*;

expr2: expr3 (AND expr3)*;

expr3: (unary_op)? expr4;

expr4: entity
| pexpr
;

pexpr: '(' single_expr ')';

entity	:	KEY comp singlelist
	|	KEY list_op list
	|	KEY exists_op nolist
	;

nolist	:	(WS)?;

singlelist
	:	VALUE;

list	:	'(' VALUE (',' VALUE)* ')';

VALUE	:	'"'([a-zA-Z0-9])+'"';

KEY	:	'[' ('A'..'Z' | 'a'..'z' | ' ')+ ']';

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

WS	:	[ \r\t\u000C\n]+ -> skip ;
