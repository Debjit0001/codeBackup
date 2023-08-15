#include <stdio.h>
#include <stdlib.h>

struct node
{
    int value;
    struct node *next; // pointer to the next element in linked list
};

int main()
{

    struct node *head, *tail;
    head = NULL, tail = NULL; // because currently the linked list is empty
    int size = 0;

    // insertion at the tail/end:
    for (int i = 0; i < 5; i++)
    {
        /* allocating memory for new node */
        struct node *newNode = (struct node *)malloc(sizeof(struct node));
        /* assign data and next pointer of the new node*/
        newNode->value = i + 1;
        newNode->next = NULL;

        if (head == NULL)
        {   /* update pointer variables */
            head = newNode;
            tail = head;
        }
        else {
            /* update pointer variables */
            tail->next = newNode;
            tail = tail->next;
        }
        ++size;
    }

    // printing the linked list:
    printf("Linked List:\n");
    while ((head != NULL)) {
        printf("%d ", head->value);
        /* move forward one step */
        head = head->next;
    }

    //now the head becomes null
    printf("\nhead -> %d", head);

    return 0;
}