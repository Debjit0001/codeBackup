#include<iostream>
using namespace std;

class Fibo {
    public:
        void fib_rec(int n) {
            static int n1 = 0, n2 = 1, n3;
            if(n > 0) {
                cout<<n1<<" ";
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            fib_rec(n-1);
            }
        }

        void fib_iter(int n) {
            int n1 = 0, n2 = 1, n3;

            for (int i = 0; i < n; i++)
            {
                cout<<n1<<" ";
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            
        }
};

int main() {

    int n;
    cout<<"Enter number of terms in fibonacci series: "<<endl;
    cin>>n;

    Fibo f;
    cout<<"Fibonacci series using recursion: "<<endl;
    f.fib_rec(n);
    cout<<endl;
    cout<<"Fibonacci series usign iteration: "<<endl;
    f.fib_iter(n);

    return 0;
}