import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            
            System.out.print("Enter operation: ");
            char op = in.next().trim().charAt(0);
            System.out.println();

            if(op == 'x' || op == 'X')
                break;
            
            System.out.print("Enter two numbers: ");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println();

            System.out.print("ans = ");

            switch (op) {
                case '+' -> System.out.println(a + b);
                case '-' -> System.out.println(a - b);
                case '*' -> System.out.println(a * b);
                case '/' -> System.out.println(a / b);
                default -> System.out.println("Invalid operation!");
            }

        }

    }
}
