/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw09.embeddedstructures;

import java.util.Scanner;

/**
 *
 * @author JHOMARA BARRIGA FERNANDA BACUY ISRAEL ARTEAGA XIOMARA BORJA
 */
public class HW09EmbeddedStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE
        //Variables declaration

        int operand1;
        int operand2;
        int sum;
        int product1;
        int top = 12;
        int product2 = 0;
        int product3;
        int module;
        float quotient = 0;
        int multiplier1 = 1;
        int multiplier2 = 1;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println(" Enter operand1 ");
            operand1 = input.nextInt();
            System.out.println(" Enter operand2 ");
            operand2 = input.nextInt();

            if (operand1 % 2 == 0 && operand2 % 2 == 0) {
                showProduct(operand1, operand2);

            } else {

                if (operand1 % 3 == 0 && operand2 % 3 == 0) {
                    showSum(operand1, operand2);

                } else {

                    if (operand1 % 7 == 0 && operand2 % 7 == 0) {
                        showModule(operand1, operand2);
                    } else {

                        if (operand1 % 11 == 0 && operand2 % 11 == 0) {

                            if (operand1 != 0) {
                                System.out.println(" the table of --> " + operand1 + " <-- ");

                                for (int i = 1; multiplier1 <= top; multiplier1++) {
                                    showTheProduct(operand1, multiplier1);
                                }
                            }
                        }
                        multiplier1 = 1;

                        if (operand1 % 11 == 0 && operand2 % 11 == 0) {

                            if (operand2 != 0) {
                                System.out.println(" the table of --> " + operand2 + " <-- ");

                                for (int i = 1; multiplier2 <= top; multiplier2++) {
                                    product3 = operand2 * multiplier2;
                                    System.out.println(operand2 + " x " + multiplier2 + " = " + product3);
                                }
                            }

                            multiplier2 = 1;

                        } else {
                            if (operand1 % 13 == 0 && operand2 % 13 == 0) {
                                quotient = operand1 / operand2;

                                System.out.println("The quotient is " + quotient);

                            }
                        }

                    }
                }
            }
        } while (operand1 > 0);
    }

    private static void showTheProduct(int operand1, int multiplier1) {
        int product2;
        product2 = operand1 * multiplier1;
        System.out.println(operand1 + " x " + multiplier1 + " = " + product2);
    }

    private static void showModule(int operand1, int operand2) {
        int module;
        module = operand1 % operand2;
        System.out.println(" The modul is " + module);
    }

    private static void showSum(int operand1, int operand2) {
        int sum;
        sum = operand1 + operand2;
        System.out.println(" The sum is " + sum);
    }

    private static void showProduct(int operand1, int operand2) {
        int product1;
        product1 = operand1 * operand2;
        System.out.println(" The product is " + product1);
    }
}

