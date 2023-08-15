import java.util.Arrays;

public class VarArgs {
    //Variable number of arguments are used when we don't know how many inputs are given
    public static void main(String[] args) {
        func(1, 2, 4, 5);
        mix(2, 3, "shga", "asghasdjg");
        System.out.println(sum(12, 23, 4, 56,4 ));
    }

    static void func(int ...x) { // array of variable length of integer arguments
        System.out.println(Arrays.toString(x));
        // this can be applied to any type of arguments: integers, strings, characters... whatever
    }

    //mix argumetns
    static void mix(int a, int b, String ...s) {
        
    }

    static int sum(int ...x) {
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        return sum;
    }
}
