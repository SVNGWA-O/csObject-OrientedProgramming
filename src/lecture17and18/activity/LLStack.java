package lecture17and18.activity;

import java.util.LinkedList;

public class LLStack<T> implements Stack<T>{

    private final LinkedList<T> l= new LinkedList <T>();

    // O(1) could be the worst case

    @Override
    public void push(T elem) {
        l.addFirst(elem);
    }

    // O(1) could be the worst case
    @Override
    public T pop() {
        return l.removeFirst();
    }

    //

    @Override
    public T peek() {
        return l.getFirst();
    }
}
