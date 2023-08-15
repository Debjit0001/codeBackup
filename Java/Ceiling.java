public class Ceiling {
    public static void main(String[] args) {
        int[] arr= {2, 3, 5, 9, 14, 16, 18};
        int target = 12;
        System.out.println("Ceiling of " + target + " = " + Ceiling_index(arr, target));
    }

    static int Ceiling_index(int[] arr, int target) {
        int s = 0, e = arr.length-1;
        while (s <= e) {
            int mid = s/2 + e/2;
            if(arr[mid] < target) 
                s = mid+1;
            else    
                e = mid-1;
        }
            return s;
    }
}

// if we were to find the floor of a number(i.e., greatest number, smaller or equal to target),
// just return the end pointer. that's it.