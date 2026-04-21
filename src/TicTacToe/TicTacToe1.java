public class TicTacToe1 {

    char[][] board = new char[3][3];

    // Constructor
    public TicTacToe1() {
        initializeBoard();
    }

    // Initialize board
    void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Display board
    void displayBoard() {
        System.out.println("TIC TAC TOE BOARD\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe1 game = new TicTacToe1();
        game.displayBoard();
    }
}