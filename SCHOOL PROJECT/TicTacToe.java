import java.util.Scanner;

public class TicTacToe {
    // The game board: a 3x3 2D array of characters
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        boolean gameEnded = false;

        System.out.println("Welcome to Tic-Tac-Toe!");

        while (!gameEnded) {
            printBoard();
            playerMove();
            
            // Check if someone won or the board is full after the move
            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameEnded = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("The game is a tie!");
                gameEnded = true;
            } else {
                // Switch players: if 'X', change to 'O', and vice versa
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    // Fill the board with dashes to start
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the current state of the board to the console
    private static void printBoard() {
        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Handle user input for selecting a row and column
    private static void playerMove() {
        Scanner sc = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.print("Player " + currentPlayer + ", enter your move (row 0-2 and column 0-2) separated by space: ");
            row = sc.nextInt();
            col = sc.nextInt();

            // Validate that the move is within bounds and the cell is empty
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("This move is not valid. Try again.");
            }
        }
    }

    // Logic to check rows, columns, and diagonals for a win
    private static boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }

    // Check if the board is full (Draw condition)
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}