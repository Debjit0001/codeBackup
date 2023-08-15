package Introduction;
public class WrapperClass {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 15;

        // swap(a, b);
        // System.out.println(a + "  " + b); // we know it won't swap as Java does not have pass by reference

        Integer num1 = 20; // new Integer(20);
        Integer num2 = 25;
        swap(num1, num2);

        // System.out.println(num1 + "  " + num2);
        // this also won't work as Integer is a final class(immutable), they cannot be modified


        final A debjit = new A("Debjit Mahato");
        // debjit = new A("New object"); // gives error
        debjit.name = "Suman";
        // we cannot reassign the final object but can change the values it may hold

        A obj;
        for (int i = 0; i < 1000000; i++) { //objects are destroyed if the program puts pressure on the memory thats why 1000000 objects are created
            obj = new A("Whatever");
        }
    }
    
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
    
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10; // we always have to initialize final variables as it always holds the initial value
    String name;

    A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
