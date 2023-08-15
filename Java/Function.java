import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        try (Scanner in = new Scanner(System.in)) {
            String str = in.nextLine();
            System.out.println(greeting1(str));
            // int ans = sum(x, y);
            // System.out.println(ans);
        }

    }

    //function with parameters
    static int sum(int a, int b) {
        return a + b;
    }

    //returning a string value
    static String greeting() {
        String greet = "Hello world!";
        return greet;
    }

    //String function with parameter
    static String greeting1(String str) {
        return "Good evening, " + str;
    }
}

