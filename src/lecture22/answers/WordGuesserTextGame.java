package lecture22.answers;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordGuesserTextGame {

    public static List<String> animalWords(){
        try {
            List<String> animalWords = new AnimalWords().getWords();
            return animalWords;
        } catch (IOException e) {
            System.err.println("Couldn't open Animals.txt");
            return List.of("zebra");
        }

    }

    public static void main(String[] args){

        char action = 'p';
        Scanner keyboard = new Scanner(System.in);
        List<String> words = List.of("pineapple", "pear", "grapefruit");
        List<String> animalWords = animalWords();
        Random r = new Random();
        WordGuesser wg = new WordGuesser(animalWords,r.nextInt(50),5);



        while(action != 'q'){
            System.out.println(wg.toString());
            System.out.println("What would you like to do?");
            System.out.println("[l]etter, [w]ord, [s]tart over, [q]uit");
            String input = keyboard.nextLine();
            if(input.isBlank()){
                System.err.println("Bad prompt input");
            }
            else{
                action = input.charAt(0);
                if(action == 'l'){
                    String guess = keyboard.nextLine();
                    try {
                        wg.guessLetter(guess);
                    } catch (NotALetterException e) {
                        System.err.println("You didn't enter a letter");
                    } catch (OutOfGuessesException e) {
                        System.err.println("Game ended, start over please");
                    } catch (AlreadyGuessedLetterException e) {
                        System.err.println("Already guessed this letter");
                    }
                }
                else if(action == 'w'){
                    String guess = keyboard.nextLine();
                    try {
                        wg.guessWord(guess);
                    } catch (OutOfGuessesException e) {
                        System.err.println("Game ended, start over please");
                    } catch (AccidentallyGuessedALetterException e) {
                        System.out.printf("You guessed %s which is a letter\n", e.getTheLetter());
                        System.out.println("Did you mean to guess that as a letter? [y]/[n]");
                        String confirm = keyboard.nextLine();
                        if(confirm.startsWith("y")){
                            try {
                                wg.guessLetter(e.getTheLetter());
                            } catch (Exception cantHappen){
                                System.err.println("This really shouldn't happen");
                            }
                        }
                    } catch (EmptyGuessException e) {
                        System.err.println("Your guess was blank");
                    }
                }
                else if(action == 's'){
                    wg.start(r.nextInt(3));
                }
                else if(action == 'q'){
                    System.out.println("Goodbye");
                } else {
                    System.err.printf("%s is an invalid action\n", input);
                }
            }

        }
    }
}
