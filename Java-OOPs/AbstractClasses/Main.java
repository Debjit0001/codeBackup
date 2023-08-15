package AbstractClasses;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        child.career("Programmer");
        child.partner("Bristi", 18);

        // objects of abstract classes cannot be created normally because the constructor cannot construct an object of a class that doesn't have a body
        /* Parent parent = new Parent() {

            @Override
            void career(String name) {}

            @Override
            void partner(String name, int age) {}
        }; 
        This is how we can create an object of an abstract class
        */

        Parent.hello(); // Static methods can be called
        child.normalFunction(); // normal inheritance works

        Parent son = new Child();
        son.career("Coder");
    }
}
 