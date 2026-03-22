package lecture07.answers;
import java.util.List;
import java.util.LinkedList;
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
        int answer = 0;
        for(String s : this.strings){
            answer += s.length();
        }

        return answer;
    }

    public int totalCharacters2(){
        int answer = 0;
        for(int i = 0;i < this.strings.size();i++){
            answer += this.strings.get(i).length();
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
        List<String> answer = new LinkedList<String>();
        for(String s : this.strings){
            if(s.length() == length){
                answer.add(s);
            }
        }
        return answer;
    }

    public List<String> stringsWithLengthBAD(int length){
        this.strings.removeIf((s) -> s.length() != length); //did we want mutation?
        return this.strings;
    }

    public List<String> stringsWithLengthFP(int length){
        return this.strings.stream()
                           .filter((s) -> s.length() == length)
                           .toList();
    }

}
