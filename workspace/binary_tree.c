#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define COUNT 10

typedef struct node
{
    int val;
    struct node *left;
    struct node *right;
} Node;

// something like a constructor:
Node *init_node(int val)
{
    Node *new_node = (Node *)malloc(sizeof(Node));
    new_node->val = val;
    new_node->left = new_node->right = NULL;
    return new_node;
}

typedef struct binaryTree
{
    Node *root;
} binaryTree;

// populating the binary tree:
void insert_helper(Node *root);

void insert(binaryTree *tree)
{
    printf("Enter the root node: ");
    int val;
    scanf("%d", &val);

    Node *root = init_node(val);
    tree->root = root;
    insert_helper(root);
}

void insert_helper(Node *parent)
{
    printf("Do you wanna enter at left of %d ?\n", parent->val);
    int left;
    scanf("%d", &left);
    if (left)
    {
        printf("Enter the value of the left of %d : ", parent->val);
        int val;
        scanf("%d", &val);
        parent->left = init_node(val);
        insert_helper(parent->left);
    }

    printf("Do you wanna insert at right of %d ? \n", parent->val);
    int right;
    scanf("%d", &right);
    if (right)
    {
        printf("Enter the value to the right of %d : ", parent->val);
        int val;
        scanf("%d", &val);
        parent->right = init_node(val);
        insert_helper(parent->right);
    }
}

// // displaying the binary tree: 
// void display_helper(Node*, int);

// void display(binaryTree* tree) {
//     display_helper(tree->root, 0);
// }

// void display_helper(Node* node, int n) {
//     if(node == NULL)
//         return;

    
// }

// Function to print binary tree in 2D
// It does reverse inorder traversal
void print2DUtil(Node* root, int space)
{
    // Base case
    if (root == NULL)
        return;
 
    // Increase distance between levels
    space += COUNT;
 
    // Process right child first
    print2DUtil(root->right, space);
 
    // Print current node after space
    // count
    printf("\n");
    for (int i = COUNT; i < space; i++)
        printf(" ");
    printf("%d\n", root->val);
 
    // Process left child
    print2DUtil(root->left, space);
}
 
// Wrapper over print2DUtil()
void print2D(Node* root)
{
    // Pass initial space count as 0
    print2DUtil(root, 0);
}


int main(int argc, char const *argv[])
{
    binaryTree* tree;
    insert(tree);

    print2D(tree->root);

    return 0;
}