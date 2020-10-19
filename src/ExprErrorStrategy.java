import java.util.InputMismatchException;

import javax.management.RuntimeErrorException;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

public class ExprErrorStrategy extends DefaultErrorStrategy{

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
    
    }
    @Override
    public Token recoverInline(Parser arg0) throws RecognitionException {
        
        //System.exit(0);
        return super.recoverInline(arg0);
    }
    @Override
    public void sync(Parser arg0) throws RecognitionException {
        
    }

}
