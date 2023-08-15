import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();

            int p = 0, count = 2;
            var i = 1;

            while(count <= n)
            {
                int temp = i;
                i = i + p;
                p = temp;
                count++;
            }
            System.out.println(i);
        }
    }
}
