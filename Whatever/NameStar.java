import java.util.Scanner;

public class NameStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name:");
        String str = in.nextLine();

        char[] name = str.toCharArray();
        if(name.length % 2 == 0) {
        int row = name.length/2 -1;
            for (int i = 0; i <= row; i++) {
                for(int s = 0; s < row-i; s++) 
                    System.out.print(" ");
                for (int j = row-i; j <= row+1+i; j++) 
                    System.out.print(name[j]);
                
                System.out.println();
            }
        }

        else {
            int row = name.length/2;
            for (int i = 0; i <= row; i++) {
                for(int s = 0; s < row-i; s++) 
                    System.out.print(" ");
                for (int j = row-i; j <= row+i; j++) 
                    System.out.print(name[j]);
                
                System.out.println();
            }
        }
        

        in.close();
    }
}
