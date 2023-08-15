#include<stdio.h>

int main(int argc, char const *argv[])
{
    int a, b;
    char ch;

    while (1)
    {
        printf("\nEnter problem: ");
        scanf("%d%*c%c%d", &a, &ch, &b);

        printf("Result: ");
        switch (ch)
        {
        case '+':
            printf("%d", a+b);
            break;
        case '-':
            printf("%d", a-b);
            break;
        case '*':
            printf("%d", a*b);
            break;
        case '/':
            printf("%d", a/b);
            break;
        default:
            break;
        }
    }
    
    return 0;
}
