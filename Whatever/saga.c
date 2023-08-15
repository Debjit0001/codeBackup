#include<stdio.h>

int main(int argc, char const *argv[])
{
    int n;
    printf("Enter the value of n: ");
    scanf("%d", &n);

    float sum = 0, temp = -1;
    for (float i = 1; i <= n; i++) {
        temp = -temp;
        sum += temp*1.0/(i*i);
    }
    
    printf("Sum till %dth element in the series = %f", n, sum);

    return 0;
}