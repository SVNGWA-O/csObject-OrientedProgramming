package lecture17and18.answers;

import java.util.LinkedList;

public class QuickReversibleQueue<T> implements ReversibleQueue<T>{

    public LinkedList<T> oneWay = new LinkedList<>();
    public boolean flipflop = true;

    @Override
    public void enqueue(T elem) {
        if(flipflop) {
            this.oneWay.addLast(elem);
        } else {
            this.oneWay.addFirst(elem);
        }
    }

    @Override
    public T dequeue() {
        T answer;
        if(flipflop) {
            answer = this.oneWay.removeFirst();
        } else {
            answer = this.oneWay.removeLast();
        }
        return answer;
    }

    @Override
    public T peek() {
        T answer;
        if(flipflop) {
            answer = this.oneWay.getFirst();
        }
        else {
            answer = this.oneWay.getLast();
        }
        return answer;
    }

    @Override
    public void reverse() {
        this.flipflop = ! this.flipflop;
    }
}
