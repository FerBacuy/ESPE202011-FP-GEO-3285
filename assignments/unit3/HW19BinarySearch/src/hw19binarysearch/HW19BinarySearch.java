/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw19binarysearch;

import java.util.Scanner;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class HW19BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        class BinarySearch {


            int binarySearch(int arr[], int l, int r, int x) {
                if (r >= l) {
                    int mid = l + (r - l) / 2;

                    if (arr[mid] == x) {
                        return mid;
                    }


                    if (arr[mid] > x) {
                        return binarySearch(arr, l, mid - 1, x);
                    }

                    return binarySearch(arr, mid + 1, r, x);
                }

                return -1;
            }

            {
                BinarySearch ob = new BinarySearch();
                int arr[] = {2, 3, 4, 10, 40};
                int n = arr.length;
                int x = 10;
                int result = ob.binarySearch(arr, 0, n - 1, x);
                if (result == -1) {
                    System.out.println("Element not present");
                } else {
                    System.out.println("Element found at index " + result);
                }
            }
        }
    }
}
