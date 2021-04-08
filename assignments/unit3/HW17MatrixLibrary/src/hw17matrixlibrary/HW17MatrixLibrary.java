/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17matrixlibrary;

import java.util.Scanner;

/**
 *
 * @author dia_n
 */
public class HW17MatrixLibrary {

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

        System.out.println("MATRIZ 3 * 3:");
        System.out.println("THE MULTIPLICATION OF A" + A[i][j] + "* B " + B[i][j] + "IS --- > " + C[i][j]);

        introduceMatrixA(rows, columns, A, sc);
        showMatrixA(A, rows, columns, B, sc);
        introduceMatrixB(B);
        calculateMultiplicationMatrices(C, i, j, A, B);
    }

}
