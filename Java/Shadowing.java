import java.util.Arrays;

public class Shadowing {
    static int x = 50; // this will be shadowed at line 7, 8
    public static void main(String[] args) {
        System.out.println(x);
        int x = 25; // scopes overlapping, so the class variable is shadowed
        System.out.println(x);
    }

    static void whatever() {
        System.out.println(x);
    }
}
