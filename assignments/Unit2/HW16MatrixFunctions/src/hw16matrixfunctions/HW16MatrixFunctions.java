/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfunctions;

import java.util.Scanner;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class HW16MatrixFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int i = 0;
        int j = 0;

        Scanner sc = new Scanner(System.in);

        int[][] A = new int[rows][columns];
        int[][] B = new int[rows][columns];
        int[][] C = new int[rows][columns];

        System.out.println("Enter the data of the matrix A: ");
        System.out.println("MATRIZ 3 * 3:");
        System.out.println("MATRIX 3 * 3:");

        operatorMatrixA(rows, columns, A, sc);
        readMatrixA(A);
        operatorMatrixB(rows, columns, B, sc);
        readMatrixB(B);
        OperationMultiplicationMatrixAB(C, i, j, A, B);
        System.out.println("THE MULTIPLICATION OF A" + A[i][j] + "* B " + B[i][j] + "IS --- > " + C[i][j]);

    }

    private static void OperationMultiplicationMatrixAB(int[][] C, int i, int j, int[][] A, int[][] B) {
        C[i][j] = A[i][j] * B[i][j];

    }

    private static void readMatrixB(int[][] B) {
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");

            }
            System.out.println();
        }
    }

    private static void operatorMatrixB(int rows, int columns, int[][] B, Scanner sc) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("B[" + i + "][" + j + "]= ");
                B[i][j] = sc.nextInt();
            }
        }
    }

    private static void readMatrixA(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void operatorMatrixA(int rows, int columns, int[][] A, Scanner sc) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }
    }

}
