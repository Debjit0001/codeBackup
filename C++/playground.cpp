#include <iostream>
#include <cmath>
using namespace std;

class Triangle
{
private:
  double side1, side2, side3;

public:
  // constructor
  Triangle(double s1, double s2, double s3)
  {
    side1 = s1;
    side2 = s2;
    side3 = s3;
  }
  Triangle(double s1, double s2)
  {
    side1 = s1;
    side2 = s2;
  }

  // area calculation using Heron's formula
  double area()
  {
    double s = (side1 + side2 + side3) / 2;
    return sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  // area calculation using sine formula
  double area(double angle)
  {
    return (side1 * side2 * sin(angle)) / 2;
  }

  // assignment operator
  Triangle &operator=(const Triangle &t)
  {
      side1 = t.side1;
      side2 = t.side2;
      side3 = t.side3;
    return *this;
  }

  // equality operator
  bool operator==(const Triangle &t)
  {
    return (side1 == t.side1 && side2 == t.side2 && side3 == t.side3);
  }
};

int main()
{
  double side1, side2, side3, angle;
  cout << "Enter first triangle in SSS format: " << endl;
  cin >> side1 >> side2 >> side3;

  Triangle t1(side1, side2, side3);
  cout << "Area of this triangle : " << endl
       << t1.area() << endl;

  cout << "\nEnter second triangle in SAS format: " << endl;
  cin >> side1 >> angle >> side2;

  Triangle t2(side1, side2);
  cout << "Area of this triangle : " << endl
       << t2.area(angle) << endl;

  t2 = t1;
  cout << "\nAfter assigning first triangle to the second one,\nArea of second trinagle : " << endl
       << t2.area() << endl;

  if (t1 == t2)
    cout << "\nThe triangles are equal";
  else
    cout << "\nThe triangles are NOT equal";

  return 0;
}
