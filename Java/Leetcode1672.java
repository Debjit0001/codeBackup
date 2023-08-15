public class Leetcode1672 {

// Question: https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}};

        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] i : accounts) {
            int max = 0;
            for(int j : i) 
                max += j;

            if(max > ans)
                ans = max;
        }

        return ans;
    }
}
