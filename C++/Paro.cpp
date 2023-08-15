#include<iostream>
using namespace std;

class A {
    int a;
    public:
        void getA(int x) {
            a = x;
        }
        void print_A() {
            cout<<"Value of a = "<<a<<endl;
        }
};

class B : public A {
    int b;
    public:
        void getB(int x, int y) {
            getA(x);
            b = y;
        }
        void print_B() {
            print_A();
            cout<<"Value of b = "<<b<<endl;
        }
};

class C : public B {
    int c;
    public:
        void getC(int x, int y, int z) {
            getB(x, y);
            c = z;
        }
        void print_C() {
            print_B();
            cout<<"Value of c = "<<c<<endl;
        }
};

int main() {
    C obj;
    obj.getC(10, 20, 30);
    obj.print_C();

    return 0;
}