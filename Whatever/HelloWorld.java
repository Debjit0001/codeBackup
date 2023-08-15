package Whatever;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        String string = "hello";
        String s1 = "h";
        for (int i = 1; i < string.length();) {
            char j;
            for (j = 'a'; j <= 'z'; j++) {
                System.out.println(s1 + j);
                Thread.sleep(40);
                if(j == string.charAt(i)) {
                    i++;
                    break;
                }
            }
            s1 = s1 + j;
        }

        String string2 = "world";
        String s2 = "hello ";

        for (int i = 0; i < string2.length();) {
            char j;
            for(j = 'z'; j >= 'a'; j--) {
                System.out.println(s2 + j);
                Thread.sleep(40);
                if(j == string2.charAt(i)) {
                    i++;
                    break;
                }
            }
            s2 = s2 + j;
        }
        System.out.println("hello world :)");
    }
}
