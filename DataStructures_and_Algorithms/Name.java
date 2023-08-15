import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Name {
    public static void main(String[] args) {
        char[][] name = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'},
            {'z'}
        };

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("\nEnter number of letters in your name: ");
            int n = in.nextInt();

            System.out.println("\nChoose the columns that includes your name: \n");
            for (int i = 0; i < name.length; i++) {
                for (int j = 0; j < name[i].length; j++) {
                    System.out.print(name[i][j] + "  ");
                }
                System.out.println();
            }

            Queue<Integer> list = new LinkedList<Integer>();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter column " + (i+1) + " : ");
                list.offer(in.nextInt());
            }
        
            System.out.print("\033[H\033[2J");
            System.out.flush();

            
            System.out.println("Sorry, the program ran into some TECHNICAL DIFFICULTIES. Please re-enter the columns from this re-suffeled matrix:\n");
            char[][] name1 = {
                {'a', 'f', 'k', 'p', 'u', 'z'},
                {'b', 'g', 'l', 'q', 'v'},
                {'c', 'h', 'm', 'r', 'w'},
                {'d', 'i', 'n', 's', 'x'},
                {'e', 'j', 'o', 't', 'y'}
            };
            for (int i = 0; i < name1.length; i++) {
                for (int j = 0; j < name1[i].length; j++) {
                    System.out.print(name1[i][j] + "  ");
                }
                System.out.println();
            }

            Queue<Integer> list1 = new LinkedList<Integer>();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter column " + (i+1) + " : ");
                list1.offer(in.nextInt());
            }

            System.out.print("\nYour name is: ");
            for (int i = 0; i < n; i++) {
                int j = list1.poll();
                int k = list.poll();
                System.out.print(name[j-1][k-1]);
            }
        }
    }
}