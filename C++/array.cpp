#include <iostream>
using namespace std;

void reversArray(int* arr) {
    int n;
    cout<<"\nEnter array size: "<<endl;
    cin>>n;

    arr = new int[n];
    cout<<"\nEnter array elements: "<<endl;
    for (int i = 0; i < n; i++)
        cin>>arr[i];
    
    int start = 0, end = n-1;

    while (start <= end) 
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++, end--;
    }

    cout << "\nArray after reversing:\n";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
}

int main() {
    int* arr;
    
    reversArray(arr);

    cout << "\n";
    system("pause");

    return 0;
}