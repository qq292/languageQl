grammar Expr;
import commonLexerRules;
/*

def fun(a,b,c){
     a=4
     b=50
     d=0
    if(a==4){
        b++
        for(i=0;i<b;i++){
            d--
        }
        if(d==0){
            x=0
            while(true){
                x++
                if(x==100){
                    break
                }
            }
            return 5
        }elseif(d==6){
            return 6
        }else{
            return 7
        }
    }
    return 0
}
fun()

*/


/*匹配 | 变量赋值 | 函数定义 | if语句 | 函数调用 | while语句 | for语句 |*/
file:  ( varDecl | functionDecl | d_if | callDecl | whilei | d_for )* ; 


//函数调用
callDecl:
        ID '(' exprList? ')' 
        ;

//变量赋值
varDecl:
        ID '=' expr 
        ;

//函数定义
functionDecl:
        'def' ID '(' agsList? ')' d_block
        ;
//形式参数列表
agsList:
        ID (',' ID)*;

// 函数体
d_block:                                          
        '{'  d_stat*    '}' 
        ;
//语句体
d_stat:                                   
        callDecl                          #d_callDecl 
        |d_for                            #d_form
        |whilei                           #d_while
        |varDecl                          #assignment
        |d_if                             #d_ifm        
        |'return' expr?                   #return
        |BREAK                            #ibreak
        ;
//while循环
whilei:  
        WHILE '(' expr ')' d_block
        ;

//if
d_if:     
        'if' '(' expr ')' d_block d_elseif* d_else?
        ;

//elseif
d_elseif: 
        'elseif' '(' expr ')' d_block
        ;
// else
d_else:   
        'else'  d_block
        ;
//for
d_for:
        FOR '(' varDecl ';' expr ';' (varDecl|expr) ')' d_block
        ;
        
//表达式
expr:        
        callDecl                                                #call
        |op=('-'|'+') (INT|ID)                                  #addsubnum
        |ID op=('++'|'--') INT?                                 #addaddsubsub
        |<assoc=right> expr '**' expr                           #power  //乘方
        |expr '%' expr                                          #imodle //取模
        |expr op=('*'|'/') expr                                 #muldiv
        |expr op=('+'|'-') expr                                 #addsub
        |expr op=('=='|'<'|'>'|'!='|'>='|'<=') expr             #relate
        |NULL                                                   #inull
        |TRUE                                                   #itrue
        |FALSE                                                  #ifalse
        |ID                                                     #id
        |INT                                                    #int
        |STRING                                                 #string
        |'(' expr ')'                                           #parens
        ;
//实际参数列表
exprList:
        expr (',' expr)*
        ;
