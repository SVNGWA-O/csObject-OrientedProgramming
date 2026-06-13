package lecture09.activity;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;
public class Examples {
    /* Instructions:
    - Look at Book and Song
    - See they have common code
    - Can we make a super class that reuses the common code?
    - What can't we reuse?
    - Can we make a third subclass?
    - Question we go into detail in Friday's Lecture: How is this different than
    interfaces
    */
    @Test
    public void exampleTest(){
        Media m = new Book("a", "b", List.of("ch1","ch2","ch3"));
        Song s = new Song("Hot Butter", "Popcorn", "beep boop");
        assertEquals("a", m.title); // the book has a title
        assertEquals("Popcorn", s.author);

        //Question: Why does the following line of code work:
        assertEquals("beep boop", s.lyrics);
// ..but the following line doesn't:
//assertEquals(List.of("ch1", "ch2", "ch3"), m.chapters);
// Similarly:
        assertEquals(true, m.isCreatedBy("b"));
        assertEquals(false, s.isCreatedBy("Hot Butter"));
// assertEquals(3, m.numberOfChapters()); // Doesn't work
        Book b = (Book) m; // Down casting! //is this always safe to do?
        assertEquals(3, b.numberOfChapters());
        assertEquals(1, s.howManyLyrics());
    }

}