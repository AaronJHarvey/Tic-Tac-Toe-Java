import java.util.Scanner;

public class GameBoard {
    // public static char[][] gameBoard = {

    //         { ' ', '|', ' ', '|', ' ' },
    //         { '-', '+', '-', '+', '-' },
    //         { ' ', '|', ' ', '|', ' ' },
    //         { '-', '+', '-', '+', '-' },
    //         { ' ', '|', ' ', '|', ' ' }
    // };
    
    public static void printGameBoard(char[][] gameBoard) {

        // for each row in the gameBoard (char[] row)
        for (char[] row : gameBoard) {
            // for each char c in the row (char character)
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

   
   
}
