import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int digits[] = {9,8,7,6,5,4,3,2,1,0};
        int ans[] = new int[digits.length+1];
        System.arraycopy(digits, 0, ans, 1, digits.length);
        System.out.println(Arrays.toString(ans));
        // System.out.println(Arrays.toString(plusOne(digits)));
        }

    static int[] plusOne(int[] digits) {
        String s = "";
        for(int i = 0; i < digits.length; i++) 
            s += String.valueOf(digits[i]);
        
        s = Integer.toString(Integer.parseInt(s)+1);
        int ans[] = new int[s.length()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = Integer.valueOf(s.charAt(i))-48;
        }

        return ans;
    }
}