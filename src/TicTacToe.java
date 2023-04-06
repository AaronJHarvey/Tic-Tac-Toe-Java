import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] gameBoard = {

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

        printGameBoard(gameBoard);
        placeMarker();
    }

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

    public static void placeMarker() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Placement (1-9): ");
        int input = scan.nextInt();
        System.out.println(input);
        
        switch (input) {
            case 1:
                gameBoard[0][0] = "x";
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            
        }
    }
}