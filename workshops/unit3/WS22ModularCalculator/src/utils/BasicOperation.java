/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class BasicOperation {

    //addition, substraction, division, multiplication
    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float subtractTwoNumbers(float minuend, float substraend) {
        float rest = 0;
        rest = minuend - substraend;
        return rest;
        
    }

    public static float multiplyTwoNumbers(float multiplying, float multiplier){
        float multiplication = 0;
        multiplication = multiplying * multiplier;
        return multiplication;
    }
    

    public static float divideTwoNumbers(float dividend, float divisor){
        float divition = 0;
        divition = dividend / divisor;
        return divition;
    }    
    
}
