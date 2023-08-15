import java.util.Scanner;

public class Subho {
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in))
        {
            System.out.print("Enter first number: ");
            int a = ob.nextInt();
            System.out.print("Enter second number: ");
            int b = ob.nextInt();

            System.out.println("Division = " + a / b);
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}