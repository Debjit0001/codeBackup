#include<stdio.h>

int main(int argc, char const *argv[])
{
    // printf("Value of argc is: %d", argc);
    for (int i = 0; i < argc; i++)
    {
        printf("Argument at index %d has a value of: %s \n", i, argv[i]);
    }
    
    return 0;
}
