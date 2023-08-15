#include<iostream>
#include<cmath>
using namespace std;

int prime(int n) 
{
    int r, i = 1, count = 0;
    while(i <= n) {
        r = n%i;
        i++;
        if(r == 0) 
            count++;
    }
    return count;
}

int main() {
    // cout<<"Prime numbers less than 100: "<<endl;
    // for (int i = 0; i < 100; i++)
    // {
    //     int k = prime(i);
    //     if(k == 2)
    //         cout<<i<<"  ";
    // }
    
    cout<<sin(90);

    return 0;
}