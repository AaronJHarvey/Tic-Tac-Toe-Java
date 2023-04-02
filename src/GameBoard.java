public class GameBoard {
    public static char[][] gameBoard = {
            //  First Line/Row: Empty Space, Space Border Line, Empty Space, Space Border line, Empty Space
            //  Second Line/Row - All borders for board: Lower/Upper space border line, Cross Line where 4 spaces intersect,Lower/Upper space border line, Cross Line where 4 spaces intersect, Lower/Upper Space border line 
            //  Third Line/Row: Empty Space, Space Border Line, Empty Space, Space Border line, Empty Space
            //  Fourth Line/Row - All borders for board: Lower/Upper space border line, Cross Line where 4 spaces intersect,Lower/Upper space border line, Cross Line where 4 spaces intersect, Lower/Upper Space border line 
            //  Fifth Line/Row: Empty Space, Space Border Line, Empty Space, Space Border line, Empty Space
            { ' ', '|', ' ', '|', ' ' },
            { '-', '+', '-', '+', '-' },
            { ' ', '|', ' ', '|', ' ' },
            { '-', '+', '-', '+', '-' },
            { ' ', '|', ' ', '|', ' ' }
    };
    
    public static void printGameBoard() {

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
