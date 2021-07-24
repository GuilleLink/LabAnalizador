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

fragment DIGIT: '0' .. '9' ;

id                  : LETTER (LETTER|DIGIT)*;
num                 : DIGIT (DIGIT)*;
char                : LETTER;

program             : 'class' 'Program' '{' (declaration)* '}';

declaration         : structDeclaration
                    | varDeclaration
                    | methodDeclaration
                    ;

structDeclaration   : 'struct' id '{' (varDeclaration)* '}'
                    ;

varDeclaration      : varType id ';' 
                    ;

varType             : 'int'
                    | 'boolean'
                    | 'char'
                    | 'struct' id
                    ;

location            : (id | id '[' expression ']')
                    ;

methodDeclaration   : methodType id '(' (parameter)* ')' block
                    ;

methodType          : 'int'
                    | 'char'
                    | 'boolean' 
                    | 'void'
                    ;

parameter           : parameterType id
                    ;

parameterType       : 'int'
                    | 'char'
                    | 'boolean'
                    ;

block               : '{' (varDeclaration)* (statement)* '}'
                    ;

statement           : 'if' '(' expression ')' block ['else' block]
                    ;

expression          : location
                    | methodCall
                    | literal
                    | expression op expression
                    | '-' expression
                    | '!' expression
                    | '(' expression ')'
                    ;

methodCall          : id '(' (arg (',')?)* ')'
                    ;

arg                 : expression
                    ;

op                  : arith_op
                    | eq_op
                    ;

arith_op            : '+'
                    | '-'
                    | '*'
                    | '/'
                    ;

eq_op               : '=='
                    | '!='
                    ;

literal             : int_literal 
                    | bool_literal
                    ;

int_literal         : num
                    ;

bool_literal        : 'true' | 'false'
                    ;