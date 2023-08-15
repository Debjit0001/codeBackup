package Whatever;

public class Determinant {
    
    static void cofactor(int[][] arr, int[][] temp, int p, int q, int n) {
        int i = 0, j = 0;
        
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                if(row != p && col != q) 
                    temp[i][j++] = arr[row][col];
                if(j == n-1) {i++; j=0;}
            }
        }
    }

    static int determinant(int[][] arr, int n) {
        if(n == 1)
            return arr[0][0];
        int det = 0;

        int[][] temp = new int[arr.length][arr.length];
        int sign = 1;

        for(int col = 0; col < n; col++) {
            cofactor(arr, temp, 0, col, n);
            det = sign * arr[0][col] * determinant(temp, n-1);
            sign = -sign;
        }

        return det;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}, 
            {7, 8, 9}
        };

        System.out.println(determinant(arr, arr.length));
    }

}
