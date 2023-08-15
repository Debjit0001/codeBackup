package Polymorphism;

public class Main {
    /* Two types of Polymorphism in Java:
     * 1. Compile-time(Static) Polymorphism [Achieved by -> Method Overloading]
     *      -same name but different type of argument, return type, order of type
     * 
     * 2. Runtime(Dynamic) Polymorphism [Achieved by -> Method Overriding]
     *      -functions are identical, only the body is different
     */
    public static void main(String[] args) {
        // Shapes shape = new Shapes();
        // Circle circle = new Circle();

        Square square = new Square();
        // square.area();

        // Overriding: 
        Shapes triangle = new Triangle(); // type of the ref var is of the parent class but object is of type child class
        triangle.area();
        /* Parent obj = new Child();
         * Here which method will be called depends on the type of object{ here, Child() }
         * this is known as 'Upcasting'
         */

         // Dynamic method dispatch 
         // Java determines which type of overriden method to call during runtime, based on the type of object

    }
}
