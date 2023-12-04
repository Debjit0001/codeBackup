#include <stdio.h>
#include <stdlib.h>


int main()
{
    struct node
    {
        int data;
        struct node *next;
    } *new, *head = NULL, *tail = NULL, *temp;
    int value;
    char ch;
    do
    {
        new = (struct node *)malloc(sizeof(struct node));
        printf("Enter an element for node: ");
        scanf("%d", &value);
        new->data = value;
        new->next = NULL;
        if (head == NULL)
        {
            head = new;
            tail = new;
        }
        else
        {
            tail->next = new;
            tail = new;
        }
        printf("Press 'Y' to continue or 'N' to exit: ");
        fflush(stdin);
        scanf(" %c", &ch);
    } while (ch == 'y' || ch == 'Y');
    temp = head;
    printf("Your List Elements are: \n");
    while (temp != NULL)
    {
        printf("%d  ", temp->data);
        temp = temp->next;
    }

    int loc, i;
    {
        printf("\nEnter the location: ");
        scanf("%d", &loc);
        temp = head;
        for (i = 0; i < loc - 1; i++)
        {
            temp = temp->next;
        }
        printf("\nEnter a value which you want to insert : ");
        scanf("%d", &value);
        new = (struct node *)malloc(sizeof(struct node));
        new->data = value;
        new->next = temp->next;
        temp->next = new;
    }

    printf("After insertion List Elements are: \n");
    temp = head;
    while (temp != NULL)
    {
        printf("%d  ", temp->data);
        temp = temp->next;
    }

    printf("\n");
    return 0;
}