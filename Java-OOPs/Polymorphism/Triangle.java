package Polymorphism;

public class Triangle extends Shapes {

    @Override
    void area() {
        System.out.println("Area is 0.5 * base * height");
    }

    // static void area() {
    //     System.out.println("Area is 0.5 * base * height");
    // }

    // putting static will give error
    
}
