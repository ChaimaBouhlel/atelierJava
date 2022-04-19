public class CompteException extends Exception{
    String motif;
    CompteException(String s) {
        super(s);
        motif=s;
    }
}
