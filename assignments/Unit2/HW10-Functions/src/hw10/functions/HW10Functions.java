/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.functions;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        int divd;
        int divr;
        float quotient = 0;
        int x = 0;
        int y = 0;
        int top = 12;
        int product;
        int multiplicand = 0;

        
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the dividend ");
        divd= input.nextInt();
        
        System.out.println(" Enter the divisor ");
        divr= input.nextInt();

        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient is " + quotient); 
        
        System.out.println("Enter the value for f(x)");
        x= input.nextInt();
        
        y = f(x);
        System.out.println("x*x -> " + y);
        
        System.out.println("Enter the value for g(x)");
        x= input.nextInt();
        
        y = g(x);
        System.out.println("x*x +2*x + 1-> " + y);
        
        System.out.println("Enter the number to be multiplied ");
        System.out.println("Multiplication Tables : 6");
         int i = 1;
        int table = 6;
        for (int j = 1 ; j <= top ; j++){
            product = table * j;
            System.out.println("6 * " + j + " = " + product);
        }     

    }



    public static float divideTwoNumbers(int dividend, int divisor) {
        float quotient = 0.0F;
         
        
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
        
    }
        public static int multiplicationtable(int x) {
         int product = 0;

        return product;
        
    
    }

}