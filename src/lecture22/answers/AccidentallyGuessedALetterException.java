package lecture22.answers;
public class AccidentallyGuessedALetterException extends Exception{

    private String theLetter;
    public AccidentallyGuessedALetterException(String theLetter){
        this.theLetter = theLetter;
    }

    public String getTheLetter() { return theLetter;}
}
