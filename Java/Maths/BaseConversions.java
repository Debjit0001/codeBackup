package Maths;

import java.util.Scanner;

public class BaseConversions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.print("Enter base: ");
        int base = in.nextInt();
        System.out.println(num + " in decimal = " + toDecimal(base, num));


        // System.out.print("Enter decimal number: ");
        // int num = in.nextInt();
        // System.out.print("Enter desired base: ");
        // int base = in.nextInt();
        // System.out.println(num + " in base " + base + " = " + toBase(base, num));

        in.close();
    }



    /*To convert from Base b to Decimal:
     *  "Multiply the digits with increasing power of the base and add them"
     *  e.g.: what is binary number 11101 in decimal?
     *      so taking digits from the right hand side,
     *          1*2^0 + 0*2^1 + 1*2^2 + 1*2^3 + 1*2^4
     *        = 1 + 0 + 4 + 8 + 16
     *        = 29
    */

    static int toDecimal(int base, int num) {
        int s = 0, p = 0;

        while(num != 0) {
            s += num%10 * (int)Math.pow(base, p++);
            num /= 10;
        }

        return s;
    }

    /*To convert from Decimal to base b:
     *  "keep dividing by b and add remainder digits in reverse order"
     *  e.g.: what is 29 in binary?
     *      2|29 -> 1
     *        2|14 -> 0
     *          2|7 -> 1
     *            2|3 -> 1
     *               1 
     *    So if we write that from opposite direction(bottom up), 1 1 1 0 1
     */

    static String toBase(int base, int num) {
        String s = "";
        while(num != 0) {
            s = num%base + s;
            num /= base;
        }
        return s;
        // return Integer.parseInt(s); not recommended to convert into int as it has low range, for example 4124 in binary is 1000000011100 which not fit as an integer value
    }
}
