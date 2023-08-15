#include<iostream>
using namespace std;

void swap(int &n, int &m) {
    int t = n;
    n = m;
    m = t;
}

int main() {

    int n;
    cout<<"Enter array size:"<<endl;
    cin>>n;

    int *arr = new int[n];
    cout<<"Enter elements:"<<endl;
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    
    for (int i = 0; i < n-1; i++)
    {
        int min = i;
        for (int j = i+1; j < n; j++)
        {
            if(arr[j] < arr[min])
                min = j;
        }
        swap(arr[i], arr[min]);
    }
    
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    
    return 0;
}