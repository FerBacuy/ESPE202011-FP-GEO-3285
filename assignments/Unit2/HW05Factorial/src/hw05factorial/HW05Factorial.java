/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw05factorial;

import java.util.Scanner;

/**
 *
 * @author DIANA BACUY
 */
public class HW05Factorial {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      
        
        // DONE
        int i;
        long factorial;
        int number;
               
        i = 1;
        factorial = 1;
         
      System.out.println("Enter the number to factorize:");
      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();
      
     if(number>=0 && number<=15) {        
         while(i <=number) {
             factorial = factorial * i;
             i++;
         }  
         System.out.println(+number+ "! is iqual to " + factorial);
         
     } else {
         System.out.println(" Its a invalid number ");
      
     }
    
   }

}
