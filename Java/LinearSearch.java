public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3, 4, 5};
        System.out.println(search(arr, 3));
    }

    static int search(int[] arr, int target) {
        if(arr.length == 0) // here length is an integer not a function
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }

        return -1;
    }

    // searching for character in String
    static boolean searchString(String str, char target) {
        if(str.length() == 0) // here length is a function, that returns the length of the sequence of chanracters of the given object.
            return false;
        
        for(char i : str.toCharArray()) { // toCharArray converts string to a new character array
            if(i == target)               // e.g. -> name="Debjit"; name.toCharArray={'D', 'e', 'b', 'j', 'i', 't'}
                return true;
        }

        return false;
    
    }
}
