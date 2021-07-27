grammar testGrammar;

/*
 * File Contains Lexer and Parser Rules for Decaf Language
 */

/*
 * Lexer Rules
 */

// Keyword specification

// LETTER: [a-zA-Z] ;

fragment LETTER: ('A'..'Z' | 'a' .. 'z') ; 

//DIGIT: [0-9] ; 

fragment DIGIT: '0' .. '9';

ID                  : LETTER (LETTER|DIGIT)*;
NUM                 : DIGIT (DIGIT)*;
CHAR                : LETTER;
WS                  : [ \t\r\n]+ -> skip;

program             : 'class' 'Program' '{' (declaration)* '}';

declaration         : structDeclaration
                    | varDeclaration
                    | methodDeclaration
                    ;

varDeclaration      : varType ID ';' 
                    | varType ID '[' NUM ']' ';'
                    ;

structDeclaration   : 'struct' ID '{' (varDeclaration)* '}' ';'
                    ;

varType             : 'int'
                    | 'boolean'
                    | 'char'
                    | 'struct' ID
                    | structDeclaration
                    | 'void'
                    ;

methodDeclaration   : methodType ID '(' (parameter)* ')' block
                    ;

methodType          : 'int'
                    | 'char'
                    | 'boolean' 
                    | 'void'
                    ;

parameter           : parameterType (ID)?
                    | parameterType ID '[' ']'
                    ;

parameterType       : 'int'
                    | 'char'
                    | 'boolean'
                    | 'void'
                    ;

block               : '{' (varDeclaration)* (statement)* '}'
                    ;

statement           : 'if' '(' expression ')' block ('else' block)?
                    | 'while' '(' expression ')' block
                    | 'return' ( expression )? ';'
                    | methodCall ';'
                    | block
                    | location '=' expression
                    | (expression)? ';'
                    ;

location            : (ID | ID '[' expression ']') ('.' location )?
                    ;

expression          : location
                    | methodCall
                    | literal
                    | expression op expression
                    | '-' expression
                    | '!' expression
                    | '(' expression ')'
                    ;

methodCall          : ID '(' (arg (',')?)* ')'
                    ;

arg                 : expression
                    ;

op                  : arith_op
                    | eq_op
                    | rel_op
                    | cond_op
                    ;

arith_op            : '+'
                    | '-'
                    | '*'
                    | '/'
                    ;

rel_op              : '<'
                    | '>'
                    | '<='
                    | '>='
                    ;

eq_op               : '=='
                    | '!='
                    ;

cond_op             : '&&'
                    | '||'
                    ;

literal             : int_literal 
                    | bool_literal
                    ;

int_literal         : NUM
                    ;

bool_literal        : 'true' | 'false'
                    ;