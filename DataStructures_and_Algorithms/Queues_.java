import java.util.LinkedList;
import java.util.Queue;

public class Queues_ {
    public static void main(String[] args) {
        /* 
        * FIFO datastructure that stores elements linearly
        * It is a collection(Not a class) that holds elements, prior to processing (has head and tail)
        * We can't instanciate a Queue a its an interface, so to implement it, we have to use LinkedList or PriorityQueues
        * Methods: [Might throw exception] [returns a special value]
        * enqueue ->      add()           or        offer();
        * dequeue ->      remove()        or        poll();
        * examine ->      element()       or        peek();
        */

        Queue<String> customer = new LinkedList<String>();
        customer.offer("Karen");
        customer.offer("Chad");
        customer.offer("Harold");
        customer.offer("Steve");

        // System.out.println(customer);
        customer.poll();
        System.out.println(customer);
        // using the poll() method multiple times won't throw exception, but remove() will

        System.out.println(customer.peek()); // returns the first object
        // peek is used on empty stack, it will return null , but element() will throw exception

        // The Queue interface extends to Collection class of Java, so it can use all the methods available in the later
        System.out.println(customer.isEmpty()); // returns a boolean value
        System.out.println(customer.size());  // will return the current size, i.e., 3
        System.out.println(customer.contains("Harold")); // check if the element is present a return a boolean value

        /*
         * Uses of Queues:
         * 1. Keyboard buffer(keys should be visible on the screen in the order that they are pressed), Print buffer
         * 2. Implemented in LinkedLists, PriorityQueues, BreadthFirstSearch
         */
    }
}
