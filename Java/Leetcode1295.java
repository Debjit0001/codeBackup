// Question: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import java.util.Scanner;

public class Leetcode1295 {
    public static void main(String[] args) {
        int[] arr = {12, 413, 5143, 5};
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int digit = 0;
            while(nums[i] != 0) {
                nums[i] /= 10;
                digit++;
            }
            // another approach to find digits: dig = (int) Math.log10(nums[i]) + 1
            if(digit%2 == 0)
                count++;
        }

        return count;
    }
}
