import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter upper bound:");
            int range = in.nextInt();
            for (int i = 1; i < range; i++) {
                if(isArmstrong(i))
                    System.out.print(i + "  ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int d = 0, x = n;
        while (x != 0) {
            x /= 10;
            d++;
        }

        int sum = 0;
        int original = n;
        while(n != 0) {
            int r = n % 10;
            sum += pow(r, d);
            n /= 10;
        }

        return (sum == original);
    }

    static int pow(int n, int p) {
        int var = 1;
        while(p != 0) {
            var *= n;
            p--;
        }
        return var;
    }
}
