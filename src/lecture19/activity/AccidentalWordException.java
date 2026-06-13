package lecture19.activity;

public class AccidentalWordException extends Exception {
   private String word;



    public AccidentalWordException(String word) {
        super (String.format("Accidentally guessed : %s instead of a letter", word));
        this.word =word;
    }

}
