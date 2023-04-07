
import java.util.Scanner;

public class TicTacToe {
    public static Character userMark;
    public static Character compMark;
    public static int turn;
    public static String activePlayer;

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
        turn = 1;
        chooseMarker();
        determineActive();
        System.out.println("It is the " + activePlayer + "'s turn.");
        turn++;
        System.out.println(turn);
        determineActive();
        System.out.println("It is the " + activePlayer + "'s turn.");
        // System.out.println("User Marker: " + userMark + "\nComputer Maker: " + compMark);
        // printGameBoard(gameBoard);
        // placeMarker(gameBoard);

    }

    public static void chooseMarker() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome! Please Enter Your Marker (X or O): ");
        userMark = Character.toUpperCase(scan.next().charAt(0));
        


        if ((userMark != 'X') && (userMark != 'O')) {
            System.out.println("\nInvalid Entry. Please input either X or O. \n");
            chooseMarker();
        } else if (userMark == 'X') {
            compMark = 'O';
        } else {
            compMark = 'X';
        }


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
                    gameBoard[0][0] = userMark;
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 2:
                if (gameBoard[0][2] == ' ') {
                    gameBoard[0][2] = userMark;
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 3:
                if (gameBoard[0][4] == ' ') {
                    gameBoard[0][4] = userMark;
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 4:
                if (gameBoard[2][0] == ' ') {
                    gameBoard[2][0] = userMark;
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 5:
                if (gameBoard[2][2] == ' ') {
                    gameBoard[2][2] = userMark;
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 6:
                if (gameBoard[2][4] == ' ') {
                    gameBoard[2][4] = userMark;
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 7:
                if (gameBoard[4][0] == ' ') {
                    gameBoard[4][0] = userMark;
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 8:
                if (gameBoard[4][2] == ' ') {
                    gameBoard[4][2] = userMark;
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;
            case 9:
                if (gameBoard[4][4] == ' ') {
                    gameBoard[4][4] = userMark;
                    printGameBoard(gameBoard);
                } else {
                    System.out.println("invalid move");
                    placeMarker(gameBoard);
                }
                break;

        }
    }

    public static void determineActive() {
        if ((turn + 2) % 2 == 1) {
            if (userMark == 'x') {
                activePlayer = "user";
            } else {
                activePlayer = "comp";
            };
        } else {
            if (userMark == 'x') {
                activePlayer = "comp";
            } else {
                activePlayer = "user";
            }
        }
    }


}





// possible winning combos = 

// [0][0], [0][2], [0][4],
// [2][0], [2][2], [2][4],
// [4][0], [4][2], [4][4]
// [0][0], [2][0], [4][0]
// [0][2], [2][2], [4][2]
// [0][4], [2][4], [4][4]
// [0][0], [2][2], [4][4]
// [4][0], [2][2], [0][4]

