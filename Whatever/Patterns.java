package Whatever;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        int row;
        System.out.print("Enter number of rows: ");
        Scanner in = new Scanner(System.in);
        row = in.nextInt();

        for (char i = 1; i <= row; i++) {
            for (int spaces = 0; spaces < row-i; spaces++) {
                System.out.print("  ");
            }
            int j;
            for (j = i; j <= 2*i-1; j++) {
                System.out.print((char)(j+64) + " ");
            }
            for (int k = j-2; k >= i ; k--) {
                System.out.print((char)(k+64) + " ");
            }
            System.out.println();
        }
        
        in.close();
    }
}
