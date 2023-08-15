package Whatever;
public class Solution {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        int ans = strStr(haystack, needle);
        System.out.println(ans);
    }

    static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
        // int n = needle.length();
        // int i = 0;
        // do {
        //     String str = haystack.substring(i, i+n);
        //     if(needle.equals(str))
        //         return i;
        //     i++;
        // }while(i < haystack.length() - n);

        // return -1;
    }
}
