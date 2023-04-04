import java.util.Scanner;

public class TicTacToe {
  
    public static void main(String[] args) {
        char[][] board = GameBoard.gameBoard;
        GameBoard.printGameBoard();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Placement (1-9): ");
        int pos = scan.nextInt();
        System.out.println(pos);
        
        switch (pos) {
            case 1:
                board[0][0] = 'x';
                break;
            case 2:
                board[0][2] = 'x';
                break;
            case 3:
                board[0][4] = 'x';
                break;
            case 4:
                board[2][0] = 'x';
                break;
            case 5:
                board[2][2] = 'x';
                break;
            case 6:
                board[2][4] = 'x';
                break;
            case 7:
                board[4][0] = 'x';
                break;
            case 8:
                board[4][2] = 'x';
                break;
            case 9:
                board[4][4] = 'x';
                break;
        }
        GameBoard.printGameBoard();



        // Print a game board of 3 rows of 3 colums to the console. 
        // The player enters a number 1-9 to place their marker in that spot
        // computer does the same
        // This continues until one player/computer gets 3 of their markers in a row or all spaces are filled.

    }
}
