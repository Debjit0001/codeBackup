package Whatever;
public class Sum {
    public static void main(String args[]) {
        int n = 1234;

        String str = String.valueOf(n);
        int sum = 0;
        for (int i = 1; i < str.length(); i++) 
            sum += Integer.parseInt( Character.toString(str.charAt(i)) + Character.toString(str.charAt(i-1)) );
        
        System.out.println("Sum = " + sum);
    }
}