import java.util.*;

public class Anki {
    public static void main(String[] args) {
        int n;
        String temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        n = sc.nextInt();

        String names[] = new String[n];
        System.out.println("Enter the names of cities: ");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (String name : names)
            System.out.print(name + " ");
    }
}