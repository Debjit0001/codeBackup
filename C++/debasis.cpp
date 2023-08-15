#include <iostream>
#include <string>
#include <fstream>
using namespace std; 

struct Student { 
 int rollNo; 
    string Name; 
    string cls; 
    int year; 
    float totMarks; 
    Student(int _rollNo, string _Name, string _cls, int _year, float
    _totMarks) 
    :rollNo(_rollNo), Name(_Name), cls(_cls), year(_year), 
    totMarks(_totMarks){} 
}; 
int main() 
{ 
 //Make 10 students
 Student arrSt[10] =
    {
        Student(1,"Andy","Engineer",2022,88),
        Student(2,"Jack","Mechanic",2022,79), 
        Student(3,"Any","Engineer",2022,90), 
        Student(4,"Mike","Worker",2022,65), 
        Student(5,"Andrew","Engineer",2022,95), 
        Student(6,"Lou","Worker",2022,88), 
        Student(7,"Paula","Psychology",2022,66), 
        Student(8,"John","Engineer",2022,80), 
        Student(9,"Sew","Mechanic",2022,82), 
        Student(10,"Joe","Worker",2022,70)
    }; 
    ofstream of; 
    of.open("Test.txt"); 

    if (!of.is_open()) 
    cout << "File isn`t opened!"; 

    else { 
        for (int i = 0; i < 10; i++) { 
            of << arrSt[i].rollNo << " " << arrSt[i].Name << " "
            << arrSt[i].cls << " " << arrSt[i].year << " "
            << arrSt[i].totMarks << endl; 
        } 
    } 
    of.close(); 
 
    return 0;
}