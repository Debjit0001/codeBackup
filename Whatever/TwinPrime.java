package Whatever;
import java.util.*;

public class TwinPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a range: \nlower bound: ");
        int m = in.nextInt();
        System.out.print("Upper bound: ");
        int n = in.nextInt();

        if(m < n) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = m; i < n; i++) {
                if(isPrime(i))
                    arr.add(i);
            }

            if(!arr.isEmpty()) {
                System.out.println("Twin primes in the given range:");
                for (int i = 1; i < arr.size(); i++) {
                    if(arr.get(i) - arr.get(i-1) == 2)
                        System.out.println(arr.get(i-1) + ", " + arr.get(i));
                }
            }
            else
                System.out.println("There are no twin primes in the given range");
        }

        else
            System.out.println("Enter a valid range");

        in.close();
    }

    private static boolean isPrime(int n) {
        if(n <= 1) 
            return false;

        int c = 2;
        while(c*c <= n) {
            if(n%c++ == 0)
                return false;
        }

        return true;
    }
}
