package Whatever;
public class UntouchableNumber {
    // function check whether the given number is an untouchable number or not
    static boolean isUntouchable(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            if (sumOfDivisors(i) == n)
                return false;
        }
        return true;
    }

    // function finds the sum of all proper divisors
    static int sumOfDivisors(int num) {
        // stores the sum of the divisors
        int sum = 0;
        // finds all the divisors of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // i is divisor of num
            if (num % i == 0) {
                // if equal, add only once, else add both
                if (i == (num / i))
                    sum = sum + i;
                else
                    sum = sum + (i + num / i);
            }
        }
        // 1 is added to the variable sum because 1 is also a divisor
        return (sum + 1);
    }

    // driver code
    public static void main(String args[]) {
        System.out.println("Untouchable number between 1 to 100 are:");
        for (int i = 1; i < 100; i++) {
            if(isUntouchable(i))
                System.out.print(i + " ");
        }
    }
}