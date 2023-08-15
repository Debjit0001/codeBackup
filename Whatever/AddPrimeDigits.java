package Whatever;
import java.util.Scanner;

public class AddPrimeDigits 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        in.close();

        int sum = 0, k = n;
        while(n != 0) {
            int digit = n%10;
            if(isPrime(digit))
                sum += digit;

            n /= 10;
        }

        System.out.println("Sum of prime digits of " + k + " = " + sum);
    }

    private static boolean isPrime(int n) 
    {
        if (n<2)
            return false;

        int c = 2;
        while(c*c <n) {
            if (n % c++ == 0)
                return false;
        }

        return true;
    }
}
