package Whatever;

final class Box {
    double length, bredth, height;

    Box() {}

    Box(double length, double bredth, double height) {
        this.length = length;
        this.bredth = bredth;
        this.height = height;
    }

    Box(Box obj) // copy constructor
    { 
        this.length = obj.length;
        this.bredth = obj.bredth;
        this.height = obj.height;
    }

    void volume() {
        System.out.println("Volume = " + this.length*this.bredth*this.height);
    }

}
public class CopyConstructor {
    public static void main(String[] args) {
        Box box1 = new Box(12.51, 15.23, 42.19);
        Box box2 = new Box(box1);
        box2.volume();
    }
}
