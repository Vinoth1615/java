package Igenuine.src.Day5;
import java.util.Scanner;

public class MagicSquare {

    public boolean magicSquare() {
        int[][] arr = initialize2DArray();
        if (arr.length != arr[0].length) {
            System.out.println("Matrix is not square, cannot be a magic square.");
            return false;
        }
        int[] sumOfDiagonal = sumOfDiagonal(arr);
        int[][] sumOfRowsAndCols = sumOfRowsAndCol(arr);
        int targetSum = sumOfDiagonal[0];
        if (sumOfDiagonal[0] != sumOfDiagonal[1]) {
            return false;
        }
        for (int sum : sumOfRowsAndCols[0]) {
            if (sum != targetSum) {
                return false;
            }
        }
        for (int sum : sumOfRowsAndCols[1]) {
            if (sum != targetSum) {
                return false;
            }
        }
        return true;
    }

    public int[][] initialize2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows and Columns (n x n matrix): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter the values row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public void display2DArray(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public int[] sumOfDiagonal(int[][] arr) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            primaryDiagonalSum += arr[i][i];
            secondaryDiagonalSum += arr[i][arr.length - i - 1];
        }

        return new int[]{primaryDiagonalSum, secondaryDiagonalSum};
    }

    public int[][] sumOfRowsAndCol(int[][] arr) {
        int[] sumOfRows = new int[arr.length];
        int[] sumOfCols = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                rowSum += arr[i][j];
            }
            sumOfRows[i] = rowSum;
        }
        for (int j = 0; j < arr[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < arr.length; i++) {
                colSum += arr[i][j];
            }
            sumOfCols[j] = colSum;
        }

        return new int[][]{sumOfRows, sumOfCols};
    }

    public static void main(String[] args) {
        MagicSquare ms = new MagicSquare();
        boolean isMagicSquare = ms.magicSquare();

        if (isMagicSquare) {
            System.out.println("The given matrix is a Magic Square!");
        } else {
            System.out.println("The given matrix is NOT a Magic Square.");
        }
    }
}