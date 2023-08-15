#include <iostream>
#include <string>
#include <fstream>
using namespace std;

struct Student
{
    int rollNo;
    string Name;
    string cls;
    int year;
    float totMarks;
    Student(int _rollNo, string _Name, string _cls, int _year, float _totMarks) : rollNo(_rollNo), Name(_Name), cls(_cls), year(_year), totMarks(_totMarks) {}
};

int main() {
    Student arrSt[10] = {
        Student(1, "Darsh", "Engineering", 2022, 88),
        Student(2, "Hitansh", "Accountancy", 2022, 79),
        Student(3, "Ishank ", "Tourism", 2022, 90),
        Student(4, "Kartik ", "Tourism", 2022, 65),
        Student(5, "Naksh ", "Engineering", 2022, 95),
        Student(6, "Naman ", "History", 2022, 88),
        Student(7, "Veer ", "Psychology", 2022, 66),
        Student(8, "Prateek", "Engineering", 2022, 80),
        Student(9, "Garima", "Accountancy", 2022, 82),
        Student(10, "Sujata", "History", 2022, 70)
    };

    ofstream of;
    of.open("Test2.txt");
    if (!of.is_open())
        cout << "File isn`t opened!";
    else {
        for (int i = 0; i < 10; ++i)
        {
            of << arrSt[i].rollNo << " " << arrSt[i].Name << " " << arrSt[i].cls << " " << arrSt[i].year << " " << arrSt[i].totMarks << endl;
        }
    }

    of.close();
    return 0;
}