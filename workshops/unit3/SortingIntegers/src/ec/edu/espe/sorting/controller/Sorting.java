/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sorting.controller;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class Sorting {

    public int[] sortByBubbleSort(int[] integers) {
        int n = integers.length;
        int[] sortedArray;

        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    //swap
                    temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;

                }
            }

        }
        return integers;
    }

}
