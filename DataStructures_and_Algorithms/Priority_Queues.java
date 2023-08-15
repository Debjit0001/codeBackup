import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queues {
    public static void main(String[] args) {
        /*
         * A FIFO datastructure that serves elements with highest priority first, before the ones with lower priority
         * For numbers, it will serve them in ascending order by default, same for alphabets
         */

        // PriorityQueue<String> queue = new PriorityQueue<String>();
        // queue.offer("B");
        // queue.offer("A");
        // queue.offer("D");
        // queue.offer("E");
        // queue.offer("C");

        // while(!queue.isEmpty()) {
        //     System.out.println(queue.poll());
        // }

        // we can print the elements in descending order, by adding a comparator to the constructor
        PriorityQueue<String> queue = new PriorityQueue<String>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("A");
        queue.offer("D");
        queue.offer("E");
        queue.offer("C");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
