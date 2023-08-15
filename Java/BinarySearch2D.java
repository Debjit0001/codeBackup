import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr ={
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int ans[] = answer(arr, 34);
        System.out.println(Arrays.toString(ans));
    }

    static int[] answer(int[][] arr, int target) {
        if(target < arr[0][0]) 
            return new int[] {-1, -1};

        int row = 0, col = arr.length-1;
        while(row < arr.length && col >= 0) {
            if(target == arr[row][col])
                return new int[] {row, col};
            
            if(target > arr[row][col])
                row++;
            else    
                col--;
        }
        return new int[] {-1, -1};
    }
}
