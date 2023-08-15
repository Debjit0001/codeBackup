package Recursion;

public class Main {
    public static void main(String[] args) {
        // message(5);
        // printNum(5);
        // System.out.println(fibo(2));

        int[] arr = {1, 23, 53, 64, 86, 97, 123, 512, 522, 632};
        int target = 53;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        if(s > e)
            return -1;

        int mid = s/2 + e/2;
        if(arr[mid] == target)
            return mid;

        if(arr[mid] < target) 
            return binarySearch(arr, target, mid + 1, e);

        return binarySearch(arr, target, s, mid-1);
    }

    static int fibo(int n) {
        // base condition 
        if(n < 2)
            return n;

        // recursive relation and recursive call
        return fibo(n-1) + fibo(n-2); 
    }

    static void printNum(int n) {
        if(n == 0)
            return;

        printNum(n-1);
        System.out.println(n);
    } 


    static void message(int n) {  
        System.out.println("Hello world");

        if(n == 0)
            return;

        message(n-1);
    }
}