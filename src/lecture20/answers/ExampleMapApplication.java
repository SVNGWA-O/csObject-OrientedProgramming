package lecture20.answers;
import java.util.*;

/**
 * A class that demonstrates the basic usage of {@link Map}s.
 * @Author Prof. Yu-shan "Sami" Sun, WPI
 * @Author Prof. Matthew Ahrens, WPI
 * @version 1.1
 */
public class ExampleMapApplication {

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        // First few lines of "A Tale of Two Cities" by Charles Dickens
        String tale = "it was the best of times it was the worst of times\n"
                + "it was the age of wisdom it was the age of foolishness\n"
                + "it was the epoch of belief it was the epoch of incredulity\n"
                + "it was the season of light it was the season of darkness\n"
                + "it was the spring of hope it was the winter of despair\n"
                + "we had everything before us we had nothing before us\n"
                + "we were all going direct to heaven we were all going direct\n"
                + "the other way in short the period was so far like the present\n"
                + "period that some of its noisiest authorities insisted on its\n"
                + "being received for good or for evil in the superlative degree\n" + "of comparison only\n"
                + "there were a king with a large jaw and a queen with a plain face\n"
                + "on the throne of england there were a king with a large jaw and\n"
                + "a queen with a fair face on the throne of france in both\n"
                + "countries it was clearer than crystal to the lords of the state\n"
                + "preserves of loaves and fishes that things in general were\n" + "settled for ever";

        // First few lines of "Aesop's Fables"
        String aesop = "The Wolf and the Lamb\n" + "WOLF, meeting with a Lamb astray from the fold, resolved not to\n"
                + "lay violent hands on him, but to find some plea to justify to the\n"
                + "Lamb the Wolf's right to eat him. He thus addressed him:\n"
                + "\"Sirrah, last year you grossly insulted me.\"\"Indeed,\"bleated\n"
                + "the Lamb in a mournful tone of voice,\"I was not then born.\"Then\n"
                + "said the Wolf,\"You feed in my pasture.\"\"No, good sir,\"replied\n"
                + "the Lamb,\"I have not yet tasted grass.\"Again said the Wolf,\n"
                + "\"You drink of my well.\"\"No,\"exclaimed the Lamb, \"I never yet\n"
                + "drank water, for as yet my mother's milk is both food and drink\n"
                + "to me.\"Upon which the Wolf seized him and ate him up, saying,\n"
                + "\"Well! I won't remain supperless, even though you refute every\n"
                + "one of my imputations.\"The tyrant will always find a pretext for\n" + "his tyranny.";

        // Task #1: Store the frequency of words (ignoring case) in each string
        System.out.println("----------------------------------------");
        Map<String, Integer> frequencyWordsTale = new HashMap<>();
        String[] talesByWords = tale.replace(", ", " ").replace(".", " ").replace("\n", " ").split(" ");
        // TODO: Add words and frequency
        for(String word : talesByWords){
            if(!frequencyWordsTale.containsKey(word)){
                frequencyWordsTale.put(word,1);
            } else {
                frequencyWordsTale.put(word,1 + frequencyWordsTale.get(word));
            }
        }

        Map<String, Integer> frequencyWordsAesop = new HashMap<>();
        String[] aesopByWord = aesop.replace("\n", " ").replaceAll("[^\\sa-zA-Z0-9']", "").split(" "); // Use regex to filter out punctuation
        // TODO: Add words and frequency
        for(String word : aesopByWord){
            if(!frequencyWordsAesop.containsKey(word)){
                frequencyWordsAesop.put(word,1);
            } else {
                frequencyWordsAesop.put(word,1 + frequencyWordsAesop.get(word));
            }
        }

        // Task #2: Find the word with the highest frequency (looping over keys)
        System.out.println("----------------------------------------");
        String highestFreqWordInTale = "";
        int highestFreqInTale = Integer.MIN_VALUE;
        // TODO: Loop over all keys
        for(String key : frequencyWordsTale.keySet()){
            int freq = frequencyWordsTale.get(key);
            if(freq > highestFreqInTale){
                highestFreqInTale = freq;
                highestFreqWordInTale = key;
            }
        }
        System.out.println("Word with highest frequency in Tale: " + highestFreqWordInTale + " (" + highestFreqInTale + ")");


        // Task #3: Find the word with the highest frequency (looping over key-value pairs)
        System.out.println("----------------------------------------");
        String highestFreqWordInAesop = "";
        int highestFreqInAesop = Integer.MIN_VALUE;
        // TODO: Loop over all key-value pairs
        for(Map.Entry<String,Integer> kvPair : frequencyWordsAesop.entrySet()){
            if(kvPair.getValue() > highestFreqInAesop){
                highestFreqInAesop = kvPair.getValue();
                highestFreqWordInAesop = kvPair.getKey();
            }
        }
        System.out.println("Word with highest frequency in Aesop: " + highestFreqWordInAesop + " (" + highestFreqInAesop + ")");

        // Task #4: Combining into one single map
        System.out.println("----------------------------------------");
        Map<String, Integer> combinedMap = new HashMap<>();
        // TODO: Combine into one single map
        combinedMap.putAll(frequencyWordsAesop);
//        for(Map.Entry<String,Integer> kvPair : frequencyWordsTale.entrySet()){
//            String key = kvPair.getKey();
//            if(combinedMap.containsKey(key)){
//                combinedMap.put(key,
//                                combinedMap.get(key) + kvPair.getValue());
//            } else {
//                combinedMap.put(key,kvPair.getValue());
//            }
//        }

        for(Map.Entry<String,Integer> kvPair : frequencyWordsTale.entrySet()){
            String key = kvPair.getKey();
            combinedMap.put(key, combinedMap.getOrDefault(key,0) + kvPair.getValue());
        }

        String highestFreqWord = "";
        int highestFreq = Integer.MIN_VALUE;
        // TODO: Find word with highest frequency
        for(Map.Entry<String,Integer> kvPair : combinedMap.entrySet()){
            if(kvPair.getValue() > highestFreq){
                highestFreq = kvPair.getValue();
                highestFreqWord = kvPair.getKey();
            }
        }
        System.out.println("Word with highest frequency in Tale and Aesop combined: " + highestFreqWord + " (" + highestFreq + ")");

        // Task #5: Build inverse-lookup map
        System.out.println("----------------------------------------");
        Map<Integer, List<String>> inverseLookup = new HashMap<>();
        // TODO: Loop from 1 to highestFreq and build an inverse look up map
        for(Map.Entry<String,Integer> kvPair : combinedMap.entrySet()){
            String word = kvPair.getKey();
            Integer freq = kvPair.getValue();
            List<String> words = inverseLookup.getOrDefault(freq, new LinkedList<>());
            words.add(word);
            inverseLookup.put(freq, words); // NOT NEEDED BECAUSE LIST IS MUTABLE
        }


        System.out.println("----------------------------------------");
    }
}