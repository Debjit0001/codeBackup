#include <stdio.h>

#define ROWS 4
#define COLS 4

int isLowerTriangular(int *arr, int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = i + 1; j < cols; j++) {
            if (arr[i * cols + j] != 0) {
                return 0; // Not a lower triangular matrix
            }
        }
    }
    return 1; // Lower triangular matrix
}

int main() {
    int matrix[ROWS][COLS] = {
        {1, 0, 0, 0},
        {2, 5, 0, 0},
        {3, 6, 8, 0},
        {4, 7, 9, 10}
    };

    int size = ROWS * COLS;
    int flattenedMatrix[size]; // 1D array to store the matrix elements

    // Flatten the matrix to 1D array
    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLS; j++) {
            flattenedMatrix[i * COLS + j] = matrix[i][j];
        }
    }

    // Check if the matrix is lower triangular
    int isLower = isLowerTriangular(flattenedMatrix, ROWS, COLS);

    if (isLower) {
        printf("The matrix is a lower triangular matrix.\n");
    } else {
        printf("The matrix is not a lower triangular matrix.\n");
    }

    return 0;
}
