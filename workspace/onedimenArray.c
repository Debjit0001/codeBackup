#include <stdio.h>

#define ROWS 4
#define COLS 4

int isUpperTriangular(int *arr, int rows, int cols) {
    for (int i = 1; i < rows; i++) {
        for (int j = 0; j < i ; j++) {
            if (arr[ i * cols + j] != 0) {
                return 0; // Not an upper triangular matrix
            }
        }
    }
    return 1; // Upper triangular matrix
}

int main() {
    int matrix[ROWS][COLS] = {
        {1, 2, 3, 4},
        {0, 5, 6, 7},
        {0, 0, 8, 9},
        {0, 0, 0, 10}
    };

    int size = ROWS * COLS;
    int flattenedMatrix[size]; // 1D array to store the matrix elements

    // Flatten the matrix to 1D array
    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLS; j++) {
            flattenedMatrix[i * COLS + j] = matrix[i][j];
        }
    }

    // Check if the matrix is upper triangular
    int isUpper = isUpperTriangular(flattenedMatrix, ROWS, COLS);

    if (isUpper) {
        printf("The matrix is an upper triangular matrix.\n");
    } else {
        printf("The matrix is not an upper triangular matrix.\n");
    }

    return 0;
}
