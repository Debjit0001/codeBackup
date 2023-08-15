import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // if(a > b) {
        //     if(a > c)
        //         System.out.println(a);
        //     else    
        //         System.out.println(c);
        // }
        // else if (b > c)
        //     System.out.println(b);
        // else 
        //     System.out.println(c);

        int max = a;

        if(b > max)
            max = b;

        if(c > max)
            max = c;

        /*
        another method:
            int max = Math.max(Math.max(a, b), c)
         */

        System.out.println(max);
    }
}
