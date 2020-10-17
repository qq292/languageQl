// import java.util.HashMap;

// public class MyListener extends ExprBaseListener {

//     //全局 函数名和树的映射 file
//     public HashMap<String,ExprParser.FunctionDeclContext> fileFunctionDecl= new HashMap<>();
//     public HashMap<String,ExprParser.VarDeclContext> fileVarDecl= new HashMap<>();
//     public Object expr_value=0;
//     public HashMap<String,Object> file_varList = new HashMap<>();


//     //|expr op=('*'|'/') expr         #muldiv
//     @Override
//     public void enterMuldiv(ExprParser.MuldivContext ctx) {
//         if(ctx.op.getType()==ExprLexer.MUL){
//             expr_value =  Integer.valueOf(ctx.expr(0).getText())*Integer.valueOf(ctx.expr(1).getText());
//         }else{
//             expr_value =  Integer.valueOf(ctx.expr(0).getText())/Integer.valueOf(ctx.expr(1).getText());
//         }

//     }


//     //|expr op=('+'|'-') expr         #addsub
//     @Override
//     public void enterAddsub(ExprParser.AddsubContext ctx) {
    
//         if(ctx.op.getType()==ExprLexer.ADD){
//             expr_value =  Integer.valueOf(ctx.expr(0).getText())+Integer.valueOf(ctx.expr(1).getText());
//         }else{
//             expr_value =  Integer.valueOf(ctx.expr(0).getText())-Integer.valueOf(ctx.expr(1).getText());
//         }

//     }

//     //|expr '==' expr                 #relate
//     @Override
//     public void enterRelate(ExprParser.RelateContext ctx) {
        
//         if(ctx.expr(0)==ctx.expr(1)){
//             expr_value=true;
//         }else{
//             expr_value=false;
//         }

//     }

//     //|ID                             #id
//     @Override
//     public void enterId(ExprParser.IdContext ctx) {
//         String id = ctx.ID().getText();
//         if(file_varList.containsKey(id)){
//             expr_value = file_varList.get(id);
//         }
//         expr_value = 0;
//     }


//     //|INT                            #int
//     @Override
//     public void enterInt(ExprParser.IntContext ctx) {
//         expr_value = Integer.valueOf(ctx.INT().getText());
//     }

//     //|STRING                         #string
//     @Override
//     public void enterString(ExprParser.StringContext ctx) {
//         expr_value = ctx.STRING().getText();
//     }

//     // |'(' expr ')'                   #parens
//     @Override
//     public void enterParens(ExprParser.ParensContext ctx) {
//         expr_value = ctx.expr();
//     }

//     // varDecl:

//     //     ID '=' expr 
//     //     ;
//     @Override
//     public void enterVarDecl(ExprParser.VarDeclContext ctx) {
//         String id = ctx.ID().getText();
//         Object sd = ctx.accept(ctx.expr());
        
//         Object value = ctx.expr();
//         file_varList.put(id, value);
//     }
    
//     @Override
//     public void enterPrint(ExprParser.PrintContext ctx) {
//         String id = ctx.ID().getText();
//         if(file_varList.containsKey(id)){
//             System.out.println(file_varList.get(id));
//         }else{
//             System.out.println("没有找到变量："+id);
//         }

//     }



//     // file:  (varDecl|functionDecl|ifDecl)+ ;
//     @Override public void enterFile(ExprParser.FileContext ctx) { 
             
//         for(ExprParser.FunctionDeclContext fd:ctx.functionDecl()){
//             fileFunctionDecl.put(fd.ID().getSymbol().getText(),fd);

//         }
//         for(ExprParser.VarDeclContext fd:ctx.varDecl()){
//             fileVarDecl.put(fd.ID().getSymbol().getText(),fd);
//         }
            
            
//     }


//     @Override public void exitFile(ExprParser.FileContext ctx) {


//      }
    
    
// }
