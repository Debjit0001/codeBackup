import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //inputting a number
        // System.out.print("Enter a number: ");
        // int roll_no = input.nextInt();
        // System.out.println("Your roll number is: " + roll_no);

        //inputting a single word
        // String str = input.next();
        // System.out.println(name);

        //inputting a whole sentence
        String name = input.nextLine();
        System.out.println(name);
    }
}