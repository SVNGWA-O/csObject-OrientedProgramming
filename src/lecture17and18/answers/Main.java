package lecture17and18.answers;

public class Main {
    public static void main(String[] args) {

        /* Students will be able to:
             - Describe abstract data types as a collection of operations on an interface
             - Implement abstract data types using particular data structures as fields or with inheritance
             - Define and implement interfaces that extend other interfaces

           Activity:
             - Look at the interface for Queue
             - Look at the LinkedList implementation for it
             - Implement it with an ArrayList instead?
             -   (Challenge: Implement it with an Array)
             - Your turn: Implement Stack with a linked list or an array list
             - Discussion: Which do you think might be better?
             - Look at ReversibleQueue interface
             - Look at implementation that uses two LinkedLists
             - Discussion: What's the benefit of using two linked lists rather than 1?
             -             What's the cost?
             - Discussion: Can you think of other abstract data types that might be useful?
         */

        Queue q = new LLQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        ReversibleQueue<Integer> rq = new LLReversibleQueue<>();
        rq.enqueue(1);
        rq.enqueue(2);
        rq.enqueue(3);
        rq.enqueue(4);
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
        rq.reverse();
        System.out.println(rq.dequeue());
        System.out.println(rq.dequeue());
    }
}