package lecture19.activity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordGuesser {

    private List<String> words;
    private char[] currentWord;

    private char[] currentGuess;

    private Set<Character> guessedLetters;

    private int maxGuesses;

    private int guessesUsed;
    public WordGuesser(List<String> words, int initial, int maxGuesses){
        this.words = words;
        this.maxGuesses = maxGuesses;
        start(initial);
    }

    public void start(int wordToGuess){
        this.currentWord = this.words.get(wordToGuess).toCharArray();
        this.currentGuess = new char[this.currentWord.length];
        for(int i = 0; i < this.currentGuess.length; i++){
            this.currentGuess[i] = '_';
        }
        this.guessedLetters = new HashSet<Character>();
        this.guessesUsed = 0;
    }

    public String toString(){
        return String.format("Current Game: %s\nGuessed Letters: %s",
                             String.copyValueOf(this.currentGuess), this.guessedLetters);

    }

    /**
     * Takes a letter to guess as a string
     * @param letter the letter to guess
     */
    public void guessLetter(String letter){
        this.guessedLetters.add(letter.toCharArray()[0]);
        boolean foundLetter = false;
        for(int i = 0; i < currentWord.length; i++){
            if(String.valueOf(currentWord[i]).equals(letter)){
                foundLetter = true;
                currentGuess[i] = currentWord[i];
            }
        }
        if(! foundLetter) { guessesUsed++; }

    }

    /**
     * Takes a word to guess as a string
     * @param word the word to guess
     * @return true if we guessed correctly (won)
     */
    public boolean guessWord(String word){
        if(String.valueOf(currentWord).equals(word))
        {
            return true;
        }
        else {
            guessesUsed++;
            return false;
        }
    }

    public boolean hasGuessesLeft(){
        return this.guessesUsed < this.maxGuesses;
    }


}
