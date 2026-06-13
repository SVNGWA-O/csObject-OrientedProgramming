package lecture19.activity;

public class NotALetterException extends Exception {

    public NotALetterException(String guess){
        super("Erroneus Guessed " + guess);
    }
}
