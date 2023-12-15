#include<stdio.h>
#include<stdlib.h>

typedef struct Qnode {
    node* treeNode;
    struct Qnode* next;
} Qnode;

typedef struct queue {
    Qnode* front;
    Qnode* rear;
} queue;

Qnode* create_Qnode(node* treeNode) {
    Qnode* newQnode = (Qnode*)malloc(sizeof(Qnode));
    if (newQnode != NULL) {
        newQnode->treeNode = treeNode;
        newQnode->next = NULL;
    }
    return newQnode;
}

queue* create_queue() {
    queue* q = (queue*)malloc(sizeof(queue));
    if (q != NULL) {
        q->front = NULL;
        q->rear = NULL;
    }
    return q;
}

int is_empty(queue* q) {
    return (q->front == NULL && q->rear == NULL);
}

void push(queue* q, node* treeNode) {
    Qnode* newQnode = create_Qnode(treeNode);
    if (newQnode == NULL) {
        // Handle memory allocation failure
        return;
    }
    if (is_empty(q)) {
        q->front = newQnode;
    } else {
        q->rear->next = newQnode;
    }
    q->rear = newQnode;
}

int pop(queue* q) {
    if (is_empty(q)) {
        // Handle empty queue
        return -1; // Example of error value, change as needed
    }
    Qnode* temp = q->front;
    node* treeNode = temp->treeNode;

    q->front = temp->next;
    free(temp);
    if (q->front == NULL) {
        q->rear = NULL;
    }
    return treeNode;
}
