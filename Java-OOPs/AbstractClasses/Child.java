package AbstractClasses;

public class Child extends Parent{

    @Override
    void career(String name) {
        System.out.println("I am gonna be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I'm gonna marry " + name + "\nShe is " + age);
    }

}
