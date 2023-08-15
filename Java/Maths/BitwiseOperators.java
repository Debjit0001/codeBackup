package Maths;

import java.util.Scanner;

class BitwiseOperators {

    /* Observations:
     * 1. 1^x = x'; (complement of x)
     * 2. 0^x = x
     * 3. x^x = 0
     * 4. x<<1 = 2x; as we move each of the binary digits to an extra power of 2
     * 5. a<<b = a*2^b
     * 6. a>>b = a/(2^b)
     */

    public static void main(String[] args) {

        // find unique element in array using XOR:
        int[] arr = {2, 5, 3, 7, 5, 2, 7};
        System.out.println("Unique element: " + findUnique(arr));

        // finding ith bit of a number using &:
        int num = 12;
        int bit = 3;
        System.out.println(find_i_th_bit(num, bit));

        // reset ith bit of a number using NOT, LeftShift, AND:
        System.out.println(reset(num, bit));
        
        // oddOrEven():

    }

    // set the ith bit of a number: OR the ith bit with 1
    // reset the ith bit of a number:
    static  int reset(int num, int bit) {
        int mask = ~(1<<(bit-1));
        return num&mask;
    }

    static int find_i_th_bit(int num, int bit) {
        /* if we '&' the ith bit with 1, we can get the ans, to do that, we need a number with a 1 in only the ith bit and 0 elsewhere.
        Now let's assume we need to find the 3rd bit of a number, so the MASKING number should be 100, which contains 3-1 zeroes.
        So how do we introduce 0s in the right hand side? with the help of left shift(<<) operator*/

        int mask = 1<<(bit-1);
        return num&mask;
    }

    static int findUnique(int[] arr) {
        int unique = 0;

        for(int i : arr)
            unique ^= i;

        return unique;
    } 

    static void oddOrEven() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = in.nextInt();

        if((n&1) == 1) 
            System.out.println("Odd");        
        if((n&1) == 0)
            System.out.println("Even");

        in.close();
    }
}