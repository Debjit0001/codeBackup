#include<iostream>
#include<string>
#include<fstream>
using namespace std;

int main() {
    string str;
//    ifstream in("sample1.txt");

    ofstream out("sample1.txt");
    str = "Good morning";
    out<<str;

    return 0;
}