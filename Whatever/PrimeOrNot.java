package Whatever;
import java.util.Scanner;

public class PrimeOrNot
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        in.close();

        new CheckPrime(n);
    }
}

class CheckPrime 
{
    public CheckPrime(int n){
        if(n<2)
            throw new IllegalArgumentException("n must be greater than 1");
            
                int c = 2;
                while(c*c <= n) {
                    if (n % c++ == 0) {
                        System.out.println(n + " is not a prime number");
                        break;
                    }
                }
        
                if(c*c > n)
                    System.out.println(n + " is a prime number");
            
    }
}