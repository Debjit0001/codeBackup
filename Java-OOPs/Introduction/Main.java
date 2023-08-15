package Introduction;
class Main {
    public static void main(String[] args) {

        // Student[] students = new Student[5];
        // System.out.println(Arrays.toString(students)); // will give [null, null, null, null, null] as objects are not initiallized

        // Student student1; // An object is not yet created, its just a reference variable to an object, stored in the stack
        // student1 = new Student(); 
        // the 'new' keyword dynamically allocates(allocated at runtime) memory and returns a reference to it
 
       Student atul = new Student(45, "Atul Roy", 8.8f);

        atul.changeName("Mahuya Pandey");                                                                        

        // System.out.println(atul.rno);
        // System.out.println(atul.name);
        // System.out.println(atul.marks);

        Student random = new Student(atul);
        
        Student random2 = random;
        random.name = "Something Something";
        
        System.out.println(random2.name);
    }
}

// classes are basically templates for the objects; they act like a logical construct that has no actual form
    // objects are instances of classes; they're basically the physical form of the class (Stored in the heap memory)
    /* 
     * Objects has three definite properties:
     * 1. State of the object (Value from its datatype)
     * 2. Identity of the object 
     * 3. Behaviour of the object 
     */
class Student {
    int rno;
    String name;
    float marks;

    void changeName(String name) {
        this.name = name;
    }

    Student() {
        // calling another constructor from a constructor
        this (69, "Whatever", 100.0f);
        // internally: new Student(69, "Whatever", 100.0f);
        // rno = 49;
        // name = "Debjit" ;
        // marks = 7.5f;
    }

    // Copy constructor
    Student(Student copy) {
        this.rno = copy.rno;
        this.name = copy.name;
        this.marks = copy.marks;
    }

    // Constructor Overloading
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}