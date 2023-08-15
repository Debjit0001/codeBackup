package Whatever;

import java.util.ArrayList;
import java.util.Random;

public class CommandLineArguments {
    public static void main(String[] args) {
        
        Random random = new Random();
        String string = "hello world";
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < string.length(); ) {
            list.add((char)random.nextInt(122));
            System.out.println(list);
            if((char)random.nextInt(122) == string.charAt(i)) 
                i++;
        }

    }
}
