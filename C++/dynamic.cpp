#include<iostream>
#include<stdlib.h>
using namespace std;

class Sum {
    public:
        int getSum(int *arr, int n) {
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += arr[i];
            
            return sum;
        }
};

int main() {
    int n;
    cout<<"Enter number of elements: "<<endl;
    cin>>n;

    int *arr = new int[n];
    cout<<"Enter the elements: "<<endl;
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    
    Sum s;
    int ans = s.getSum(arr, n);
    cout<<"Sum of all the elements = "<<ans<<endl;

    return 0;
}