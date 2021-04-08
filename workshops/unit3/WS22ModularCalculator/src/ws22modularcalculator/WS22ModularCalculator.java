/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class WS22ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float operand1;
        float operand2;
        float result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers");
        operand1 = input.nextFloat();
        operand2 = input.nextFloat();

        System.out.println("----ADDITION----");
        result = BasicOperation.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " + " + operand2 + " = " + result);

        System.out.println("----SUBTRACTION----");
        result = BasicOperation.subtractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " - " + operand2 + " = " + result);

        System.out.println("----MULTIPLICATION----");
        result = BasicOperation.multiplyTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " * " + operand2 + " = " + result);

        System.out.println("----DIVITION----");
        result = BasicOperation.divideTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " / " + operand2 + " = " + result);

    }

}
