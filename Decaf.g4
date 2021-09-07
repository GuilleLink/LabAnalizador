grammar Decaf;

/*
 * File Contains Lexer and Parser Rules for Decaf Language
 */

/*
 * Lexer Rules
 */

// Keyword specification

// fragment
fragment LETTER: ('A'..'Z' | 'a' .. 'z') ; 

fragment DIGIT: '0' .. '9';


ID                  : LETTER (LETTER|DIGIT)*;
NUM                 : DIGIT (DIGIT)*;
CHAR                : LETTER;
WS                  : [ \t\r\n]+ -> skip;
QUOTES              : '"';
APOSTROPHE          : '\'';
CHAR_LITERAL        : ('"' ( LETTER ) '"') | (APOSTROPHE ( LETTER ) APOSTROPHE);


program             : 'class' 'Program' '{' (declaration)* '}';

declaration         : 
                    structDeclaration
                    | varDeclaration
                    | methodDeclaration
                    ;

varDeclaration      : varType ID ';'                                               #varDeclaration_ID
                    | varType ID '[' NUM ']' ';'                                   #varDeclaration_Array
                    ;

structDeclaration   : 'struct' ID '{' (varDeclaration)* '}' 
                    | 'struct' ID '{' (varDeclaration)* '}' ';'
                    ;

varType             : 'int'                                                        #varType_int
                    | 'boolean'                                                    #varType_boolean
                    | 'char'                                                       #varType_char                    
                    | 'struct' ID                                                  #varType_struct
                    | structDeclaration                                            #varType_structDeclaration
                    | 'void'                                                       #varType_void
                    ;

methodDeclaration   : methodType ID '(' 'void'? ')' block
                    | methodType ID '(' parameter (',' parameter)* ')' block
                    ;

methodType          : 'int'                                                        #methodType_int
                    | 'char'                                                       #methodType_char
                    | 'boolean'                                                    #methodType_boolean
                    | 'void'                                                       #methodType_void
                    ;

parameter           : parameterType (ID)?
                    | parameterType ID '[' ']'
                    ;

parameterType       : 'int'                                                        #parameterType_int
                    | 'char'                                                       #parameterType_char
                    | 'boolean'                                                    #parameterType_boolean
                    | 'void'                                                       #parameterType_void
                    ;

block               : '{' (varDeclaration)* (statement)* '}'
                    ;

statement           : 'if' '(' expression ')' block ('else' block)?                #statement_if
                    | 'while' '(' expression ')' block                             #statement_while
                    | 'return' expression ';'                                      #statement_return
                    | methodCall ';'                                               #statement_methodCall
                    | block                                                        #statement_block
                    | location '=' expression ';'                                  #statement_assignValue
                    | location '+=' expression ';'                                 #statement_increment
                    | location '-=' expression ';'                                 #statement_decrement
                    | (expression)? ';'                                            #statement_expression
                    ;

location            : (var_id | array_id) ('.' location )?
                    ;

var_id              : ID;

array_id            : ID '[' int_literal ']';

expression          : location                                                     #expression_location
                    | methodCall                                                   #expression_methodCall
                    | literal                                                      #expression_literal
                    | expression ('*' | '/' | '%') expression                      #expression_firstPrecedence
                    | expression ('+' | '-' ) expression                           #expression_SecondPrecedence
                    | expression op expression                                     #expression_operators
                    | '-' expression                                               #expression_negative_int
                    | '!' expression                                               #expression_negate_bool
                    | '(' expression ')'                                           #expression_parenthesis
                    ;

methodCall          : 
                    ID '(' (expression (',')?)* ')'                            
                    ;

op                  : arith_op
                    | eq_op
                    | rel_op
                    | cond_op
                    ;

arith_op            : '*'
                    | '/'
                    | '%'
                    | '+'
                    | '-'
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