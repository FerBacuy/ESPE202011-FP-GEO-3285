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
public class SelectionSort {

    public int[] sort(int[] unsortedArray) {
        int size = unsortedArray.length;
        int minumum;
        int pos;

        for (int i = 0; i < size - 1; i++) {
            minumum = unsortedArray[i];
            pos = i;
            for (int j = i + 1; j < size; j++) {
                if (unsortedArray[j] < minumum) {
                    minumum = unsortedArray[j];
                    pos = j;
                }

                //swap
            }
            unsortedArray[pos] = unsortedArray[i];
            unsortedArray[i] = minumum;

            printMatrix(unsortedArray);
        }

        return unsortedArray;
    }

    public void printMatrix(int[] unsortedArray) {
        for (int element : unsortedArray) {
            System.out.print(element + " \t ");
        }
        System.out.println("");
    }

    public int[] sort2(int[] unsortedArray) {
        int size = unsortedArray.length;
        int minumumIndex;
        int pos;

        for (int i = 0; i < size - 1; i++) {
            minumumIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (unsortedArray[j] < unsortedArray[minumumIndex]) {
                    minumumIndex = j;
                }

                //swap
            }
            pos = unsortedArray[minumumIndex];
            unsortedArray[minumumIndex] = unsortedArray[i];
            unsortedArray[i] = pos;

            printMatrix(unsortedArray);
        }

        return unsortedArray;
    }

}