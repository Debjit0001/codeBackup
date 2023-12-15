#include<queue>
#include<iostream>
using namespace std;

int main() {

    queue<int> q;
    q.push(NULL);
    q.push(1);
    q.push(2);
    q.push(3);

    bool x = q.empty();
    cout << x << endl;

    return 0;
}