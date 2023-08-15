#include <iostream>
using namespace std;

int main() {
    int n = 10, *arr, t;
    arr = new int[n];
    cout << "\nEnter " << 10 << " elements:" << endl;

    for (int i = 0; i < n; i++)
        cin >> arr[i];

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[i]) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
    }
    cout << "\nAscending order: " << endl;
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout << endl
         << "\nDescending order:" << endl;
    for (int i = n - 1; i >= 0; i--)
        cout << arr[i] << " ";

    return 0;
}