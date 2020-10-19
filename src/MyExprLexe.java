

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;

public class MyExprLexe extends ExprLexer {
    public MyExprLexe(CharStream input) {
		super(input);
    }
    
    @Override
    public void recover(LexerNoViableAltException e) {
        Myvisitor.exitPrint(e);
    }
}
