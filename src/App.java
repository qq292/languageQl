
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

// import java.util.HashMap;

import org.antlr.v4.gui.TestRig;
//TestRig.main(new String[]{"Expr","file","-gui",fileName});
public class App {
    public static void main(String[] args) throws Exception {
        
        String fileName = "C:\\Users\\TR\\Desktop\\testantlr41\\src\\testa.ql";
        // TestRig.main(new String[]{"Expr","file","-gui",fileName});
        CharStream input = CharStreams.fromFileName(fileName);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        ParseTree tree = parser.file();
        
        Myvisitor mv = new Myvisitor();
        mv.visit(tree);
        // System.out.println(5--);
      
        
        
        
    
        // Myvisitor mv = new Myvisitor();
        // mv.visit(tree);


        // ParseTreeWalker walker = new ParseTreeWalker();
        // MyHelloListener mh = new MyHelloListener();
        // walker.walk(mh, tree);
        // System.out.println(mh.getValue());
    }
   
}
