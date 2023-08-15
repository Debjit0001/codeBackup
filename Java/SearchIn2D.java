import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {12, 15, 513, 52},
            {6, 42, 62, 13}
        };

        int target = 15;
        System.out.println(Arrays.toString(search(arr, target)));
        
    }

    static int[] search(int[][] arr, int target) {
        if(arr.length == 0)
            return new int[] {-1};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target)
                    return new int[] {i, j};
            }
        }

        return new int[] {-1};
    }
}
