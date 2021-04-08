/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author dia_n
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] integersToSort = {9, 7, 1, 6, 2, 3};

        System.out.println("Unsorted integers");
        printArray(integersToSort);
        BubbleSort.sort(integersToSort);
        System.out.println("");
        printArray(integersToSort);

        int[] integersToSort2 = {8, 1, 7, 2, 5};

        System.out.println("Unsorted integers");
        printArray(integersToSort2);
        BubbleSort.sort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);

        
    }

    public static void printArray(int[] integers) {
        int n = integers.length;
        for (int i = 0; i < n; i++) {
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }

}
