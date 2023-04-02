public class TicTacToe {
    // public static char[][] gameBoard = {
    //         { ' ', '|', ' ', '|', ' ' },
    //         { '-', '+', '-', '+', '-' },
    //         { ' ', '|', ' ', '|', ' ' },
    //         { '-', '+', '-', '+', '-' },
    //         { ' ', '|', ' ', '|', ' ' }
    // }; // Line one: empty space, space border line, empty space, space border line, empty space.

    public static void main(String[] args) {
        GameBoard.printGameBoard();
        GameBoard.test();

        // Print a game board of 3 rows of 3 colums to the console. 
        // The player enters a number 1-9 to place their marker in that spot
        // computer does the same
        // This continues until one player/computer gets 3 of their markers in a row or all spaces are filled.

    }
}
