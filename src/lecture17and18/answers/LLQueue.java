package lecture17and18.answers;

import java.util.LinkedList;
public class LLQueue<T> extends LinkedList<T> implements Queue<T> {
    @Override
    public void enqueue(T elem) {
        this.addFirst(elem);
    }

    @Override
    public T dequeue() {
        return this.removeLast();
    }

    public T peek(){
        return this.getLast();
    }
}
