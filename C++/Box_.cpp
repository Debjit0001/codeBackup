#include<iostream>
using namespace std;

class Box {
    private:
        float length, breadth, height;
    public:
        // constructor
        Box(float l, float b, float h) {
            length = l;
            breadth = b;
            height = h;
        }

        inline float getLength() { return length; }
        inline float getBreadth() { return breadth; }
        inline float getHeight() { return height; }

        // method to calculate surface area
        float surfaceArea() {
            return 2*(length * breadth + breadth * height + length * height);
        }

        // method to calculate volume
        float volume() {
            return (length * breadth * height);
        }

        // overload prefix increment operator
        Box& operator++() {
            ++length;
            ++breadth;
            ++height;
            return *this;
        }

        // overload postfix increment operator
        Box operator++(int) {
            Box temp = *this;
            ++length;
            ++breadth;
            ++height;
            return temp;
        }

        // overload prefix decrement operator
        Box& operator--() {
            --length;
            --breadth;
            --height;
            return *this;
        }

        // overload postfix decrement operator
        Box operator--(int) {
            Box temp = *this;
            --length;
            --breadth;
            --height;
            return temp;
        }

        // overload equality operator
        bool operator==(const Box& b) {
            return (length == b.length && breadth == b.breadth && height == b.height);
        }

        // overload assignment operator
        Box operator=(const Box& b) {
            length = b.length;
            breadth = b.breadth;
            height = b.height;
            return *this;
        }

        // check if the box is cube or cuboid using a boolan method
        bool check_cube_cuboid() {
            if (length == breadth && breadth == height)
                return true;
            else
                return false;
        }
};

int main() 
{
    float l, b, h;
    cout << "\nEnter the length, breadth, and height of the box: ";
    cin >> l >> b >> h;

    Box box1(l, b, h); // create an object of the class Box using the constructor
    cout << "\nSurface area of the box: " << box1.surfaceArea() << endl;
    cout << "\nVolume of the box: " << box1.volume() << endl;

    cout << "\nIncrementing length, breadth and height by 1 using prefix increment operator: ";
    ++box1; // increment the length, breadth and height by 1 using prefix increment operator
    cout << "\nNew length: " << box1.getLength() << ", New breadth: " << box1.getBreadth() << ", New height: " << box1.getHeight() << endl;

    cout << "\nDecrementing length, breadth and height by 1 using postfix decrement operator: ";
    box1--; // decrement the length, breadth and height by 1 using postfix decrement operator
    cout << "\nNew length: " << box1.getLength() << ", New breadth: " << box1.getBreadth() << ", New height: " << box1.getHeight() << endl;

    cout << "\nEnter the length, breadth, and height of another box: ";
    cin >> l >> b >> h;
    Box box2(l, b, h);

    if (box1 == box2) // check if the two boxes are equal using the overloaded equality operator
        cout << "\nThe two boxes are equal" << endl;
    else
        cout << "\nThe two boxes are not equal" << endl;

    box1 = box2; // assign box2 to box1 using the overloaded assignment operator
    cout << "\nAfter assignment, box1's length, breadth, and height are: " << box1.getLength() << ", " << box1.getBreadth() << ", " << box1.getHeight() << endl;
    if(box1.check_cube_cuboid())
        cout<<"\nIt is a Cube"<<endl;
    else
        cout<<"\nIt is a Cuboid"<<endl;

    return 0;
}