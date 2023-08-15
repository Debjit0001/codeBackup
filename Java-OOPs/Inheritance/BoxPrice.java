package Inheritance;

public class BoxPrice extends BoxDerived{
    
    double cost;

    BoxPrice() {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice obj) {
        super(obj);
        this.cost = obj.cost;
    }

    BoxPrice(double length, double width, double height, double weight, double cost) {
        super(length, width, height, weight);
        this.cost = cost;
    }
    
}
