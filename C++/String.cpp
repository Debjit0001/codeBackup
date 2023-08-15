#include<iostream>
#include<string.h>
using namespace std;

void concatenate() {
    char str1[100], str2[100];

    cout<<"Enter first string:"<<endl;
    cin>>str1;
    cout<<"Enter second string: "<<endl;
    cin>>str2;

    strcat(str1, str2);
    cout<<"After concatenation: "<<endl;
    puts(str1);
}

void compare() {
    char str1[100], str2[100];

    cout<<"Enter first string:"<<endl;
    gets(str1);
    cout<<"Enter second string: "<<endl;
    gets(str2);

    int x = strcmp(str1, str2);
    if (x == 0) 
    cout <<endl<< str1 << " is equal to " << str2 << endl<<endl; 
    else if (x > 0) 
    cout <<endl<< str1 << " is greater than " << str2 << endl<<endl; 
    else
    cout <<endl<< str2 << " is greater than " << str1 << endl<<endl; 

}

int main() {
    bool flag = true; 
    int n;

    while(flag)
    {
        cout<<"To concatenate strings, enter 1"<<endl;
        cout<<"To compare strings, enter 2"<<endl;
        cout<<"To calculate length, enter 3"<<endl;
        cout<<"To convert lowercase to uppercase, enter 4"<<endl;
        cout<<"To convert uppercases to lowercase, enter 5"<<endl;
        cout<<"To exit, enter 0"<<endl;
        cin>>n;

        switch(n) {
            case 0:
                flag = false;
                break;
            case 1:
                concatenate();
                break;
            case 2:
                compare();
                break;
        }
    }
    return 0;
}