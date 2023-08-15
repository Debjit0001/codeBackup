#include<bits/stdc++.h>
using namespace std;

int main()
{
        ifstream in("text.txt");
        ofstream out("encodedtext.txt");

        while(!in.eof())
        {
                string line;
                getline(in, line);

                for(int i = 0; line[i] != '\0'; i++)
                        out<< int(line[i]) <<" ";
        }
        
        in.close();
        out.close();

        return 0;
}