package Whatever;
import java.util.Scanner;

public class AreaOfTriangle 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the sides of triangle: ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        in.close();

        Triangle triangle = new Triangle(a, b, c);
        triangle.area();

    }
}

class Triangle
{
    float a, b, c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void area() {
        double s = (double) (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of the triangle = " + area + " sq. unit");
    }
}