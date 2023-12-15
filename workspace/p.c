#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct linkedlist
{
    struct node *top;
};

struct node *creat_node(int data)
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = data;
    newnode->next = NULL;
    return newnode;
}

void push(struct linkedlist *list)
{
    int data;
    printf("enter the data that you want to insert: ");
    scanf("%d", &data);
    struct node *newnode = creat_node(data);
    if (newnode == NULL)
    {
        printf("stack overflow!!!! ");
        return;
    }
    newnode->next = list->top;
    list->top = newnode;
}

void pop(struct linkedlist *list)
{
    if (list->top == NULL)
    {
        printf("stack underflow!!!");
        return;
    }
    struct node *temp = list->top;
    list->top = list->top->next;
    free(temp);
}

void display(struct linkedlist *list) {
    struct node *temp = list->top;
    while (temp != NULL)
    {
        printf("%d->", temp->data);
        temp = temp->next;
    }
    printf("NULL \n");
}

int main()
{
    struct linkedlist *list = (struct linkedlist *)malloc(sizeof(struct linkedlist));
    list->top = NULL;
    char ch = 'y';

    printf("MENU~ \n1. push \n2.pop \n3. display \n");
    while (ch == 'y')
    {
        int option;
        printf("choose option: ");
        scanf("%d", &option);
        switch(option) {
            case 1: push(list);
                break;
            case 2: pop(list);
                break;
            case 3: display(list);
                break;
            default:
                printf("please enter a valid option");
        }

        printf("do you want to continue?(y/n) ");
        scanf(" %c", &ch);
    }
    return 0;
}