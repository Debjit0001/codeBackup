import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter number to check for prime:");
        int n = in.nextInt();

        System.out.println(isPrime(n));
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) 
            return false;
        
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) 
                return false;
        }

        return true;
    }
}
