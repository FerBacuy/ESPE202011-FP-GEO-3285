/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;

import static java.lang.Math.sqrt;
import java.util.Scanner;


/**
 *
 * @author USER
 */
public class HWO4Menus {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Area of a right-angled triangle");
            System.out.println("2. -> Area of a circle");
            System.out.println("3. -> Hypotenuse calculation");
            System.out.println("4. -> Sum of the first n numbers");
            System.out.println("5. -> Exit");
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    float base;
                    float height;
                    float area1;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter height -> ");
                    height = input.nextInt();
                    area1 = (base * height)/2;
                    System.out.println(" The area of this triangle  --> " + area1);
                    break;
                case 2:
                    float r;
                    float area2;
                    System.out.println("enter radio -> ");
                    r = input.nextInt();
                    area2 = (float) ((Math.PI) * Math.pow(r,2));                   
                    System.out.println("The area of a circle  --> " + area2);
                    break;
                case 3:
                    float adjacentredneck;
                    float oppositelegt;
                    float hypotenuse;
                    System.out.println("opposite leg -> ");
                    oppositelegt = input.nextInt();
                    System.out.println("enter multiplier -> ");
                    adjacentredneck = input.nextInt();
                    hypotenuse = (float) sqrt((Math.pow(oppositelegt,2))+ Math.pow(adjacentredneck,2));
                    System.out.println(" the hypotenuse calculation--> " + hypotenuse);
                    break;
                case 4:
                    int number;
                    double sum;
                    int even;
                    int odd = 0;
                    System.out.println("Enter the number -> ");    
                    number = input.nextInt();
                    for (int i = 0 ; 1 <number ; i++){
                    if (number %2==0)
                    {
                        even = number +2;
                        System.out.println("la suma es " + even);
                    {
                    }
                    }else{
                    
                        odd = number +1;
                        System.out.println("la suma es " + odd);
                    }                                
                    }
                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}