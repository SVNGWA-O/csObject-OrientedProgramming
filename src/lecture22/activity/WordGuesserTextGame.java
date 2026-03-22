package lecture22.activity;
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
        WordGuesser wg = new WordGuesser(words,r.nextInt(3),5);



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

                }
                else if(action == 'w'){

                }
                else if(action == 's'){

                }
                else if(action == 'q'){

                }
            }

        }
    }
}
