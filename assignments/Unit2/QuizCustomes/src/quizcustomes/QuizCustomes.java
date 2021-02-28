/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizcustomes;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class QuizCustomes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        int totalCostumers = 0;
        String[] names;
        int[] age;

        System.out.println("Enter number of customers");
        Scanner scanner = new Scanner(System.in);
        totalCostumers = scanner.nextInt();

        names = new String[totalCostumers];
        age = new int[totalCostumers];

        for (int i = 0; i < totalCostumers; i++) {

            System.out.print("Enter the name of customer " + (i + 1) + " -> ");
            scanner.nextLine();

            names[i] = scanner.nextLine();
            System.out.println("Please enter the age of customer" + names[i] + " ->");
            age[i] = scanner.nextInt();

        }
        System.out.println(" Customers  ->  \t  Age ");
        for (int i = 0; i < totalCostumers; i++) {
            System.out.println(names[i] + " ->   \t  " + age[i]);

        }

    }
}
