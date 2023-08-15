#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *ptr;
    int n;
    printf("Enter the value of n:\n");
    scanf("%d", &n);
    ptr = (int *)calloc(n, sizeof(int));
    printf("Enter the value:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &ptr[i]);
    }
    printf("The values are:\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", ptr[i]);
    }

    ptr = (int *)realloc(ptr, sizeof(int)*(n + 3));
    // int p=n+3;
    printf("\nEnter new numbers:\n");
    for (int i = 0; i < (n + 3); i++)
    {
        scanf("%d ", &ptr[i]);
    }
    printf("\nNew numbers are:\n");
    for (int i = 0; i < n+3; i++)
    {
        printf("%d ", ptr[i]);
    }
    return 0;
}