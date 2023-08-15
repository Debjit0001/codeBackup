package Whatever;
import java.util.Scanner;

public class StrongNumber 
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();

        int temp = num, sum = 0;
        while (temp != 0) {
            sum += factorial(temp%10);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }
    }

    static int factorial(int n) 
    {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}