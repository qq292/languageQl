import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import java.lang.reflect.Method;

import org.antlr.v4.runtime.tree.*;



import java.text.DecimalFormat;

public class Myvisitor extends ExprBaseVisitor<Object>{
    
    HashMap<String,Object> file_varList = new HashMap<>();// 全局变量
    HashMap<String,ExprParser.FunctionDeclContext> file_funList = new HashMap<>();//函数名和树（存放所有的函数定义）
    HashMap<String,Object> local_funAgsList;//函数调用状态
    HashMap<String,Object> dif_ifStat;//if调用状态
    HashMap<String,Object> dif_elseifStat;//elseif调用状态
    HashMap<String,Object> dif_elseStat;//else调用状态
    HashMap<String,Object> while_Stat;//while调用状态
    HashMap<String,Object> for_Stat;//for调用状态
    String FUNCTION=null;

    public static void exitPrint(Object s){
        System.out.println(s);
        System.out.print("\n进程结束，退出代码为1");
        System.exit(1);
    }

    public Object addMyID(String id, Object value){
        //for_Stat
        if(for_Stat!=null){
            for_Stat.put(id, value);
            //return null;
        }

        //while_Stat
        if(while_Stat!=null){
            while_Stat.put(id, value);
            //return null;
        }


        //delse_stat
        if(dif_elseStat!=null){
            dif_elseStat.put(id, value);
            //return null;
        }


        //delseif_stat
        if(dif_elseifStat!=null){
            dif_elseifStat.put(id, value);
            //return null;
        }


        //dif_stat
        if(dif_ifStat!=null){
            dif_ifStat.put(id, value);
            //return null;
        }

        
        //局部
        if(local_funAgsList!=null){
            local_funAgsList.put(id, value);
            //return null;
        }
        //全局
        if(file_varList!=null){
            file_varList.put(id, value);
        }
        return value;
    }


    // varDecl:

