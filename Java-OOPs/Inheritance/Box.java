package Inheritance;

public class Box {

    // if we declare the base class as final, inheritance won't be possible
    
    double length;
    double width;
    double height;

    Box() {
        super();
        // This box class is not derives from any other class but still using super keyword doesn't give us an error
        // if we Ctrl+click on it, it'll open the Object class
        // The 'Object' class is the root of class hierarchy; It's the super class of all other classes present in a Java program, for example, Array class, String class and even our Main class
        
        length = -1;
        width = -1;
        height = -1;
    }

    // Cube
    Box(double side) {
        length = side;
        width = side;
        height = side;
    }

    // Normal box
    Box(double length, double width, double height) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    // copy constructor
    Box(Box obj) {
        this.length = obj.length;
        this.width = obj.width;
        this.height = obj.height;
    }

    public void information() {
        System.out.println("Box is running");
    }
}
