package Introduction;
public class Human {
        
    String name;
    int age;
    boolean married;
    static long population;

    Human() {}

    Human(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married; 
        // this.population += 1; // this will work but is not the correct way to access static variables as 'this' points to the object but static variables don't depend on the object;
        Human.population += 1;
    }
    
    public static void main(String[] args) {
        Human arnab = new Human("Arnab", 18, false);
        Human rahul = new Human("Rahul", 1, true);

        // System.out.println(arnab.population + "  " + rahul.population); // this will work but also will generate an warning because static varables are exclusive to the class, rather than the object
        System.out.println(Human.population);
    }

    static void func() {
        // greeting(); // cannot use a non-static function because it requires an instance but that is not the case for a static function

        // hence, to access  it, we have to create an instance first
        Human obj = new Human();
        obj.greeting();
    }

    void greeting() {
        // func(); // calling a static function inside a non-static one won't give an error
        System.out.println("Hello World");
    }
} 