package Whatever;
import java.util.Arrays;
import java.util.Scanner;

class InsertionSort 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) 
            arr[i] = in.nextInt();
        in.close();

        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j] > arr[j-1])
                    swap(arr, j, j-1);
            }
        }        

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}