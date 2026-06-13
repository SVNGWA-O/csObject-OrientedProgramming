package lecture14.activity;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Gachapon {

    private List<Toy> toys = new LinkedList<>();

    private int quartersLoaded = 0;

    private int quartersPerToy = 2;

    private IToyBinStrategy strat = new InOrderTBStrat();

    public Gachapon(List<Toy> toys){
        this.toys = new ArrayList<>(toys); // Encapsulation error!!!!
    }

    public Gachapon refillToyBin(List<Toy> toys){
        this.toys.addAll(toys);
        return this;
    }

    public Gachapon loadQuarter(){
        this.quartersLoaded++;
        return this;
    }
    public Gachapon loadQuarter(int howMany){
        if (howMany >=0){this.quartersLoaded+= howMany;}
        return this;
    }

    public int refundQuarters(){
        int quartersToRefund = this.quartersLoaded;
        this.quartersLoaded = 0;
        return quartersToRefund;
    }

    public List<Toy> receiveToys(){
        GachaResult result =this.strat.receiveToys(this.quartersLoaded, this.quartersPerToy, this.toys);
        this.quartersLoaded =-result.getQuartersSpent();

        return result.getToysToReturn();
    }

    public void  setStrat(IToyBinStrategy newStrat){
        this.strat = newStrat ;
    }


}
