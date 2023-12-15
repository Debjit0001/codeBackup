#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct linkedlist
{
    struct node *head;
};

struct node *creat_node(int data)
{
    struct node *newnode = (struct node *)malloc(sizeof(struct node));
    newnode->data = data;
    newnode->next = NULL;
    return newnode;
}

void insertion_at_end(struct linkedlist *list)
{
    int data;
    printf("enter the data that you want to insert: ");
    scanf("%d", &data);
    struct node *newnode = creat_node(data);
    struct node *temp = list->head;
    if (temp == NULL)
    {
        list->head = newnode;
        return;
    }

    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = newnode;
}

void display(struct linkedlist *list)
{
    struct node *temp = list->head;
    while (temp != NULL)
    {
        printf("%d ->", temp->data);
        temp = temp->next;
    }
    printf("NULL \n");
}

void delet_at_head(struct linkedlist *list)
{
    if (list->head == NULL)
    {
        return;
    }
    struct node *temp = list->head;
    list->head = list->head->next;
    free(temp);
}
int main()
{
    struct linkedlist *list = (struct linkedlist *)malloc(sizeof(struct linkedlist));
    list->head = NULL;
    char ch = 'y';
    while (ch == 'y')
    {
        insertion_at_end(list);
        printf("do you want to insert again?");
        scanf(" %c", &ch);
    }
    delet_at_head(list);
    printf(" after deletion the linkedlist is: ");
    display(list);
    return 0;
}