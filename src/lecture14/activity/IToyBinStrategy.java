package lecture14.activity;
import java.util.List;

public interface IToyBinStrategy {
    /**
     *
     * @param quartersLoaded HOW MUCH MONEY IS BEING SPENT
     * @param quartersPerToy how much each item in the toy list cosyts
     * @param toys going to be mutated (items removed)
     * @return the items removed from the toys
     */
     GachaResult receiveToys(int quartersLoaded, int quartersPerToy, List<Toy> toys);
}
