package lecture19.answers;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Examples {

    List<String> words = List.of("pineapple", "pear", "grapefruit");
    @Test
    public void guessLetterTestTypical() throws NotALetterException{
        WordGuesser wg = new WordGuesser(words,0,5);
        wg.guessLetter("p");
        wg.guessLetter("a");
        wg.guessLetter("z");
        assertEquals("Current Game: p___app__\n" +
                             "Guessed Letters: [p, a, z]",
                wg.toString());
    }

    @Test(expected=NotALetterException.class)
    public void guessLetterTestBadInput() throws NotALetterException{
        WordGuesser wg = new WordGuesser(words,0,5);
        wg.guessLetter("pineapple");
    }

    @Test
    public void guessLetterTestBadInput2(){
        WordGuesser wg = new WordGuesser(words,0,5);
        boolean expectedError = false;
        try {
            wg.guessLetter("pineapple");
        } catch(NotALetterException e){
            expectedError = true;
        }
        if(!expectedError){
            fail("Should have thrown an exception, but didn't");
        }
    }




}
