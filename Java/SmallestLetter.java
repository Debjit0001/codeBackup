public class SmallestLetter {
    // LeetCode 744
    public static void main(String[] args) {
        char[] letters = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        System.out.println(nextGreatestLetter(letters, target));

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length-1;
        if(target >= letters[e])
            return letters[s];
        while(s <= e) {
            int mid = s/2 + e/2;
            if(letters[mid] < target) 
                s = mid+1;
            else
                e = mid-1;
        }
        if(target == letters[s])
            return letters[s+1];
        else
            return letters[s];
    }
}

