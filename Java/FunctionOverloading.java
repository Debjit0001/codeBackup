public class FunctionOverloading {
    public static void main(String[] args) {
        func("Debjit");
        func(12);
        func(49, 82);

        // func(); This will generate error because of ambiguity
        // during compilation, the compiler cannot decide which one among the methods to choose
    }

    // two or more methods or functions with same name and different arguments(number or type)

    static void func(int n) {
        System.out.println(n);
    }

    static void func(String name) {
        System.out.println(name);
    }

    static void func(int a, int b) {
        System.out.println(a + b);
    }
}
