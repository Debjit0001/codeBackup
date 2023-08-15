#include<stdio.h>

void swap(int a, int b) {
    int t = a;
    a = b;
    b = t;
}

int main() {
    int a, b;
    char ch;
    printf("Enter two numbers: \n");
    scanf("%d%c%d", &a, &ch, &b);

    printf("%d %c %d", a, ch, b);

    // printf("Before swap, \na = %d, b = %d \n", a, b);

    // swap(a, b);

    // printf("Before swap, \na = %d, b = %d \n", a, b);

    return 0;
}