package Whatever;

public class FindLargestString {

    public static void main(String[] args) {
        String str = "Hello, good morning everyone!";
        System.out.println(findLargeString(str));
    }

    static String findLargeString(String str) {
        String largeString = new String();

        char[] arr = str.toCharArray(), previousWord = {};

        String currWord = new String();
        for (int i = 0; i < arr.length; i++) {
            if(Character.isAlphabetic(arr[i]))
                currWord += arr[i];

            if(arr[i] == ' ') {
                previousWord = currWord.toCharArray();
                currWord = new String();
            }

            if(currWord.length() > previousWord.length)
                largeString = currWord;
        }

        return largeString;
    }
}
