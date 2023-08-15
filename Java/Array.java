import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int[] arr = new int[5]; -> syntax #1
        // int[] arr = new int[] {1, 2, 3, 4, 5}; -> syntax #2
        // int[] arr = {1, 2, 3, 4, 5}; -> syntax #3

        int[] arr; //declaration of array, arr is getting defined in the stack
        arr = new int[5]; //initialization: actually, here only the object is getting created in the memory(heap)

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) 
            arr[i] = in.nextInt();

        // System.out.println(Arrays.toString(arr));

        //enhanced for loop:
        for (int i : arr) { //for every iths element in arr
            System.out.print(i + " "); //print arr[i]
        }

        int[][] array = new int[3][];
        int[][] arr2D = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
 
    }
}