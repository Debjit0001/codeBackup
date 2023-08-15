package Introduction;

public class StaticBlock {
    static int a = 4;
    static int b; 

    // will run only once, when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 3;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();

        System.out.println("a = " + a + " , b = " + b);
        b += 3;
        System.out.println("a = " + a + " , b = " + b);

        StaticBlock obj1 = new StaticBlock();
        System.out.println("a = " + a + " , b = " + b);

    }
}
