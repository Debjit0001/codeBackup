public class Scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        {
            // int a = 9; will give error
            a = 4;
            int c = 30;
        }
        System.out.println(a); // this will print 4(not 20), because we are changing the original variable 'a'
        // c = 11; -can't access c, because its in the block's scope
        int c = 69; // doesn't give error cuz outside the block, 'c' doesn't exist
    }
}
