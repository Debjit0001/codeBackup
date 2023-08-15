package Polymorphism;

public class Shapes {

    // -This will cause late binding as only during run time jdk will know which of the overriden method to run
    void area() {
        System.out.println("I am in shapes");
    }

    // if we put final over this function, the overriden functions will give error, because we cannot override a final method
    // final void area() {
    //     System.out.println("I am in shapes");
    // }
    // -This is early binding as jdk will know during the compile time, which method to run, as final methods cannot be ovrrdn


    // Now for static methods: they can be inherited but not overriden (see Triangle) but if we declare the base class' method as static, now no matter which type of object might be called from the Main class, it'll always direct to main class' method 
}
