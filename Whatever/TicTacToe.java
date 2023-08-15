package Whatever;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (char[] chars : board) {
            Arrays.fill(chars, '-');
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner in = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println(player + " player enter: ");
            int row = in.nextInt()-1;
            int col = in.nextInt()-1;

            System.out.print("\033[H\033[2J");
            if (board[row][col] == '-') {
                board[row][col] = player; // place the element;
                gameOver = haveWon(board, player);
                if (gameOver)
                    System.out.println("Player " + player + " has won!");
                else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else
                System.out.println("Invalid move. Try again!");
        }

        printBoard(board);

        in.close();
    }

    private static boolean haveWon(char[][] board, char player) {
        // check the rows
        for (char[] chars : board) {
            if (chars[0] == player && chars[1] == player && chars[2] == player)
                return true;

        }

        // check for col:
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player)
                return true;
        }

        // check diagonally
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++)
                System.out.print(board[row][col] + " ");

            System.out.println();
        }
        System.out.println("\n");
    }
}