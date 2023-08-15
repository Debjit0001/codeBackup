#include<stdio.h>
#define SWAP(a, b, temp) {temp = b; b = a; a = temp; }

int main() {
    int a, b, temp;
    printf("Enter the values of a and b: \n");
    scanf("%d%d", &a, &b);

    printf("Before swapping, values are: \n");
    printf("a = %d, b = %d \n", a, b);
    SWAP(a, b, temp);

    printf("After swapping, values are: \n");
    printf("a = %d, b = %d", a, b);

    return 0;
}