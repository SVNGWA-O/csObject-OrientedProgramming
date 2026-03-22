package lecture19.answers;
public class NotALetterException extends Exception{

    public String badGuess;

    public NotALetterException(String badGuess){
        super("Bad Guess - Not a letter - " + badGuess);
        this.badGuess = badGuess;
    }
}
