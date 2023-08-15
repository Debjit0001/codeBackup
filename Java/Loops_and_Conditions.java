import java.util.Scanner;

public class Loops_and_Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter salary: ");

        int salary = input.nextInt();
        if(salary >= 10000) {
            System.out.println("Bonus = " + 2000);
        }
        else    
            System.out.println("Bonus = " + 1000);
    }
}
