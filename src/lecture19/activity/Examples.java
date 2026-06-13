package lecture19.activity;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Examples {

    List<String> words = List.of("pineapple", "pear", "grapefruit");
    @Test
    public void guessLetterTestTypical(){
        WordGuesser wg = new WordGuesser(words,0,5);
        try{
        wg.guessLetter("p");
        wg.guessLetter("a");
        wg.guessLetter("z");}

        catch (NotALetterException e){
            System.err.println(e.getMessage());
        }
        assertEquals("Current Game: p___app__\n" +
                             "Guessed Letters: [p, a, z]",
                wg.toString());
    }
    @Test
    public void guessLetterTestEmpty(){
        WordGuesser wg = new WordGuesser(words,0,5);
        try{
            wg.guessLetter("p");
            wg.guessLetter("");
            wg.guessLetter("z");}

        catch (NotALetterException | AccidentalWordException e){
            System.err.println(e.getMessage());
        }
        assertEquals("Current Game: p___app__\n" +
                        "Guessed Letters: [p, a, z]",
                wg.toString());
    }



}
