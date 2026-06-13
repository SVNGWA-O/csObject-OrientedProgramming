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
        assertEquals(23, ps.totalCharacters());
    }

    @Test
    public void testLongestString(){
        assertEquals("student", ps.longestString());
    }

    @Test
    public void testStringWithLength(){
        assertEquals(List.of("hello", "every"),ps.stringsWithLength(5));//wordle words?
    }

}
