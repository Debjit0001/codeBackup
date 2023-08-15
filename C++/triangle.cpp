#include <iostream>
#include <cmath>
using namespace std;

class Triangle {
    float a, b, c, h;

public:
    Triangle() {}
    Triangle(float a, float b, float c) {
        this->a = a;
        this->b = b;
        this->c = c;
    }
    Triangle(float b, float h) {
        this->b = b;
        this->h = h;
    }
    float area() {
        return area(this->a, this->b, this->c);
    }
    float area(float a, float b, float c) {
        float p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
    // overloaded functions for calculating area
    float area(float b, float h) {
        return (b * h) / 2;
    }
    // Overload assignment operator
    Triangle operator=(Triangle &t) {
        // do the copy
        this->a = t.a;
        this->b = t.b;
        this->c = t.c;
        return *this;
    }
    // equality operator.
    friend bool operator==( Triangle &t1, Triangle &t2) {
        return (t1.a == t2.a && t1.b == t2.b && t1.c == t2.c);
    }
};

int main() {
    Triangle triangleABC(12.5, 15.5, 19.9);
    cout << "\nArea of the tringle ABC with sides 12.5, 15.5, 19.9: " << triangleABC.area(12.5, 15.5, 19.9) << "\n";
    Triangle triangleBH(24, 18);
    cout << "\nArea of the tringle with base 24 and height 18: " << triangleBH.area(24, 18) << "\n";
    Triangle triangleCopy = triangleABC;
    cout << "\nArea of the copied tringle: " << triangleCopy.area() << "\n";

    if (triangleABC == triangleCopy)
        cout << "\nThe triangles are equal.\n";
    else
        cout << "The triangles are not equal.\n";
    system("pause");

    return 0;
}