public class TicTacToe {
    //  First Line/Row: Empty Space, Space Border Line, Empty Space, Space Border line, Empty Space
    //  Second Line/Row - All borders for board: Lower/Upper space border line, Cross Line where 4 spaces intersect,Lower/Upper space border line, Cross Line where 4 spaces intersect, Lower/Upper Space border line 
    //  Third Line/Row: Empty Space, Space Border Line, Empty Space, Space Border line, Empty Space
    //  Fourth Line/Row - All borders for board: Lower/Upper space border line, Cross Line where 4 spaces intersect,Lower/Upper space border line, Cross Line where 4 spaces intersect, Lower/Upper Space border line 
    //  Fifth Line/Row: Empty Space, Space Border Line, Empty Space, Space Border line, Empty Space
    public static char[][] gameBoard = {
            { ' ', '|', ' ', '|', ' ' },
            { '-', '+', '-', '+', '-' },
            { ' ', '|', ' ', '|', ' ' },
            { '-', '+', '-', '+', '-' },
            { ' ', '|', ' ', '|', ' ' }
    }; 
    public static void main(String[] args) {
        GameBoard.printGameBoard(gameBoard);

        // Print a game board of 3 rows of 3 colums to the console. 
        // The player enters a number 1-9 to place their marker in that spot
        // computer does the same
        // This continues until one player/computer gets 3 of their markers in a row or all spaces are filled.

    }
}
