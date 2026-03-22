package lecture17and18.answers;

import java.util.ArrayList;

public class ALQueue<T> extends ArrayList<T> implements Queue<T> {
    @Override
    public void enqueue(T elem) {
        this.add(0,elem);
    }

    @Override
    public T dequeue() {
        return this.remove(this.size()-1);
    }

    public T peek(){
        return this.get(this.size()-1);
    }
}
