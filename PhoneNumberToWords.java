/* We have to find out which words are contained within the phone number */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class PhoneNumberToWords {
    public static void main(String[] args) {
        String phoneNumber = "3662277";
        String[] words = { "foo", "bar", "baz", "footbar", "emo", "cap", "car", "cat" };

        System.out.println(Arrays.toString(check(phoneNumber, words)));
    }

    static String[] check(String phoneNumber, String[] words) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        HashMap<Character, Character> map = new HashMap<>();
        map.put('a', '2'); map.put('b', '2'); map.put('c', '2'); map.put('d', '3'); map.put('e', '3'); map.put('f', '3'); map.put('g', '4'); map.put('h', '4'); map.put('i', '4'); map.put('j', '5'); map.put('k', '5'); map.put('l', '5'); map.put('m', '6'); map.put('n', '6'); map.put('o', '6'); map.put('p', '7'); map.put('q', '7'); map.put('r', '7'); map.put('s', '7'); map.put('t', '8'); map.put('u', '8'); map.put('v', '8'); map.put('w', '9'); map.put('x', '9'); map.put('y', '9'); map.put('z', '9');

        String[] numbers = new String[words.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = "";
            for (int j = 0; j < words[i].length(); j++) {
                numbers[i] += map.get(words[i].charAt(j));
            }
        }

        for (int i = 0; i < words.length; i++) {
            if(phoneNumber.indexOf(numbers[i]) != -1) 
                arr.add(i);
        }
        
        int n = arr.size();
        String[] phoneNumberWords = new String[n];
        for(int i = 0; i < n; i++) 
            phoneNumberWords[i] = words[arr.get(i)];
        
        return phoneNumberWords;
    }
}