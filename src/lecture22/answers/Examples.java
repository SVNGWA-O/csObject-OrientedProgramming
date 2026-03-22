package lecture22.answers;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Examples {
    List<String> words = List.of("pineapple", "pear", "grapefruit");
    @Test
    public void guessLetterTestTypical() throws AlreadyGuessedLetterException{
        WordGuesser wg = new WordGuesser(words,0,5);
        try {
            wg.guessLetter("p");
            wg.guessLetter("a");
            wg.guessLetter("z");
        }
        catch(NotALetterException e){
            fail("guessLetter() said we guessed not a letter, but we def did");
        }
        catch(OutOfGuessesException e){
            fail("guessLetter() said we were out of guesses, but we shouldn't be");
        }
        assertEquals("Current Game: p___app__\n" +
                             "Guessed Letters: [p, a, z]\n" +
                             "Guesses Left: 4",
                wg.toString());
    }

    @Test(expected=NotALetterException.class)
    public void guessLetterTestNotALetter() throws NotALetterException, OutOfGuessesException, AlreadyGuessedLetterException{
        WordGuesser wg = new WordGuesser(words,0,5);
        wg.guessLetter("pi");
    }




}
