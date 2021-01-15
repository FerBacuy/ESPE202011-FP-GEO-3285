/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03_interations;

import java.util.Scanner;


/**
 *
 * @author USER
 */
public class HW03_Interations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NUMBER OF LIST

        int i;
        i = 0;
        System.out.println("==== Bucle from number 1 to my list number ====");
        while (i < 6) {
            System.out.println("i -> " + (i + 1));
            //i += 1;
            i++;
            //i = i + 1;
        }
         
         //MULTIPLYING TABLE OF NUMBER 
        System.out.println("Multiplication Tables : 6");
        i=1;
        int top=12;
        int product;
        int table = 6;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("6 * " + j + " = " + product);
        }
        // INTEREST ON A 5% AMORTIZED CAPITAL.
        
        System.out.println("You will earn according to your investment ");
        i=1;
        int month = 12;
        int capital = 700;
        double interes = 0.05;
        double inversion;
        for (int j = 1 ; j <= month ; j++){
            inversion =  j* interes * capital;
            System.out.println(" In this month " + j + " you will win " + inversion);
        }
        
    }
        
}  
    
