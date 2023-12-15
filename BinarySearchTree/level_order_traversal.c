#include <stdio.h>
#include <stdlib.h>

// Define a structure for a binary tree node
struct TreeNode {
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
};

// Define a structure for a queue node
struct QueueNode {
    struct TreeNode* data;
    struct QueueNode* next;
};

// Function to create a new tree node
struct TreeNode* createTreeNode(int value) {
    struct TreeNode* newNode = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    newNode->data = value;
    newNode->left = newNode->right = NULL;
    return newNode;
}

// Function to create a new queue node
struct QueueNode* createQueueNode(struct TreeNode* tree_node) {
    struct QueueNode* newNode = (struct QueueNode*)malloc(sizeof(struct QueueNode));
    newNode->data = tree_node;
    newNode->next = NULL;
    return newNode;
}

// Function to enqueue a tree node in the queue
void enqueue(struct QueueNode** front, struct QueueNode** rear, struct TreeNode* tree_node) {
    struct QueueNode* newNode = createQueueNode(tree_node);
    if (*rear == NULL) {
        *front = *rear = newNode;
        return;
    }
    (*rear)->next = newNode;
    *rear = newNode;
}

// Function to dequeue a tree node from the queue
struct TreeNode* dequeue(struct QueueNode** front, struct QueueNode** rear) {
    if (*front == NULL) {
        return NULL;
    }
    struct TreeNode* temp = (*front)->data;
    struct QueueNode* tempNode = *front;
    *front = (*front)->next;
    if (*front == NULL) {
        *rear = NULL;
    }
    free(tempNode);
    return temp;
}

// Function to perform level order traversal in a BST
void levelOrderTraversal(struct TreeNode* root) {
    if (root == NULL) {
        return;
    }

    struct QueueNode* front = NULL;
    struct QueueNode* rear = NULL;

    enqueue(&front, &rear, root);

    while (front != NULL) {
        struct TreeNode* current = dequeue(&front, &rear);
        printf("%d ", current->data);

        if (current->left != NULL) {
            enqueue(&front, &rear, current->left);
        }

        if (current->right != NULL) {
            enqueue(&front, &rear, current->right);
        }
    }
}

// Example usage
int main() {
    struct TreeNode* root = createTreeNode(50);
    root->left = createTreeNode(30);
    root->right = createTreeNode(70);
    root->left->left = createTreeNode(20);
    root->left->right = createTreeNode(40);
    root->right->left = createTreeNode(60);
    root->right->right = createTreeNode(80);

    printf("Level Order Traversal: ");
    levelOrderTraversal(root);

    return 0;
}                                           