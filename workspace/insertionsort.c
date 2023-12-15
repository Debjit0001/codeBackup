#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);

    int* arr = (int*)calloc(n, sizeof(int));
    for (int i = 0; i < n; i++)
        scanf("%d", (arr + i));

    for (int i = 0; i < n; i++) {
        for (int j = i; j >= 1 && arr[j] < arr[j - 1]; j--) {
            int t = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = t;
        }
    }

    printf("\nsorted array: \n");
    for (int i = 0; i < n; i++)
        printf("%d ", *(arr + i));

    free(arr);
    return 0;
}
