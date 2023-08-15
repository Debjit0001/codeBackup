import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 10)));
    }
    static int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        int s = 0, e = nums.length;
        while(s <= e) {
            int mid = s/2 + e/2;
            if(nums[mid] == target) {
                first = mid;
                e = mid-1;
            }
            if(nums[mid] < target)
                s = mid+1;
            else
                e = mid-1;
        }
        s = 0; e = nums.length;
        while(s <= e) {
            int mid = s/2 + e/2;
            if(nums[mid] == target) {
                last = mid;
                s = mid+1;
            }
            if(nums[mid] < target)
                s = mid+1;
            else
                e = mid-1;
        }
        return new int[] {first, last};
    }
}
