package Whatever;
import java.util.Scanner;

// package Whatever;

public class Random {

    static int fact(int n) {
        int ans = 1;
        while(n > 0) {
            ans *= n;
            n--;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        // }
        System.out.println(Random.fact(4));
        System.out.println(Random.fact(0));
        
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter number:");
            int n = in.nextInt();

            int k = n, sum = 0;
            while(k != 0) {
                int r = k%10;
                sum += fact(r);
                k /= 10;
            }
            
            if(n == sum)
                System.out.println("Peterson number");
            else    
                System.out.println("Not peterson number");
        }
    }
}