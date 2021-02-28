/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12taxes;

import java.util.Scanner;

/**
 *
 * @Diana Bacuy
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        //Annual Income tax calculation 2021

        float revenues = 0;
        float expenses = 0;
        float taxableincome = 0;
        float excessfractiontax = 0;
        float taxableivaamount = 0;
        float limitfreeISD;
        limitfreeISD = 5017.33F;
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter total invoices for sales: ");
        revenues = scanner.nextFloat();
        System.out.printf("Enter total invoices for purchases: ");
        expenses = scanner.nextFloat();
        System.out.printf("The value to be paid this month is: " + taxableivaamount + "\n");
        
        System.out.printf("Enter the amount to send abroad: ");
        float amounttosend = scanner.nextFloat();
        

        System.out.printf("Enter your annual revenues : ");
        revenues = scanner.nextFloat();

        System.out.printf("Enter your annual deductible expenses : ");
        expenses = scanner.nextFloat();

        taxableincome = revenues - expenses;
        System.out.printf("Your taxable income is --> " + taxableincome + "\n");
        
        
        

        if (taxableincome <= 11212) {
            System.out.printf("You do NOT have to pay basic fraction tax or excess fraction tax. \n");
        } else {
            if (taxableincome >= 11212 && taxableincome <= 14285) {
                excessfractiontax = (float) ((taxableincome - 11212) * 0.05);
                System.out.printf("You do NOT have to pay basic fraction tax.\n ");
                System.out.printf("Your payment to the excess fraction tax is. $" + excessfractiontax + "\n");
            } else {
                if (taxableincome >= 14285 && taxableincome <= 17854) {
                    excessfractiontax = (float) ((taxableincome - 14285) * 0.1 + 154);
                    System.out.printf("You have to pay basic fraction tax $154. Your total payment for excess and basic fraction tax $ " + excessfractiontax + "\n");
                } else {
                    if (taxableincome >= 17854 && taxableincome <= 21442) {
                        excessfractiontax = (float) ((taxableincome - 17854) * 0.12 + 511);
                        System.out.printf("You have to pay basic fraction tax $511. Your total payment for excess and basic fraction tax $ " + excessfractiontax + "\n");
                    } else {
                        if (taxableincome >= 21442 && taxableincome <= 42874) {
                            excessfractiontax = (float) ((taxableincome - 21442) * 0.15 + 941);
                            System.out.printf("You have to pay basic fraction tax $941. Your total payment for excess and basic fraction tax $ " + excessfractiontax + "\n");
                            if (taxableincome >= 42874 && taxableincome <= 64297) {
                                excessfractiontax = (float) ((taxableincome - 42874) * 0.20 + 4156);
                                System.out.printf("You have to pay basic fraction tax $4156. Your total payment for excess and basic fraction tax $ " + excessfractiontax + "\n");
                            } else {
                                if (taxableincome >= 64297 && taxableincome <= 85729) {
                                    excessfractiontax = (float) ((taxableincome - 64297) * 0.25 + 8440);
                                    System.out.printf("You have to pay basic fraction tax $8440 Your total payment for excess and basic fraction tax $ " + excessfractiontax + "\n");
                                } else {
                                    if (taxableincome >= 85729 && taxableincome <= 114288) {
                                        excessfractiontax = (float) ((taxableincome - 85.729) * 0.30 + 13798);
                                        System.out.printf("You have to pay basic fraction tax $13798 Your total payment for excess and basic fraction tax $ " + excessfractiontax + "\n");
                                    } else {
                                        if (taxableincome >= 114288) {
                                            excessfractiontax = (float) ((taxableincome - 114288) * 0.35 + 22366);
                                            System.out.printf("You have to pay basic fraction tax $22366. Your total payment for excess and basic fraction tax $ " + excessfractiontax + "\n");
                                        }
                                    }
                                }

                            }
                        }

                    }
                }
            }
        }

        showIVACalculation(revenues, expenses);
        

        
        showISDCalculation(limitfreeISD ,amounttosend);
        

    }

    private static float showIVACalculation(float revenues, float expenses) {

        float taxableivaamount;
        taxableivaamount = (float) ((revenues - expenses) * 0.12);
        return taxableivaamount; 
        
    }

    private static float showISDCalculation(float limitfreeISD , float amounttosend) {
        
        float ISD =0;                    
        if(amounttosend>=limitfreeISD){
            ISD = amounttosend -1200;
            System.out.println("Your value to pay for ISD is: " + ISD);
        }else{
            System.out.println("You are exempt from paying ISD");
        }
        return ISD;
    }
}
