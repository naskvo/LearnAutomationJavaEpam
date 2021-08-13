package javafundamentals.optionaltask2;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrix {
    // 1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
    public static int[][] initializeMatrix(int n, int M) {
        final int FROM_NUMBER = -M;
        final int TO_NUMBER = M;
        final int RANGE = TO_NUMBER - FROM_NUMBER;
        int [][] mas = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int)(Math.random()*RANGE) - M;
            }
        }
        return mas;
    }
    public static int[][] swapStrings(int a, int b, int[][]mas) {
        int[] store = new int[mas[a].length];
        System.arraycopy(mas[a], 0, store, 0, mas[a].length);
        System.arraycopy(mas[b], 0, mas[a], 0, mas[a].length);
        System.arraycopy(store, 0, mas[b], 0, mas[a].length);
        return mas;
    }
    public static void printMatrix (int[][] mas, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(mas[i]));
        }
    }
    public static void main(String[] args) {
        final int M = 100; //range of random values (from -M to M)
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number n (matrix dimension):");
        int n = in.nextInt(); //matrix dimension
        if (n<=0)
            throw new IllegalArgumentException("Invalid n value: value greater than 0 is expected");
        int[][] matrix = initializeMatrix(n, M);
        System.out.println("This is the initial matrix:");
        printMatrix(matrix, n);
        System.out.println("Enter a column number - k - from 0 to n-1:");
        int k = in.nextInt(); //column to be sorted
        if (k>n-1||k<0)
            throw new IllegalArgumentException("Invalid k value: value from 0 to n-1 is expected");
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n-j; i++) {
                if (matrix[i][k]>matrix[i+1][k]) {
                    matrix = swapStrings(i, i+1, matrix);
                }
            }
        }
        System.out.println("This is the sorted matrix:");
        printMatrix(matrix, n);
    }
}
