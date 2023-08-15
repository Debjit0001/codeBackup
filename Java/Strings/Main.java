package Strings;

public class Main {
    public static void main(String[] args) {

        String a = "whatever";
        String b = "whatever";
        System.out.println(a == b); // gives true as both the ref variables are pointing to the same object at String pool

       
        // explicitly creating different objects of same value
        String name = new String("Debjit");
        String name1 = new String("Debjit");
        System.out.println(name == name1); // gives false as == comparator checks both values and objects
        System.out.println(name.equals(name1)); // equals() gives true as this only compares the values

        System.out.println("a" + 1);
        //here integer 1 will be converted into Integer(Wrapper class) and that will in turn call toString()

        // format specifier:
        // float f = 432.52623f;
        // System.out.printf("Formatted num = %.2f", f);
        // System.out.printf("Pie = %.4f", Math.PI);

        // also known as place holders
        // System.out.printf("My name is %s, I am not %s", "Debjit", "cool");
    }
}
