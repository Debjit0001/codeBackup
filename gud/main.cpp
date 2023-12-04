#include<iostream>
#include<unistd.h>

using namespace std;

int main() {

    int shared = 5;

    int y = shared;
    y--;
    sleep(1);
    shared = y;

    return 0;

}