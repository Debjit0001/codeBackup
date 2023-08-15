package Whatever;

public class RecursionPractice {

    public static int pow(int x, int n) {
        if(n == 0)
            return 1;
        
        return x*pow(x, n-1);
        
    }

    public static void printFib(int n, int a, int b) {
        System.out.print(a + " ");
        if(n == 1)
            return;

        printFib(n-1, b, a+b);
    }


    static int sum;
    static int SumOfNnumbers(int n) {
        sum += n;
        if(n == 0) {
            return sum;
        }
        return SumOfNnumbers(n-1);
    }

    static int fact(int n) {
        if(n == 0) 
            return 1;

        return n*fact(n-1);
    }

    public static void main(String[] args) {

        System.out.println(pow(2, 3));

        // System.out.println("Fibonacci seq till nth term: ");
        // int n = 10;
        // printFib(n, 0, 1);

        // System.out.println("Sum of all natural numbers till 10 = " + SumOfNnumbers(10));
        // System.out.println("5! = " + fact(5));
    }
}
