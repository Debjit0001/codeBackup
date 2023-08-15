import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //creating an array:
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);

        System.out.println(Arrays.toString(arr));

        // String name = "Shreyasi";
        // changeString(name);
        // System.out.println(name);
    }

    static void change(int[] nums) {
        nums[0] = 69;
        //here we're not creating a new object or anything,
        //we are actually modifying the array
        //arr and nums point to the same array, thus the original array gets modified
    }

    static void changeString(String str) {
        str = "Paromita";

        /*The here the original name object of String class points towards the object "Shreyasi" 
         * but in the function, we take str and then create another object "Paromita" and make it point towars it
         * so actually are aren't modifying the original 'name', we are creating a new object while 'name' remains unchanged*/
    }
}
