package lecture17and18.activity;
public interface Queue<T> {

    void enqueue(T elem);

    T dequeue();

    T peek();
}
