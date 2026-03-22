package lecture22.activity;
public class NotALetterException extends Exception{

    private String guess;

    public NotALetterException(String guess)
    {
        super("Client guessed something other than a letter: " + guess);
        this.guess = guess;
    }

    public String getGuess(){
        return guess;
    }

}
