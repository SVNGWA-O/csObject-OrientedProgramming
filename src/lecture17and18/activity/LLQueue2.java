package lecture17and18.activity;

import java.util.LinkedList;

public class LLQueue2<T> implements Queue<T>{

    private final LinkedList<T> l= new LinkedList <T>();

    @Override
    public void enqueue(T elem) {
        l.addLast(elem);
    }

    @Override
    public T dequeue() {
        return l.removeFirst();
    }

    @Override
    public T peek() {
        return l.getFirst();
    }
}
