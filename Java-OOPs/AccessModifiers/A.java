package AccessModifiers;

public class A {
    protected int num;
    String name;
    int[] arr;

    public int getNum() { // getter
        return this.num;
    }

    public void setNum(int num) { // setter
        this.num = num;
    } 

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[10];
    }

   
}
