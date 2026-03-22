package lecture07.activity;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/*
 * Learning Objectives: List<T> variable-sized data
 *                      for-each loops
 *                      the imperative, acc-style design pattern
 */

public class Examples {

    public ProcessStrings ps = new ProcessStrings(List.of("hello", "every", "CS", "2102", "student"));
    @Test
    public void testTotalCharacters(){
        //assertEquals(???, ps.totalCharacters());
    }

    @Test
    public void testLongestString(){
        //assertEquals(???, ps.longestString());
    }

    public void testStringWithLength(){
        //assertEquals(???,ps.stringsWithLength(???)); //wordle words?
    }

}
