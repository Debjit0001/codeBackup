import numpy as np

n_rows = int(input("Enter the number of rows: "))
n_cols = int(input("Enter the number of columns: "))
matrix = []
for i in range(n_rows):
    row = []
    for j in range(n_cols):
        element = float(input(f"Enter the element at position ({i+1}, {j+1}): "))
        row.append(element)
    matrix.append(row)


matrix = np.array(matrix)

rank = np.linalg.matrix_rank(matrix)

print("Rank of the matrix is", rank)