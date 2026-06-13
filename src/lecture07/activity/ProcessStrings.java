package lecture07.activity;
import java.util.List;
import java.util.LinkedList;


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
    public int totalCharacters() {

        int answer = 0;
        for (String word:this.strings) {
            answer += word.length();
        }
        return answer;

    }

    /**
     * finds the longest string in the list
     * @return the longest string in the list (or "" if the list is empty)
     */
    public String longestString(){

        String answer = "";
        for(String s : this.strings){
            if(s.length() > answer.length()){
                answer = s;
            }
        }
        return answer;

    }

    /**
     * filters out only the strings that have a particular length
     * @param length the length of strings to keep
     * @return a *new* list of strings with the given length
     */
    public List<String> stringsWithLength(int length){
        List<String> answer = new LinkedList<>();
        for(String word: this.strings ){
            if(word.length() == length){
                answer.add(word);
            }
            else if(this.strings== null){

            }
        }
        return answer;
    }

}