    //     ID '=' expr 
    //     ;
    @Override
    public Object visitVarDecl(ExprParser.VarDeclContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expr());
        return addMyID(id,value);
    }

    // |expr op=('*'|'/') expr         #muldiv
    @Override
    public Object visitMuldiv(ExprParser.MuldivContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        
        if(ctx.op.getType()==ExprLexer.MUL){
            if(left instanceof Double && right instanceof Double){
                return (Double)left*(Double)right;
            }else if(left instanceof Double && right instanceof String){
                if((double)left==0){
                    return "";
                }else if((double)left==1){
                    return right;
                }else{
                    int lop = (int)(double)left;
                    String ms="";
                    for(int i=0;i<lop;i++){
                        ms=ms+(String)right;
                        
                    }
                    return ms;
                }
            }else if(left instanceof String && right instanceof Double){
                if((double)right==0){
                    return "";
                }else if((double)right==1){
                    return left;
                }else{
                    int lop = (int)(double)right;
                    String ms="";
                    for(int i=0;i<lop;i++){
                        ms=ms+(String)left;
                        
                    }
                    return ms;
                }

                
            }


            
        }
        return (double)left/(double)right;
    }
    //|ID op=('++'|'--') INT?                                 #addaddsubsub
    @Override
    public Object visitAddaddsubsub(ExprParser.AddaddsubsubContext ctx) {
        String id = ctx.ID().getText();
        Object value = getMyId(id);
        double u = 1;
        if(ctx.INT()!=null){
            u = Double.valueOf(ctx.INT().getText());
        }
        
        if(ctx.op.getType()==ExprLexer.ADDADD){
            return addMyID(id, (double)value+u);
        }else{
            return addMyID(id, (double)value-u);
        }
        
    }

   


    //|expr op=('+'|'-') expr         #addsub
    @Override
    public Object visitAddsub(ExprParser.AddsubContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        if(ctx.op.getType()==ExprLexer.ADD){
            if(left instanceof ArrayList || right instanceof ArrayList){
                exitPrint("[行:"+ctx.op.getLine()+"]"+"list类型不能做 + 运算");
                return null;
            }


            if(left instanceof Double && right instanceof Double){
                return (double)left+(double)right;
            }else if(left instanceof String && right instanceof String){
                return (String)left+(String)right;
            }else{
                String ls="";
                String rs="";
                if(left instanceof Double){
                    if((double)left%1==0){
                        ls=String.valueOf((int)(double)left);
                        
                    }else{
                        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");//格式化设置
                        ls=decimalFormat.format(left);
                    }

                }else{
                    ls=(String)left;
                }

                if(right instanceof Double){
                    if((double)right%1==0){
                        rs=String.valueOf((int)(double)right);
                        
                    }else{
                        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");//格式化设置
                        rs=decimalFormat.format(right);
                    }

                }else{
                    rs=(String)right;
                }


                return ls+rs;
                
               // System.out.println("[行:"+ctx.op.getLine()+"]"+"类型错误无法计算：+");
            
    
            }
            
        }
        if(!(left instanceof Double && right instanceof Double)){
            exitPrint("[行:"+ctx.op.getLine()+"]"+" + 运算只允许 int 类型");
            return null;
        }
        return (double)left-(double)right;
    }
    //|expr '%' expr                                          #imodle //取模
    @Override
    public Object visitImodle(ExprParser.ImodleContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        if(left instanceof Double && right instanceof Double){
            return (double)left % (double)right;
        }else{
            exitPrint("[行:"+ctx.MOULD().getSymbol().getLine()+"]"+"类型不符需要 int");
        }
        return null;
    }

    //|expr op=('=='|'<'|'>'|'!='|'>='|'<=') expr             #relate
    @Override
    public Object visitRelate(ExprParser.RelateContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        String line = String.valueOf(ctx.op.getLine());
        switch(ctx.op.getType()){
            case ExprLexer.EQUAL://==
                if(left instanceof String && right instanceof String){
                    return left.equals(right);
                }else if(left instanceof Double && right instanceof Double){
                    return (double)left == (double)right;
                }else{
                    return left == right;
                }
            
            case ExprLexer.LESS://<
                if(left instanceof Double && right instanceof Double){
                    return (double)left<(double)right;
                }else{
                    exitPrint("[行:"+line+"]"+"类型不符合 <");
                }
                break;
            case ExprLexer.GREATER://>
                if(left instanceof Double && right instanceof Double){
                    return (double)left>(double)right;
                }else{
                    exitPrint("[行:"+line+"]"+"error类型不符合 >");
                }
                break;
            case ExprLexer.UNEQUAL:// !=
                if(left instanceof Double && right instanceof Double){
                    return (double)left!=(double)right;
                }else{
                    return left != right;
                }
            case ExprLexer.GREATER_EQUAL:// >=
                if(left instanceof Double && right instanceof Double){
                    return (double)left>=(double)right;
                }else{
                    exitPrint("[行:"+line+"]"+"error类型不符合 >=");
                }
                break;
            case ExprLexer.LESS_EQUAL:// <=
                if(left instanceof Double && right instanceof Double){
                    return (double)left<=(double)right;
                }else{
                    exitPrint("[行:"+line+"]"+"error类型不符合 <=");
                }
                break;  
        }


       return false;
        
    
    }

    public Object getMyId(String id){
                //for_Stat
                if(for_Stat!=null){
                    if(for_Stat.containsKey(id)){
                        return for_Stat.get(id);
                    }
                }
        
        
                //while_Stat
                if(while_Stat!=null){
                    if(while_Stat.containsKey(id)){
                        return while_Stat.get(id);
                    }
                }
        
        
                //delse_stat
                if(dif_elseStat!=null){
                    if(dif_elseStat.containsKey(id)){
                        return dif_elseStat.get(id);
                    }
                }
        
                
                //delseif_stat
                if(dif_elseifStat!=null){
                    if(dif_elseifStat.containsKey(id)){
                        return dif_elseifStat.get(id);
                    }
                    
                }
        
        
                //dif_stat
                if(dif_ifStat!=null){
                    if(dif_ifStat.containsKey(id)){
                        return dif_ifStat.get(id);
                    }
                }
        
        
        
                //局部
                if(local_funAgsList!=null){
                    if(local_funAgsList.containsKey(id)){
                        return local_funAgsList.get(id);
                    }
                }
        
                //全局
                if(file_varList.containsKey(id)){
                    return file_varList.get(id);
                }
                return null;
    }

    //|ID                             #id
    @Override
    public Object visitId(ExprParser.IdContext ctx) {
        String id = ctx.ID().getText();

        //for_Stat
        if(for_Stat!=null){
            if(for_Stat.containsKey(id)){
                return for_Stat.get(id);
            }
        }


        //while_Stat
        if(while_Stat!=null){
            if(while_Stat.containsKey(id)){
                return while_Stat.get(id);
            }
        }


        //delse_stat
        if(dif_elseStat!=null){
            if(dif_elseStat.containsKey(id)){
                return dif_elseStat.get(id);
            }
        }

        
        //delseif_stat
        if(dif_elseifStat!=null){
            if(dif_elseifStat.containsKey(id)){
                return dif_elseifStat.get(id);
            }
            
        }


        //dif_stat
        if(dif_ifStat!=null){
            if(dif_ifStat.containsKey(id)){
                return dif_ifStat.get(id);
            }
        }



        //局部
        if(local_funAgsList!=null){
            if(local_funAgsList.containsKey(id)){
                return local_funAgsList.get(id);
            }
        }

        //全局
        if(file_varList.containsKey(id)){
            return file_varList.get(id);
        }
        exitPrint("[行:"+ctx.ID().getSymbol().getLine()+"] "+"未定义的变量："+id);
        return null;
    }
    //|INT                            #int
    @Override
    public Object visitInt(ExprParser.IntContext ctx) {
        return Double.valueOf(ctx.INT().getText());

    }
    // |STRING                         #string
    @Override
    public Object visitString(ExprParser.StringContext ctx) {
        String s = ctx.STRING().getText();
        
        return s.substring(1,s.length()-1);
    }

    //|NULL                                                   #inull
    @Override
    public Object visitInull(ExprParser.InullContext ctx) {
        return null;
    }
    //|TRUE                                                   #itrue
    @Override
    public Object visitItrue(ExprParser.ItrueContext ctx) {
        return true;
    }
    //|FALSE                                                  #ifalse
    @Override
    public Object visitIfalse(ExprParser.IfalseContext ctx) {
        return false;
    }

    //|op=('-'|'+') (INT|ID)                                  #addsubnum
    @Override
    public Object visitAddsubnum(ExprParser.AddsubnumContext ctx) {
        Double value;
        if(ctx.INT()!=null){
            value = Double.valueOf(ctx.INT().getText());
        }else{
            value = (Double)getMyId(ctx.ID().getText());
        }

        if(ctx.op.getType()==ExprLexer.ADD){
            return value;
        }else{
            return value*-1;
        }
    }


    //|<assoc=right> expr '**' expr    #power
    @Override
    public Object visitPower(ExprParser.PowerContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        return Math.pow((double)left, (double)right);
    }
   


    //|'(' expr ')'                   #parens
    @Override
    public Object visitParens(ExprParser.ParensContext ctx) {
        return visit(ctx.expr());    
    }

    // callDecl:
    //     ID '(' exprList? ')' 
    //     ;
    @Override //函数调用
    public Object visitCallDecl(ExprParser.CallDeclContext ctx) {
        String fName = ctx.ID().getText();
        HashMap<String,Object> upStat=new HashMap<>();
        ArrayList<Object> exprList = new ArrayList<>();//实参
        ArrayList<String> agsl = new ArrayList<>();//形参
        if(local_funAgsList==null){
            local_funAgsList = new HashMap<>();//函数调用状态
        }else{
            //保存上一个函数的调用状态
            upStat=local_funAgsList;
        }
        
        //实参
        if(ctx.exprList()!=null){
            exprList = (ArrayList)visit(ctx.exprList());
        }


        //print 函数
        if(fName.equals("sleep")){
            if(exprList.size()==0){
                try{
                    Thread.sleep(1);
                }catch(Exception e){
                    e.printStackTrace();
                }
                //aggregateResult(aggregate, nextResult)
            }


        }else if(fName.equals("print")){
            if(exprList.size()==0){
                System.out.println();
            }else{
                for(Object ob:exprList){
                    

                    if(ob instanceof Double){
                        if((double)ob%1==0){
                            System.out.print((int)(double)ob);
                        }else{
                            System.out.print(ob);
                        }
                    }else if(ob instanceof String){
                         System.out.print((((String)ob).replaceAll("\\\\t","\t")).replace("\\n", "\n"));
                     }else{
                        
                        System.out.print(ob);
                    } 
                }
            }
            
        }else if(fName.equals("println")){
            if(exprList.size()==0){
                System.out.println();
            }else{
                for(Object ob:exprList){
            
                    if(ob instanceof Double){
                        if((double)ob%1==0){
                            System.out.println((int)(double)ob);
                        }else{
                            System.out.println(ob);
                        }
                    }else if(ob instanceof String){
                         System.out.println((((String)ob).replaceAll("\\\\t","\t")).replace("\\n", "\n"));
                     }else{
                        
                        System.out.println(ob);
                    } 
                }

            }
            
            //调用函数
        }else if(file_funList.containsKey(fName)){
            ExprParser.FunctionDeclContext funCtx = file_funList.get(fName);//函数树节点
            //型参
            if(funCtx.agsList()!=null){
                agsl = (ArrayList)visit(funCtx.agsList());
            }
            
            
            //型实结合
            if(agsl.size()==exprList.size()){
                for(int i=0;i<agsl.size();i++){
                    local_funAgsList.put(agsl.get(i), exprList.get(i));
                }
                
            }else{
                
                exitPrint("[行:"+ctx.ID().getSymbol().getLine()+"] "+fName+" 实参和形参数量不符合");
                return null;
            }
            
            
            //执行函数体里面的所有语句
            for(ExprParser.D_statContext stat:funCtx.d_block().d_stat()){
                
                Object mReturn = visit(stat);
                if(mReturn!=null){
                    //函数调用结束 返回上一个函数调用状态
                    if(!upStat.isEmpty()){
                        local_funAgsList=upStat;
                    }else{
                        local_funAgsList = null;
                    }
                    
                    return mReturn;
                }
            
            }

        }else{
            exitPrint("[行:"+ctx.ID().getSymbol().getLine()+"] "+"找不到函数："+ fName);
        }

         //函数调用结束 返回上一个函数调用状态
         if(!upStat.isEmpty()){
            local_funAgsList=upStat;
        }else{
            local_funAgsList = null;
        }
        return null;
    }

    

    //varDecl                          #assignment
    @Override
    public Object visitAssignment(ExprParser.AssignmentContext ctx) {
        
        visit(ctx.varDecl());
        return null;
    }

    // |'return' expr?                  #return
    @Override
    public Object visitReturn(ExprParser.ReturnContext ctx) {
        if(ctx.expr()==null)return null;
        return visit(ctx.expr());
    }

    // exprList:
    //     expr (',' expr)*
    //     ;
    @Override
    public Object visitExprList(ExprParser.ExprListContext ctx) {
        ArrayList<Object> expclist = new ArrayList<>();
        for(ExprParser.ExprContext iexpc : ctx.expr()){
            expclist.add(visit(iexpc));
        }
        
        return expclist;
    }

    // functionDecl:
    //     'def' ID '(' agsList? ')' d_block
    @Override //函数定义
    public Object visitFunctionDecl(ExprParser.FunctionDeclContext ctx) {
        String funName = ctx.ID().getText();
        // HashMap<String,Object> agsl = (HashMap)visit(ctx.agsList());
        file_funList.put(funName, ctx);
        // file_funAgsList.put(funName, agsl);//型参map
        return null;
    }

    // agsList:
    //     ID (',' ID)*;
    @Override
    public Object visitAgsList(ExprParser.AgsListContext ctx) {
        ArrayList<String> agsList = new ArrayList<>();
        for(TerminalNode et:ctx.ID()){
            agsList.add(et.getText());
        }
        
        return agsList;//形式参数
    }
    
    // callDecl                          #d_callDecl 
    @Override
    public Object visitD_callDecl(ExprParser.D_callDeclContext ctx) {
        return visit(ctx.callDecl());
    }
    //call
    @Override
    public Object visitCall(ExprParser.CallContext ctx) {
        return visit(ctx.callDecl());
    }
    //|d_if                            #d_ifm   
    @Override
    public Object visitD_ifm(ExprParser.D_ifmContext ctx) {
        
        return visit(ctx.d_if());
    }



    // 函数里面的if
    // d_if:     'if' '(' expr ')' d_block d_elseif* d_else?
    // ;
    @Override
    public Object visitD_if(ExprParser.D_ifContext ctx) {
        HashMap<String,Object> updifStat = new HashMap<>();
        if(dif_ifStat==null){
            dif_ifStat = new HashMap<>();//调用状态
        }else{
            updifStat = dif_ifStat; //保存上一个调用状态
        }

        Object value=visit(ctx.expr());
        if((boolean)value){ //非0或true为真
            // if 段
            for(ExprParser.D_statContext dst: ctx.d_block().d_stat()){
                Object vlu=visit(dst);//遇到return 语句返回结果
                if(vlu!=null){
                    if(!updifStat.isEmpty()){
                        dif_ifStat = updifStat;//返回上一次调用状态
                    }else{
                        dif_ifStat = null;
                    }
                    return vlu;
                }
            }
            //if 函数体执行完，不往下执行了
            if(!updifStat.isEmpty()){
                dif_ifStat = updifStat;//返回上一次调用状态
            }else{
                dif_ifStat = null;
            }
            return null;
        }
           
        // elseif 段
        for(ExprParser.D_elseifContext elif:ctx.d_elseif()){
            Object reelif = visit(elif);

            if(reelif!=null){
                if(reelif instanceof Character){
                    if((char)reelif==(char)1){
                        return null;
                    }
                }


                if(!updifStat.isEmpty()){
                    dif_ifStat = updifStat;
                }else{
                    dif_ifStat = null;
                }
                return reelif;
            }

            

        }
           

        
        //else 段
        if(ctx.d_else()!=null){
            Object vlu = visit(ctx.d_else());
            if(vlu!=null){
                if(!updifStat.isEmpty()){
                    dif_ifStat = updifStat;
                }else{
                    dif_ifStat = null;
                }
                return vlu;
            }
        }
        



        if(!updifStat.isEmpty()){
            dif_ifStat = updifStat;
        }else{
            dif_ifStat = null;
        }
        return null;
    }

    //d_elseif: 'elseif' '(' expr ')' d_block
    @Override
    public Object visitD_elseif(ExprParser.D_elseifContext ctx) {
        HashMap<String,Object> updelseifStat = new HashMap<>();
        if(dif_elseifStat==null){
            dif_elseifStat = new HashMap<>();//调用状态
        }else{
            updelseifStat = dif_elseifStat; //保存上一个调用状态
        }


        Object value=visit(ctx.expr());
        if((boolean)value){ //非0或true为真
            for(ExprParser.D_statContext dst: ctx.d_block().d_stat()){
                Object vlu=visit(dst);//遇到return 语句返回结果
                if(vlu!=null){
                    if(!updelseifStat.isEmpty()){
                        dif_elseifStat = updelseifStat;//返回上一次调用状态
                    }else{
                        dif_elseifStat = null;
                    }
                    return vlu;
                }
            }
            //不执行下一个
            if(!updelseifStat.isEmpty()){
                dif_elseifStat = updelseifStat;//返回上一次调用状态
            }else{
                dif_elseifStat = null;
            }
            return (char)1;

        }

        if(!updelseifStat.isEmpty()){
            dif_elseifStat = updelseifStat;//返回上一次调用状态
        }else{
            dif_elseifStat = null;
        }
        return null;
    }
    
    //d_else:   'else'  d_block
    @Override
    public Object visitD_else(ExprParser.D_elseContext ctx) {
        HashMap<String,Object> updelseStat = new HashMap<>();
        if(dif_elseStat==null){
            dif_elseStat = new HashMap<>();//调用状态
        }else{
            updelseStat = dif_elseStat; //保存上一个调用状态
        }
        for(ExprParser.D_statContext dec:ctx.d_block().d_stat()){
            Object vlu = visit(dec);
            if(vlu!=null){
                if(!updelseStat.isEmpty()){
                    dif_elseStat = updelseStat;
                }else{
                    dif_elseStat=null;
                }
                return vlu;
            }
        }
        if(!updelseStat.isEmpty()){
            dif_elseStat = updelseStat;
        }else{
            dif_elseStat=null;
        }


        return null;
    }
    //FOR '(' varDecl ';' expr ';' (varDecl|expr) ')' d_block
    @Override
    public Object visitD_for(ExprParser.D_forContext ctx) {
        HashMap<String,Object> uPfor_Stat = new HashMap<>();
        if( for_Stat==null){
            for_Stat = new HashMap<>();
            
            visit(ctx.varDecl(0)); //第一次 设置初始值
        }else{
            uPfor_Stat=for_Stat;
            
            if(visit(ctx.varDecl(0).ID())==null){
                //存到全局变量 (不污染 for_Stat)
                file_varList.put(ctx.varDecl(0).ID().getText(), visit(ctx.varDecl(0).expr()));
            }
            
            
        }
        Object value =visit(ctx.expr(0)); //计算逻辑值
        
        if((boolean)value){
        
            for(ExprParser.D_statContext dst : ctx.d_block().d_stat()){//依次执行所有语句
                Object vlu = visit(dst);
                if(vlu!=null){
                    if(vlu instanceof ExprParser.IbreakContext){
                        //退出 for
                        if(!uPfor_Stat.isEmpty()){
                            for_Stat = uPfor_Stat;
                        }else{
                            for_Stat=null;
                        }
                        visit(ctx.varDecl(0));//重置初始值
                        return null;
                    }
                    //退出 函数
                    if(!uPfor_Stat.isEmpty()){
                        for_Stat = uPfor_Stat;
                    }else{
                        for_Stat=null;
                    }
                    visit(ctx.varDecl(0));//重置初始值
                    return vlu;
                    
                }
            }
            if(ctx.expr(1)!=null){
                 visit(ctx.expr(1)); //循环完 对变量的操作
            }else{
                 visit(ctx.varDecl(1)); //循环完 对变量的操作
            }
            
            
        }else{
            if(!uPfor_Stat.isEmpty()){
                for_Stat = uPfor_Stat;
            }else{
                for_Stat=null;
            }
            visit(ctx.varDecl(0));//重置初始值
            return null;
        }
        //visit(ctx);
        Object vlu =visit(ctx);
        if(vlu!=null){
            if(!uPfor_Stat.isEmpty()){
                for_Stat = uPfor_Stat;
            }else{
                for_Stat=null;
            }
            visit(ctx.varDecl(0));
            return vlu;
        }

        if(!uPfor_Stat.isEmpty()){
            for_Stat = uPfor_Stat;
        }else{
            for_Stat=null;
        }
        visit(ctx.varDecl(0));
        return null;


        
    }

    //|d_for                            #d_form
    @Override
    public Object visitD_form(ExprParser.D_formContext ctx) {
        Object value = visit(ctx.d_for());
        if(value!=null){
           //System.out.println(""+value);
            return value;
        }else{
            return null;
        }
    }

    //|whilei                            #d_while
    @Override
    public Object visitD_while(ExprParser.D_whileContext ctx) {
        Object value = visit(ctx.whilei());
        if(value!=null){
           // System.out.println(value);
            return value;
        }else{
            return null;
        }
    
    }
    
    //whilei:  WHILE '(' expr ')' d_block
    @Override
    public Object visitWhilei(ExprParser.WhileiContext ctx) {
        HashMap<String,Object> uPwhile_Stat = new HashMap<>();
        Object value = visit(ctx.expr());
        if(!(value instanceof Boolean)){
            exitPrint(String.format("[行:%s] while的条件必须为逻辑值", ctx.expr().start.getLine()));
            
        }

        if( while_Stat==null){
            while_Stat = new HashMap<>();
        }else{
            uPwhile_Stat=while_Stat;
        }

        if((boolean)value){
            for(ExprParser.D_statContext dst : ctx.d_block().d_stat()){//依次执行所有语句
                Object vlu = visit(dst);
                if(vlu!=null){
                    if(vlu instanceof ExprParser.IbreakContext){
                        //退出 while
                        if(!uPwhile_Stat.isEmpty()){
                            while_Stat = uPwhile_Stat;
                        }else{
                            while_Stat=null;
                        }

                        return null;
                    }
                    //退出 函数
                    if(!uPwhile_Stat.isEmpty()){
                        while_Stat = uPwhile_Stat;
                    }else{
                        while_Stat=null;
                    }
                    return vlu;
                    
                }
            }
            
        }else{
            if(!uPwhile_Stat.isEmpty()){
                while_Stat = uPwhile_Stat;
            }else{
                while_Stat=null;
            }
            return null;
        }
        //visit(ctx);
        Object vlu =visit(ctx);
        if(vlu!=null){
            if(!uPwhile_Stat.isEmpty()){
                while_Stat = uPwhile_Stat;
            }else{
                while_Stat=null;
            }
            return vlu;
        }

        if(!uPwhile_Stat.isEmpty()){
            while_Stat = uPwhile_Stat;
        }else{
            while_Stat=null;
        }
        return null;
        
    }

     // |BREAK                            #ibreak
    @Override
    public Object visitIbreak(ExprParser.IbreakContext ctx) {
        return ctx;
    }
    // |'[' expr (',' expr)* ']'                               #list
    @Override
    public Object visitList(ExprParser.ListContext ctx) {
        ArrayList<Object> arraylist = new ArrayList<>();
        for(ExprParser.ExprContext ls:ctx.expr()){
            arraylist.add(visit(ls));
        
        }
        
        return arraylist;
    }
    //|expr '[' (expr) ']'  ('=' expr)?                     #listnum
    @Override
    public Object visitListnum(ExprParser.ListnumContext ctx) {
        Object list =visit(ctx.expr(0));
        int lien = ctx.expr(0).start.getLine();
        Object index=visit(ctx.expr(1));
        if(!(index instanceof Double)){
            exitPrint("[行:"+lien+"]"+"不是int ");
            return null;
        }

        if(!(list instanceof ArrayList) ){
            exitPrint("[行:"+lien+"]"+"不是list ");
            return null;
        }
        try{
            if(ctx.expr(2)!=null){
                ((ArrayList<Object>)list).set((int)(double)index,visit(ctx.expr(2)));
                return null;
            }else{
                return ((ArrayList<Object>)list).get((int)(double)index);
            }
        }catch(IndexOutOfBoundsException e){
            exitPrint("[行:"+lien+"]"+"下标越界错误 ");
            return null;
        }
        

        
    }
    //|expr '~~'                                              #getlen //取对象长度
    @Override
    public Object visitGetlen(ExprParser.GetlenContext ctx) {
        Object value =visit(ctx.expr());
        if(value instanceof HashMap){
            return (double)((HashMap<Object,Object>)value).size();
        }else if(value instanceof String){
            return (double)((String)value).length();
        }else if(value instanceof ArrayList){
            return (double)((ArrayList)value).size();
        }else{
            exitPrint("[行:"+ctx.expr().getStart().getLine()+"]"+"此对象不支持取长度运算符 ~~");
            return null;
        }
        
    }
    //|'{' expr ':' expr  (',' expr ':' expr)*  '}'           #dict
    @Override
    public Object visitDict(ExprParser.DictContext ctx) {
        HashMap<Object,Object> dict = new HashMap();
        int size=ctx.expr().size();
        for(int i=0;i<size;i=i+2){
            dict.put(visit(ctx.expr(i)),visit(ctx.expr(i+1)));
        }

        return dict;
    }
    //|expr '.' ID '(' exprList ')'                           #callMethod
    @Override
    public Object visitCallMethod(ExprParser.CallMethodContext ctx) {
        Object v = visit(ctx.expr());
        String id = ctx.ID().getText();
        ArrayList<Object> ags = (ArrayList)visit(ctx.exprList());
        int agslen = ags.size();

        if(v instanceof HashMap){
            switch(id){
                case "get":
                   return  ((HashMap<Object,Object>)v).get(ags.get(0));
                    
                case "remove":
                    ((HashMap<Object,Object>)v).remove(ags.get(0));
                    return null;
                case "put":
                    ((HashMap<Object,Object>)v).put(ags.get(0),ags.get(1));
                    return null;
                case "clear": 
                     ((HashMap<Object,Object>)v).clear();
                     return null;
            }
        }else if(v instanceof ArrayList){
            switch(id){
                case "get":
                    if(!(ags.get(0) instanceof Double))exitPrint(String.format("[行:%s] list get方法参数必须为int类型",ctx.exprList().start.getLine()));
                    return ((ArrayList<Object>)v).get((int)(double)ags.get(0));
            }
        }
            
        return null;
    }

}
