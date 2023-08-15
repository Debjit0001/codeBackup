package Polymorphism;

public class Numbers {
    
    double sum(double a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
 
    void func(int a, String s) {};

    void func(String s, int a) {}

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(1, 2); // automatic casting
        obj.sum(4, 5, 6);
    }

}
