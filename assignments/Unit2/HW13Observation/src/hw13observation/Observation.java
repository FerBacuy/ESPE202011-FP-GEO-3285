/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw13observation;

import java.util.Scanner;

/**
 *
 * @author DIANA FERNANDA BACUY TARCO
 */
public class Observation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] starNames;
        String[] stars = {"Sirio", "Canopus", "Arturo","Alfa Centauri A"};
        float[] distanceLightYears = { 1.2F, 2.4F, 45.2F, 80.1F, 4.3F, 4.5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the name of stars closest to the earth-> ");
        n = input.nextInt();

        starNames = new int[n];
        //chickens = new String[20];
        //weightsByCoop = new float[n];

//        eggsByCoop[0] = 7;
//        eggsByCoop[1] = 9;
//        eggsByCoop[2] = 3;
//        eggsByCoop[3] = 9;
//        eggsByCoop[4] = 8;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of nearest stars  " + (i + 1) + " -> ");
            starNames [i] = input.nextInt();
        }

        for (float distances  : starNames ) {
            System.out.println("the distance is " + distances+ "Ligth Years");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("nearest stars " + (i + 1) + " -> " + starNames[i]);
        }

        for (String star : stars) {
            System.out.println("star name -> " + star);
        }

        for (int i = 0; i < distanceLightYears.length ; i++) {
            System.out.println("Distance 1ight years" + (i + 1) + " -> " + distanceLightYears[i]);
        }

    }

}