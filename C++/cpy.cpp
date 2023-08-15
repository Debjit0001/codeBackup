#include <iostream>
#include <fstream>
#include<algorithm>
using namespace std;
int main()
{
    ifstream fs;
    ofstream ft;
    string str;
    char sourcefile[50], destinationfile[50];
    cout << "Enter Source File with Extension: ";
    gets(sourcefile);
    fs.open(sourcefile);
    if (!fs)
    {
        cout << "Error in Opening Source File...!!!";
        exit(1);
    }
    cout << "Enter Destination File with Extension: ";
    gets(destinationfile);
    ft.open(destinationfile);
    if (!ft)
    {
        cout << "Error in Opening Destination File...!!!";
        fs.close();
        exit(2);
    }
    if (fs && ft)
    {
        while (getline(fs, str))
        {
            // int count = 0;
            // for (int i = 0; str[i]; i++)
            //     if (str[i] != ' ')
            //         str[count++] = str[i];
            // str[count] = '\0';
            remove(str.begin(), str.end(), ' ');
            ft << str << "\n";
        }
        cout << "\n\n Source File Date Successfully Copied to Destination File...!!!";
    }
    else
    {
        cout << "File Cannot Open...!!!";
    }
    cout << "\n\n Open Destination File and Check!!!\n";
    fs.close();
    ft.close();
}