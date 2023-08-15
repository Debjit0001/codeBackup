package Recursion;

class SortedOrNot {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 5, 6, 8, 2, 3, 6};

        boolean ans = sorted(arr2, 0);
        System.out.println(ans);
        String str = "";Math.min
        char ch = 'c';
        Character.isLetterOrDigit(ch)

    }

    // better approach
    static boolean sorted(int[] arr, int i) {
        if(i == arr.length-1)
            return true;

        return arr[i] < arr[i+1] && sorted(arr, i+1);
    }

    static boolean check(int[] arr, int index) {
        if(index == arr.length-1)
            return true;

        if(arr[index] > arr[index+1])
            return false;

        return check(arr, index+1);
    }
}
