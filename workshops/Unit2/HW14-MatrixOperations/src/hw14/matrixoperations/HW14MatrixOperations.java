/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14.matrixoperations;

import java.util.Scanner;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class HW14MatrixOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[rows][columns];
        int[][] B = new int[rows][columns];
        int[][] C = new int[rows][columns];

        //Se introducen por teclado los valores de la matriz
        System.out.println("Enter the data of the matrix A: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("MATRIZ 3 * 3:");
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

        System.out.println("MATRIX 3 * 3:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");

            }
            System.out.println();
        }
        int i = 0;
        int j = 0;
        
        
        
        C[i][j] = A[i][j] *B[i][j];
        System.out.println("THE MULTIPLICATION OF A" + A[i][j] + "* B " +  B[i][j]+ "IS --- > " + C[i][j]);
    }
}
