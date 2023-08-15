package Whatever;
import java.util.*;

class Atul {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = in.nextInt();
        int s=0;   
        while((int)Math.log10(n) != 0) {
            s=0;
            while(n!=0) {
                s += n%10;
                n/=10;
            }
            n=s;
        }
        System.out.println(s);
        // while(true) {
        //     float n = in.nextFloat();
        //     System.out.println((0.5 * n) + "  " + (1/(2*n)));
        //     in.close();
        // }
        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);

        // System.out.println("SUM = " + (a+b));
        in.close();
    }

}