package Whatever;

import java.util.*;

public class SingleDigitConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = in.nextInt();

        while((int)Math.log10(n) != 0) {
            int s = 0;
            while(n != 0) {
                s += n%10;
                n /= 10;
            }
            n = s;
        }
        System.out.println(n);

        in.close();
    }
}
