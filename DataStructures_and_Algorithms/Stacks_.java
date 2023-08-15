import java.util.Stack;

class Stacks_{
    public static void main(String[] args) {

        // syntax: Stack<datatype> name = new Stack<datatype>();
        // Stack is a LIFO datastructure that stores objects in a sort of "Vertical tower" format
        /*
         * There are total 5 methods in stack:
         * push() -> adding an element on the top of the stack
         * pop() -> removing an element on the top of the stack
         * peek() -> peeking at the item at the top of the stack
         * empty() -> check to see if the stack is empty
         * search() -> search the stack for an item. this starts counting from 1 not 0
         */
        Stack<String> games = new Stack<String>();
        // System.out.println(games.empty());  -> outputs 'true' as the stack is currently empty

        games.push("PUBG");
        games.push("Call of Duty");
        games.push("Apex Legends");
        games.push("Minecraft");
        games.push("Valorant");

        System.out.println(games);
        // games.pop();
        
        // We can actually store the popped item
        // String MyFav = games.pop();
        // System.out.println(MyFav);
        // pop() method will throw exception if there are no more items left to pop
        
        // System.out.println(games);

        // System.out.println(games.peek());
        // System.out.println(games);

        // System.out.println(games.search("Valorant")); // return index(NOTE: implements 1st indexing instead of 0th indexing)
        // System.out.println(games.search("Free Fire")); // will return -1

        // while adding items, we can run out of space, for example:
        // for (int i = 0; i < 1000000000; i++) {
        //     games.push("League of Legends"); // throws outOfMemory error of Java heap
        // }

        /*
         * uses of stack:
         * 1. undo-redo features
         * 2. moving back/forward through browser history
         * 3. backtracking algorithms e.g, maze
         * 4. calling functions(call stack)
         */
    }
}