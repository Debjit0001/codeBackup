import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int[] a = new int[1];
        int[] b = new int[1];

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            a[0] = in.nextInt();
            b[0] = in.nextInt();
        }
        
        System.out.println("Before swapping, \na = " + a[0] + ", b = " + b[0]);
        swap(a, b);
        System.out.println("After swapping, \na = " + a[0] + ", b = " + b[0]);
        
    }

    static void swap(int[] a, int[] b) {
        int temp = a[0];
        a[0] = b [0];
        b[0] = temp;
    }
}
