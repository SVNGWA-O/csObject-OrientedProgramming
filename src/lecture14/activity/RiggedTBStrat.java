package lecture14.activity;
import java.util.LinkedList;
import java.util.List;

public class RiggedTBStrat implements IToyBinStrategy{

    public GachaResult receiveToys(int quartersLoaded, int quartersPerToy, List<Toy> toys){
        LinkedList<Toy> toysToReceive = new LinkedList<>();
        int quartersSpent = 0;
        for(int i = quartersLoaded; i >= quartersPerToy && ! toys.isEmpty(); i = i - quartersPerToy){
            toys.sort(Toy::compareTo);
            toysToReceive.add(toys.remove(0));
            quartersSpent += quartersPerToy;
        }
        return new GachaResult(toysToReceive, quartersSpent);
    }
}
