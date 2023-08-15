package Whatever;
import java.util.Scanner;

class Jaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String num = String.valueOf(n);

        int sum = 0;
        for (int i = 1; i < num.length(); i++) {
            String firstDigit = String.valueOf(num.charAt(i));
            String secondDigit = String.valueOf(num.charAt(i-1));
            String temp = firstDigit + secondDigit;
            sum += Integer.valueOf(temp);
        }

        System.out.println("Sum = " + sum);
    }
}
