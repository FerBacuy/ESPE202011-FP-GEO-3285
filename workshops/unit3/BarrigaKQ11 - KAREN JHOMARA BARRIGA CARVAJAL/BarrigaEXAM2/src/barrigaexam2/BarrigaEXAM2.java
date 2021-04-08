/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barrigaexam2;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class BarrigaEXAM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //add elements
        int[] integerElements;
        int sum = 0;
        integerElements = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Plese the number " + i + " ->");
            integerElements[i] = input.nextInt();
            sum = calculateSumIntegers(sum, integerElements, i);
        }
        System.out.println("====The total sum is -> " + sum);
        System.out.println();
        //Compute the average of three elments

        float[] elements;
        float add = 0;
        float average = 0;

        elements = new float[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Plese the elements for operation " + i + " ->");
            elements[i] = input.nextFloat();
            add = calculateSumForAverage(add, elements, i);
            average = calculateAverage(add);
        }
        System.out.println("The sum of this  -> " + add);
        System.out.println("=====The avarage is  -> " + average);
        System.out.println();

        //find out if a specific integer is part of an array
        int[] matrix = {12, 23, 34, 98, 87, 65, 0};
        int n;

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Please the number that you wanto to find" + i + " ->" );
            n = input.nextInt();
            if (n == matrix[i]) {
                System.out.println("===True====");
            } else {
                System.out.println("===Flase==-");
            }
        }

    }

    private static int calculateSumIntegers(int sum, int[] integerElements, int i) {
        sum = sum + integerElements[i];
        return sum;
    }

    private static float calculateAverage(float add) {
        float average;
        average = add / 3;
        return average;
    }

    private static float calculateSumForAverage(float add, float[] elements, int i) {
        add = add + elements[i];
        return add;
    }

}
