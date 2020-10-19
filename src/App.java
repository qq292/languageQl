
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.HashMap;

// import java.util.HashMap;

import org.antlr.v4.gui.TestRig;
//TestRig.main(new String[]{"Expr","file","-gui",fileName});
public class App {
    public static void main(String[] args) throws Exception {
        
        //要执行的文件名字
        String fileName = "C:\\Users\\TR\\Desktop\\testantlr41\\src\\testa.ql";
        // TestRig.main(new String[]{"Expr","file","-gui",fileName});
        CharStream input = CharStreams.fromFileName(fileName);
        ExprLexer lexer = new MyExprLexe(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        parser.removeErrorListeners();
        parser.setErrorHandler(new ExprErrorStrategy());
        parser.addErrorListener(new ExprErrorListener());
        ParseTree tree = parser.file();
        Myvisitor myvisitor = new Myvisitor();
        myvisitor.visit(tree);


        // System.out.println(5--);
        // HashMap<Object,Object> a = new HashMap<>();
        // a.getClass().getMethod("put", a.getClass());
        // class.getMethod("put",a);

        // System.out.println();
        // Myvisitor mv = new Myvisitor();
        // mv.visit(tree);
        // ParseTreeWalker walker = new ParseTreeWalker();
        // MyHelloListener mh = new MyHelloListener();
        // walker.walk(mh, tree);
        // System.out.println(mh.getValue());
    }
   
}
