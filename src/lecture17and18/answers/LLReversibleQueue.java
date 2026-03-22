package lecture17and18.answers;


import java.util.LinkedList;

public class LLReversibleQueue<T>  implements ReversibleQueue<T> {

    public LinkedList<T> oneWay = new LinkedList<>();


    @Override
    public void enqueue(T elem) {
        this.oneWay.addLast(elem);
    }

    @Override
    public T dequeue() {
        return this.oneWay.removeFirst();
    }

    @Override
    public T peek() {
        return this.oneWay.getFirst();
    }

    @Override
    public void reverse() {
        LinkedList<T> reversed = new LinkedList<>();
        for(T elem : this.oneWay){
            reversed.addFirst(elem);
        }
        this.oneWay = reversed;
    }
}
