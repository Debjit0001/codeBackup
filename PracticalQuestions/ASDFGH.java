package PracticalQuestions;

import java.util.Scanner;

public class ASDFGH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 5, sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter element: ");
            int a = in.nextInt();
            sum += a;
            System.out.println("Current sum = " + sum);
        }
    
        in.close();
    }
}
