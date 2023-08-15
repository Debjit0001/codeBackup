#include<iostream>
using namespace std;

class GCD {
    public:
        int gcd_r(int a, int b) {
            if(b == 0)
                return a;
            
            return gcd_r(b, a%b);
        }

        int gcd_i(int n1, int n2) {
            int i, gcd;
            for(i=1; i <= n1 && i <= n2; ++i)
            {
                if(n1%i==0 && n2%i==0)
                    gcd = i;
            }
        return gcd;
        }
};

int main() {
    int a, b;
    cout<<"Enter two numbers: "<<endl;
    cin>>a>>b;

    GCD g;
    cout<<"GCD using recursion: "<<g.gcd_r(a, b)<<endl;
    cout<<"GCD using iteration: "<<g.gcd_i(a, b);

    return 0;
}