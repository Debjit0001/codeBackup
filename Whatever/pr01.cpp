#include<stdio.h>

int pow(int n, int p) {
    int ans = n;
    while (p > 1) {
        ans *= n;
        p--;
    }
    return ans;
}
int main(int argc, char const *argv[])
{
    int n;
    scanf("%d", &n);

    int sum = 0, d = 0, k = n;
    while(k != 0) {
        k /= 10;
        d++;
    }

    int l = n;
    while( l != 0) {
        int r = l % 10;
        sum += pow(r, d);
        l /= 10;
    }

    if(sum == n)
        printf("%d is an Armstrong number.", n);
    else
        printf("%d is NOT an Armstrong number.", n);

    return 0;
}
