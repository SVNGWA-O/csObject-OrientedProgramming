package lecture07.activity;
import java.util.List;


/*
 * Design Pattern / Template - fill-in-the-...s
 *   if(someList.isEmpty()) { return ...; } // optional guard for empty case
 *   ... answer = ...; // default/initial/base case answer
 *   for(... element : someList) {
 *     answer = ...(answer, element);
 *   }
 *   return answer;
 */

/** A class for processing lists of strings */
public class ProcessStrings {

    /** The strings to process */
    public List<String> strings;

    /**
     * Constructs a string processor for some strings
     * @param strings the strings to process
     */
    public ProcessStrings(List<String> strings){
        this.strings = strings;
    }


    /**
     * Calculates the total characters in all the strings
     * @return the number of characters total
     */
    public int totalCharacters(){
        return 0;
    }

    /**
     * finds the longest string in the list
     * @return the longest string in the list (or "" if the list is empty)
     */
    public String longestString(){
        return "";
    }

    /**
     * filters out only the strings that have a particular length
     * @param length the length of strings to keep
     * @return a *new* list of strings with the given length
     */
    public List<String> stringsWithLength(int length){
        return null;
    }

}
