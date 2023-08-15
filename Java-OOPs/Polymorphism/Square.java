package Polymorphism;

public class Square extends Shapes {

    // This will run when object of Square class is created
    // hence it is overriding the parent method

    @Override // this is called annotation used for checking if a method overrides or not
    // like if this area() wasn't ovverriding another area(), the annotation will throw an error
    void area() {
        System.out.println("Area is side*side ");
    }

}
