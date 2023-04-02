public class TicTacToe {
    public static void main(String[] args) {
        char[][] gameBoard = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
        };

        // for each row in the gameBoard (char[] row)
        for (char[] row : gameBoard) {
            // for each char c in the row (char character)
            for (char c : row) {
                System.out.print(c);
            }
        }
        
        
        // Print a game board of 3 rows of 3 colums to the console. 
        // The player enters a number 1-9 to place their marker in that spot
        // computer does the same
        // This continues until one player/computer gets 3 of their markers in a row or all spaces are filled.

    
    }
}
