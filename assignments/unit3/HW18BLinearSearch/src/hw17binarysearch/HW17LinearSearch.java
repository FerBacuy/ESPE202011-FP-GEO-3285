/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17binarysearch;

import java.util.Scanner;

/**
 *
 * @author DIANA FERNANDA BACUY TARCO
 */
public class HW17LinearSearch {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the number to search ");
        double x = input.nextDouble();
        int i = 0;
        int[] stuffedAnimals = {5, 7, 3, 4, 1, 9, 0};
        searchTheCheapestPrice(i, stuffedAnimals, x);
    }

    private static double searchTheCheapestPrice(int i, int[] elements, double x) {

        for (i = 0; i < elements.length; i++) {
            if (elements[i] == x) {
                System.out.println(x + " this price present at location " + (i + 1));
                break;
            }
        }
        if (i == elements.length) {
            System.out.println(x + " this price doesn't exist in array.");
        }
        return -1;
    }

    public static int search(int elements[], int x) {
        int n = elements.length;
        for (int i = 0; i < n; i++) {
            if (elements[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int elements[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (elements[mid] == x) {
                return mid;
            }
            if (elements[mid] > x) {
                return binarySearch(elements, left, mid - 1, x);
            }
            return binarySearch(elements, mid + 1, right, x);
        }
        return -1;
    }
}
