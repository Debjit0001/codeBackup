package Inheritance;

public class BoxDerived extends Box{

    double weight;

    BoxDerived() {
        // super is not used, but java will by default call the parent (default constructor) of this class to initialize the values
        this.weight = -1;
    }

    // the super() keyword is used to access the members of the direct parent class

    BoxDerived(double length, double width, double height, double weight) {
        super(length, width, height); // used to initialize values present in parent class; calls the constructor of the parent class. So even the private variables of the parent class can be initialized.
        this.weight = weight;
    }

    BoxDerived(BoxDerived obj) {
        super(obj);
        this.weight = obj.weight;
    }

    public static void main(String[] args) {
        // Box box = new Box(4.6, 5,7);
        // Box box1 = new Box(box);
        // System.out.println(box1.length + "  " + box1.width + "  " + box1.height);

        BoxDerived box2 = new BoxDerived();
        System.out.println(box2.height + "  " + box2.weight); // prints -1.0  -1.0

        // assigning parent type ref var to a child type object: 
        Box box3 = new BoxDerived();
        System.out.println(box3.length); // can access all the variables except weight as the parent type ref var has no idea about weight

        // BoxDerived box4 = new Box(); // throws an error
        /* an object of Box type cannot initialize all the values of BoxDerived
         * as the values are not initialized, it gives us an error
         */
    }
}
