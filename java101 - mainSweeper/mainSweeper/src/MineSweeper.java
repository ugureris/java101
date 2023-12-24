import java.util.*;
import java.lang.*;

public class MineSweeper {
    int cols, rows, numberOfMines;
    String[][] gameBoard;
    String[][] mineLocations;
    Scanner input = new Scanner(System.in);
    Random rnd = new Random();

    MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.gameBoard = new String[rows][cols];
        this.mineLocations = new String[rows][cols];
        this.numberOfMines = ((rows * cols) / 4);
    }

    public void run() {
        gameBoardPreparation();
        placeMines();


        int line, column;
        System.out.println("\n---> Game Started <---\n");

        int numberOfMines = 0;
        while (true) {

            printArr(gameBoard);

            System.out.print("\nEnter number of rows : ");
            line = input.nextInt();
            System.out.print("Enter number of columns : ");
            column = input.nextInt();

            if (line >= 0 && column >= 0 && line <= rows && column <= cols) {
                if (gameBoard[line][column] == " -") {
                    continue;
                }
                if (!mineLocations[line][column].equals(" *")) {
                    numberOfMines = checkMines(line, column);
                    gameBoard[line][column] = " " + numberOfMines + String.valueOf("");

                } else if (mineLocations[line][column].equals(" *")) {
                    System.out.println("\nYou lose !!!");
                    printArr(mineLocations);
                    break;

                }
                if (this.numberOfMines == isWin()) {// tüm mayınları bulursanız kazanırsınız
                    System.out.println("Congratulations, you have completed the game without stepping on any mines.");
                    printArr(gameBoard);
                    break;
                }

            } else {
                System.out.println("Incorrect entry. Please try again");
                
            }
        }
    }

    public int isWin() {
        int numberOfOpenedCells = 0;

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                if (gameBoard[i][j] == " X") {
                    numberOfOpenedCells++;
                }
            }

        }
        return numberOfOpenedCells;
    }

    public void placeMines()
    {
        int line, column, count = 0;

        while (count != numberOfMines) {
            line = rnd.nextInt(rows);
            column = rnd.nextInt(cols);

            if (mineLocations[line][column] != " *") {
                mineLocations[line][column] = " *";
                count++;
            }
        }
    }

    public void printArr(String[][] arr)
    {
        System.out.print("      ");
        for (int colNumber = 0; colNumber < arr.length; colNumber++) {
            if (colNumber > 10) {
                System.out.print(" " + colNumber);
            } else
                System.out.print("  " + colNumber);
        }
        System.out.println();
        System.out.print("      ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  -");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i >= 10)
                System.out.print(i + "- [ ");
            else
                System.out.print(i + " - [ ");
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ] ");
            System.out.println();
        }
    }

    public void gameBoardPreparation()
    {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                gameBoard[i][j] = " X";
                mineLocations[i][j] = " X";
            }
        }
    }

    public int checkMines(int line, int column) {
        int count = 0;
        int tempRow, tempCol;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                tempRow = line + i;
                tempCol = column + j;

                if (tempCol >= 0 && tempRow >= 0 && tempRow < rows && tempCol < cols) {
                    if (mineLocations[tempRow][tempCol] == " *") {
                        count++;
                    }
                    if (mineLocations[tempRow][tempCol] != " *" && gameBoard[tempRow][tempCol] != " -") {
                        String eleman = gameBoard[tempRow][tempCol];
                        try {
                            Integer.parseInt(eleman);

                        } catch (NumberFormatException e) {
                            gameBoard[tempRow][tempCol] = " -";
                        }
                    }
                }
            }
        }
        return count;
    }
}