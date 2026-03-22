package lecture17and18.answers;
public interface Queue<T> {

    void enqueue(T elem);

    T dequeue();

    T peek();
}
