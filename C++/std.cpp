#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main()
{

    ifstream ifs("Test2.txt");
    if (!ifs.is_open())
        cout << "File isn`t opened!";
    else
    {
        string line;
        while (getline(ifs, line, '\n'))
        {
            string str = line.substr(0, line.find(' '));
            line = line.substr(line.find(' ') + 1);
            cout << str << "\t";
            str = line.substr(0, line.find(' '));
            cout << str << "\t";
            line = line.substr(line.find(' ') + 1);
            line = line.substr(line.find(' ') + 1);
            line = line.substr(line.find(' ') + 1);
            line = line.substr(line.find(' ') + 1);
            cout << line << endl;
        }
    }

    return 0;
}