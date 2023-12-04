#include<stdio.h>
void main()
{
    int a[5],i;
    printf("Enter the array element : \n");
    for(i=0;i<5;i++)
    {
        scanf("%d",&a[i]);
    } 
    printf("The reverse array element is : \n");
    for(i=4;i>=0;i--)
    {
        printf("%d ",a[i]);
    }   
}
