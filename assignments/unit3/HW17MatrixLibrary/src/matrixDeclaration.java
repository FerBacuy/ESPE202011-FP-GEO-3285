
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dia_n
 */
public class matrixDeclaration {

    private static void calculateMultiplicationMatrices(int[][] C, int i, int j, int[][] A, int[][] B) {
        C[i][j] = A[i][j] * B[i][j];
    }

    private static void introduceMatrixB(int[][] B) {
        System.out.println("MATRIX 3 * 3:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");

            }
            System.out.println();
        }
    }

    private static void showMatrixA(int[][] A, int rows, int columns, int[][] B, Scanner sc) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("B[" + i + "][" + j + "]= ");
                B[i][j] = sc.nextInt();
            }
        }
    }

    private static void introduceMatrixA(int rows, int columns, int[][] A, Scanner sc) {

        System.out.println("Enter the data of the matrix A: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }
    }

}
