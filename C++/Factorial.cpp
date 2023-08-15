#include<iostream>
using namespace std;

class Factorial {
    public:
        int fact_rec(int n) {
            if(n == 0)
                return 1;

            return n*fact_rec(n-1);
        }

        int fact_iter(int n) {
            int f = 1;
            while (n > 0)
            {
                f *= n;
                n--;
            }
            return f;
        }
};

int main() {
    int n;
    cout<<"Enter number: ";
    cin>>n;

    Factorial f;
    cout<<"Factorial using recursion = "<<f.fact_rec(n)<<endl;
    cout<<"Factorial using recursion = "<<f.fact_iter(n)<<endl;

    return 0;
}