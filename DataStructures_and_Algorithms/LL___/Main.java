package LL___;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = in.nextInt();
        int n = row;
        for (int i = 1; n>=1 ; i+= n--) {
            int k = n-1;
            for (int j = i; k<row ; k++, j-=k) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*
* 1
* 6 2
* 10 7 3
* 13 11 8 4
* 15 14 12 9 5
* */