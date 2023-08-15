package Whatever;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the co-efficients of a quadratic equation: ");
        float a = in.nextInt();
        float b = in.nextInt();
        float c = in.nextInt();

        if(b*b >= 4*a*c) {
            double ans1 = (-b + Math.sqrt(b*b - 4*a*c))*(1/(2*a));
            double ans2 = (-b - Math.sqrt(b*b - 4*a*c))*(1/(2*a));
            System.out.printf("The roots of this equation are:  %,.3f  and  %,.3f", ans1, ans2);
        }

        else {
            double x = Math.sqrt(-(b*b - 4*a*c));
            System.out.printf("The roots of this equation are:  %,.3f ± i*%,.3f", -b*(1/(2*a)) , x/(2*a));
        }

        in.close();
    }
}
