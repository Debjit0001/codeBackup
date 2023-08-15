import java.util.Arrays;

public class MergeSortTry {
    public static void main(String[] args) {
        int[] arr = {1, 52, 24, 73 , 1, 6,2, 26};
        mergeSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    static void mergeSort(int[] arr) {
        if(arr.length == 1)
            return;

        int mid = arr.length / 2;
        int[] subArray1 = Arrays.copyOfRange(arr, 0, mid);
        int[] subArray2 = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(subArray2); mergeSort(subArray1);
        merge(arr, subArray1, subArray2);
    }

    static void merge(int[] arr, int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) 
                arr[k++] = arr1[i++];
            else    
                arr[k++] = arr2[j++];
        }
        if(i < arr1.length)
            arr[k] = arr1[i];
        if(j < arr2.length)
            arr[k] = arr2[j];

    }
}