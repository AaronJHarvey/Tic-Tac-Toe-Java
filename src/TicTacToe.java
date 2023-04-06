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
        placeMarker(gameBoard);
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

    public static void placeMarker(char[][] gameBoard) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Placement (1-9): ");
        int input = scan.nextInt();

        
        switch (input) {
            case 1:
                if (gameBoard[0][0] == ' ') {
                    gameBoard[0][0] = 'x';
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 2:
                if (gameBoard[0][2] == ' ') {
                    gameBoard[0][2] = 'x';
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 3:
                if (gameBoard[0][4] == ' ') {
                    gameBoard[0][4] = 'x';
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 4:
               if (gameBoard[2][0] == ' ') {
                    gameBoard[2][0] = 'x';
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 5:
                if (gameBoard[2][2] == ' ') {
                    gameBoard[2][2] = 'x';
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 6:
                if (gameBoard[2][4] == ' ') {
                    gameBoard[2][4] = 'x';
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 7:
                if (gameBoard[4][0] == ' ') {
                    gameBoard[4][0] = 'x';
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 8:
                if (gameBoard[4][2] == ' ') {
                    gameBoard[4][2] = 'x';
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 9:
                if (gameBoard[4][4] == ' ') {
                    gameBoard[4][4] = 'x';
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            
        }
    }
}