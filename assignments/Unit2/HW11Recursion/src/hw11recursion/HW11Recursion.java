/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

/**
 *
 * @Diana Bacuy
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        int result = sum(12);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}
