package lecture17and18.activity;

import java.util.LinkedList;

public class LLReversibleQueue2<T>  implements ReversibleQueue<T> {

    public LinkedList<T> oneWay = new LinkedList<>();
    private  boolean flipFlop = true;


    @Override
    public void enqueue(T elem) {
        if(flipFlop) this.oneWay.addLast(elem);
        else this.oneWay.addFirst(elem);
    }

    @Override
    public T dequeue() {
        return flipFlop ? this.oneWay.removeFirst() : this.oneWay.removeLast();
    }

    @Override
    public T peek() {
        return flipFlop ? this.oneWay.removeFirst() : this.oneWay.removeLast();
    }

    @Override
    public void reverse() {
        flipFlop =! flipFlop;
    }
}
