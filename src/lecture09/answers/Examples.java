package lecture09.answers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;

public class Examples {

    /* Instructions:
       - Look at Book and Song
       - See they have common code
       - Can we make a super class that reuses the common code?
       - What can't we reuse?
       - Can we make a third subclass?
       - Question we go into detail in Friday's Lecture: How is this different than interfaces
     */

    @Test
    public void exampleTest(){
        Media m = new Book("a", "b", List.of());
        Song s = new Song("Hot Butter", "Popcorn", "beep boop");
        assertEquals(1,1);
    }
}
