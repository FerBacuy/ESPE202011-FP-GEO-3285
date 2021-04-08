/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacuyfq11.java;

import java.util.Scanner;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class BacuyFQ11Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] integers = new int[5];
        int sum = 0;
                float[] numbers = new float[3];
        float add = 0;
        float media = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five integers");
        
        
               
        sum = operatorAddition(integers, scanner, sum);
        System.out.println("The sum of the 5 integers is: " + sum);
        

        System.out.println("Enter tree numbers ");
        media = operationMedia(numbers, scanner, add, media);
        System.out.println("The media of this tree numbers is: " + media);
        
        

        float[] digit = {12, 23, 34, 98, 87, 65, 0};
        boolean found = false;
        int i = 0;


        System.out.println("Enter a number ");

        digit[i] = scanner.nextInt();

        for (float n : digit) {
            if (n == i) {
                found = true;
                break;

            }
            if (found == true) {
                System.out.println(numbers[i] + " is found.");
                break;
            } else {
                System.out.println(numbers[i] + " is not found.");
                break;
            }
        }

    }

    private static float operationMedia(float[] numbers, Scanner scanner, float add, float media) {
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (float num : numbers) {
            add = add + num;
            media = add / 3;
        }
        return media;
    }

    private static int operatorAddition(int[] integers, Scanner scanner, int sum) {
        for (int i = 0; i < 5; i++) {
            integers[i] = scanner.nextInt();
        }
        for (int number : integers) {
            sum = sum + number;
        }
        return sum;
    }

}
