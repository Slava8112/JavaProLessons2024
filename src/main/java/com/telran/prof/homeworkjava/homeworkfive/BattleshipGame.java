package com.telran.prof.homeworkjava.homeworkfive;
import java.util.Random;
import java.util.Scanner;

public class BattleshipGame {
    public static final int BOARD_SIZE = 10;
    public static final int[] SHIP_SIZES = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

    public static void main(String[] args) {
        char[][] playerBoard = new char[BOARD_SIZE][BOARD_SIZE];
        char[][] computerBoard = new char[BOARD_SIZE][BOARD_SIZE];

        initializeBoard(playerBoard);
        initializeBoard(computerBoard);

        placeShipsRandomly(playerBoard, SHIP_SIZES);
        placeShipsRandomly(computerBoard, SHIP_SIZES);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Battleship!");

        while (true) {
            // Player's turn
            System.out.println("\nYour turn:");
            printBoards(playerBoard, hideEnemyShips(computerBoard));
            int playerRow = getValidCoordinate("Enter target row (0-9): ", scanner);
            int playerCol = getValidCoordinate("Enter target column (0-9): ", scanner);

            if (computerBoard[playerRow][playerCol] == 'O') {
                System.out.println("You hit an enemy ship!");
                computerBoard[playerRow][playerCol] = 'X';
            } else {
                System.out.println("You missed!");
                computerBoard[playerRow][playerCol] = '0'; // Show '0' for missed shot
            }

            // Check if player won
            if (countShips(computerBoard) == 0) {
                System.out.println("Congratulations! You sank all enemy ships. You win!");
                break;
            }

            // Computer's turn
            System.out.println("\nComputer's turn:");
            int computerRow = random.nextInt(BOARD_SIZE);
            int computerCol = random.nextInt(BOARD_SIZE);

            if (playerBoard[computerRow][computerCol] == 'O') {
                System.out.println("The computer hit one of your ships!");
                playerBoard[computerRow][computerCol] = 'X';
            } else {
                System.out.println("The computer missed!");
                playerBoard[computerRow][computerCol] = '0'; // Show '0' for missed shot
            }

            // Check if computer won
            if (countShips(playerBoard) == 0) {
                System.out.println("Game over! The computer sank all your ships. You lose!");
                break;
            }
        }

        scanner.close();
    }

    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '.';
            }
        }
    }

    public static void printBoards(char[][] playerBoard, char[][] enemyBoard) {
        System.out.println("Your Board                  Enemy Board");
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(playerBoard[i][j] + " ");
            }
            System.out.print("    ");
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(enemyBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void placeShipsRandomly(char[][] board, int[] shipSizes) {
        Random random = new Random();
        int shipsPlaced = 0;

        while (shipsPlaced < shipSizes.length) {
            int row = random.nextInt(BOARD_SIZE);
            int col = random.nextInt(BOARD_SIZE);
            int shipSize = shipSizes[shipsPlaced];

            if (isValidShipPlacement(board, row, col, shipSize)) {
                placeShip(board, row, col, shipSize);
                shipsPlaced++;
            }
        }
    }

    public static boolean isValidShipPlacement(char[][] board, int row, int col, int shipSize) {
        if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
            return false;
        }
        if (shipSize > 1) {
            if (col + shipSize - 1 >= BOARD_SIZE) {
                return false;
            }
        }
        return true;
    }

    public static void placeShip(char[][] board, int row, int col, int shipSize) {
        for (int i = 0; i < shipSize; i++) {
            board[row][col + i] = 'O';
        }
    }

    public static int countShips(char[][] board) {
        int count = 0;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == 'O') {
                    count++;
                }
            }
        }
        return count;
    }

    public static int getValidCoordinate(String prompt, Scanner scanner) {
        int coordinate;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                coordinate = scanner.nextInt();
                if (coordinate >= 0 && coordinate < BOARD_SIZE) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 0 and " + (BOARD_SIZE - 1) + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
            }
        }
        return coordinate;
    }

    public static char[][] hideEnemyShips(char[][] board) {
        char[][] hiddenBoard = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == 'O') {
                    hiddenBoard[i][j] = '.';
                } else {
                    hiddenBoard[i][j] = '0'; // Show '0' for missed shots
                }
            }
        }
        return hiddenBoard;
    }
}
