import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        /*
           LinkList: Stores elements that are linked using pointers
                     each element is called a Node that has two parts(data + address)
                     Nodes are stored in non-contiguous memory locations
          
                                          Singly Linked List
                             Node                  Node                     Node
                    [data | NextAddress] -> [data | NextAddress] -> [data | NextAddress]
                    
                                          Doubly Linked List
                                  Node                                  Node
                    [PrevAddress | data | NextAddress] -> [PrevAddress | data | NextAddress]
         */

        LinkedList<String> list = new LinkedList<String>();
        // linked list can mimmic both stacks and queues

        // list.push("A");
        // list.push("C");
        // list.push("B");
        // list.push("D");
        // list.push("F");

        // list.pop(); // removes F
        // System.out.println(list); // prints last to first

        list.offer("A");
        list.offer("C");
        list.offer("B");
        list.offer("D");
        list.offer("F");
        // list.poll(); // removes A
        // System.out.println(list); // prints first to last

        // list.add(4, "E"); // 0th indexing implemented here
        // System.out.println(list);
        // list.remove("E");
        System.out.println(list);

        //Useful methods:
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.offerFirst("||");
        list.addLast("||");
        list.pollLast();
        list.removeFirst();
        System.out.println(list.get(3));


        /*Advantages:
         * 1. Dynamic datastructure(allocates strictly needed memory only while running)
         * 2. Insertion or deletion of nodes is easy. O(1)
         * 3. No/Low memory waste
         */

         /*Disadvantages:
          * 1. Greater memory usage(additional pointer)
          * 2. no random access of elements, have to do it linearly
          * 3. Accessing/searching takes more time, O(n)
          */

        /*Usage:
         * 1. implement Stacks/Queues
         * 2. GPS navigation
         * 3. music playlist
         */
    }
}
