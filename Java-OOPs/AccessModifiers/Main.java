package AccessModifiers;

import java.net.*;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Debjit");
        int n = obj.num;
        System.out.println(n);
    }
}
