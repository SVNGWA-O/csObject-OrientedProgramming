package lecture21.answers;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<Pet, Integer> numVaccines = new HashMap<>();
        numVaccines.put(new Pet("Aria", "Prof. Ahrens"),2);
        numVaccines.put(new Pet("Dragan", "Prof. Ahrens"),3);
        numVaccines.put(new Pet("Francesca", "Prof. Ahrens"),2);
        numVaccines.put(new Pet("Aria", "Someone Else"),4);
        System.out.println(numVaccines.get(new Pet("Aria","Prof. Ahrens")));

    }
}
