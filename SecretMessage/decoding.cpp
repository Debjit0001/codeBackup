#include<bits/stdc++.h>
using namespace std;

int main()
{
    vector<string> chars;
    ifstream in("encodedtext.txt");

    string line;
    getline(in, line);
    
    for (int i = 0; line[i] != '\0'; i++)
    
    {
        int j = i;
        string str;
        while(line[j] != ' ' && line[j] != '\0') 
            str += line[j++];

        chars.push_back(str);
        i=j;
    }
    
    for(auto i = chars.begin(); i != chars.end(); i++) {
        cout << (char)stoi(*i);
    }
    return 0;
}