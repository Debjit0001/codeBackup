public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = { 12, 14, 21, 125, 432 };
        int target = 21;
        int ansIndex = OrderAgnosticSearch(arr, target);
        System.out.println(ansIndex);
    }

    // Order agnostic means, it doesn't matter if the sorted array is in ascending order or descending
    static int OrderAgnosticSearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        boolean isAsc = (arr[start] < arr[end]);

        while(start <= end) {
            int mid = start/2 + end/2;

            if(arr[mid] == target)
                return mid;

            if(isAsc) {
                if( arr[mid] < target) 
                    start = end + 1;
                else 
                    end = mid - 1;
            } 
            else {
                if( arr[mid] > target) 
                    start = end + 1;
                else 
                    end = mid - 1;
            }
        }
        return -1;
    }
}
