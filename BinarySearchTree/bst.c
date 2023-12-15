#include<stdio.h>
#include<stdlib.h>

typedef struct node {
    int data;
    struct node* left;
    struct node* right;
} node;

node* create_node(int data) {
    node* newNode = (node*) malloc (sizeof(node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
}

// -------------------------------------------------------------------------------- //

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

node* pop(queue* q) {
    if (is_empty(q)) {
        // Handle empty queue
        return NULL; // Example of error value, change as needed
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

int size(queue* q) {
    int i = 0;
    Qnode* temp = q->front;

    while(temp != q->rear) {
        i++;
        temp = temp->next;
    }

    free(temp);
    return i;
}

// -------------------------------------------------------------------------------- //


void insertIntoBST(node* root, int data) {
    // base case:
    if(root == NULL) {
        root = create_node(data);
        return;
    }

    if(data > root->data) // insert in the right part
        insertIntoBST(root->right, data);
    else
        insertIntoBST(root->left, data);
}

void takeInput(node* root) {
    int data;
    
    do {
        scanf("%d", &data);
        insertIntoBST(root, data);
    } while(data != -1);
}

void levelOrderTraversal(node* root) {
    if(root == NULL) return;

    queue* q = create_queue();
    push(q, root);

    while(!is_empty(q)) {
        int n = size(q);

        for(int i = 0; i < n; i++) {
            node* temp = pop(q);

            if(temp->left) push(q, temp->left);
            if(temp->right) push(q, temp->right);

            printf("%d ", temp->data);
        }

        printf("\n");
    }
}

int main() {

    node* root = NULL;

    printf("Enter data to create BST: \n");
    takeInput(&root);

    levelOrderTraversal(root);

    return 0;
}