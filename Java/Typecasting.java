import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //float num = input.nextFloat();

        // //typecasting:
        // int whatever = (int)(67.09f);
        // //automatic type promotion in expressions
        // int a = 232;
        // byte b = (byte)(a);
        // System.out.println(b);

        //error: because whenever we perform operations on byte, the compiler automatically promotes the type to integer, and we can't store an integer in a byte variable
        // byte x = 50;
        // x = x * 2;

        int ch = 'a';
        //System.out.println(ch); //gives the ASCII value

        byte p = 42;
        char c = 'a';
        short s = 1024;
        int n = 29321;
        float f = 39.79f;
        double d = 0.1234;
        double result = (f * p) + (n / c) - (d - s); // float + integer - double
        System.out.println((f * p) + " " + (n / c) + " " + (d - s));
        System.out.println(result);

    }
}
