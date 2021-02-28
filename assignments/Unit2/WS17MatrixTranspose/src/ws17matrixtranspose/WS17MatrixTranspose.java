/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws17matrixtranspose;

import java.util.Scanner;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class WS17MatrixTranspose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] a;
        int[][] b;
        int[][] t;
        int[][] c;
        int m = 0;
        int n = 0;

        Scanner data = new Scanner(System.in);

        System.out.println(" ENTER THE MATRIX DIMENSIONS ");
        System.out.println("\n m (crows)->");
        m = data.nextInt();

        System.out.println("\n n (columns)->");
        n = data.nextInt();

        a = new int[m][n];
        b = new int[m][n];
        c = new int[m][n];

        t = new int[n][m];

        System.out.println("------ MATRIX ELEMENTS -------");

        a = readMatrixElements(m, n, "A", data);
        b = readMatrixElements(m, n, "A", data);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println(" A");

        prettyPrintMatrix(m, n, a);
        System.out.println("");

        System.out.println(" B");
        prettyPrintMatrix(m, n, b);

        transpose(n, m, t, a);

        for (int tab = 0; tab <= n / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println(" TRANSPOSE ");
        prettyPrintMatrix(m, n, t);

        System.out.println("-- THE ADDITION OF A + B --");

        c = addTwoMatrices(m, n, a, b);
        prettyPrintMatrix(m, n, c);
    }

    public static int[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        int[][] matrix;
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("-- ROWS " + (i + 1) + "--");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "] ->");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void transpose(int n, int m, int[][] t, int[][] a) {
        //transposition operation (transpose)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = a[j][i];
            }
        }
    }

    public static int[][] addTwoMatrices(int m, int n, int[][] a, int[][] b) {
        int[][] c;
        c = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void prettyPrintMatrix(int m, int n, int[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == m - 1) {
                        System.out.print("\t");

                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == m - 1) {
                        System.out.print("\t");

                    } else {
                        System.out.print("\t");
                    }
                }
            }
        }
        System.out.println("");
    }

    public static void printMatrix(int m, int n, int[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.println("\t");
                    } else if (i == m - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.println("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.println("\t");
                    } else if (i == m - 1) {
                        System.out.println("\t");

                    } else {
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");
    }
}