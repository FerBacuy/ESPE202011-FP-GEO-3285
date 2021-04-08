/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws23taxdecalaration;

import java.util.Scanner;
import ec.edu.espe.tax.BasicTax;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class WS23TaxDecalaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price;
        float totalPrice;
        final float IVAPercentage = 12;
        float IVAValue;

        Scanner input = new Scanner(System.in);

        System.out.println("-----Diana Bacuy Taxes-----");
        System.out.println(" IVA -->");
        System.out.println("Enter the price of your products");
        price = input.nextFloat();
        
        IVAValue = BasicTax.computeIva(price, IVAPercentage);
        totalPrice = price+IVAValue;
        System.out.println(" Total price is " + totalPrice);
       
    }

}
