package Whatever;

class Shape {
    float r;
}

class Circle extends Shape {
    float area;
    public void area() {
        area = 3.14f * r * r;
    }
}

class Main {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.r = 10;
        cir.area();

        System.out.println("Area = " + cir.area);
    }
}