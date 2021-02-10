/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12libraries;

/**
 *
 * @author USER
 */
public class WS12Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float squareRoot = 0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;
        float absoluteValue = 0.0F;

        number = 9;
        squareRoot = (float) Math.sqrt((float) number);
        System.out.println("the square root fo -->" + number + "<---is--->" + squareRoot);

        number = 49;
        squareRoot = (float) Math.sqrt((float) number);
        System.out.println("the square root fo -->" + number + "<---is--->" + squareRoot);

        number = 5;
        squareRoot = (float) Math.sqrt((float) number);
        System.out.println("the square root fo -->" + number + "<---is--->" + squareRoot);

        base = 3;
        exponent = 2;
        power = (float) Math.pow(base, exponent);
        System.out.println("the power of -->" + base + " to " + exponent+ "<---is--->" + power);

        power = (float) Math.pow((float) base, (float) exponent);
        System.out.println("the power of -->" + base + " to " + exponent+ "<---is--->" + power);

        base = 2;
        exponent = 4;
        power = (float) Math.pow((float) base, (float) exponent);
        System.out.println("the power of -->" + base + " to " + exponent+ "<---is--->" + power);

        base = 78;
        exponent = 5;
        power = (float) Math.pow((float) base, (float) exponent);
        System.out.println("the power of -->" + base + " to " + exponent+ "<---is--->" + power);

        absoluteValue = getabsoluteValue(number);
        number = -5;
        absoluteValue = getabsoluteValue(number);
        System.out.println("The absolute value of ---> " + number + " is " + absoluteValue);

        number = 5;
        absoluteValue = getabsoluteValue(number);
        System.out.println("The absolute value of ---> " + number + " is " + absoluteValue);

    }

    public static float computePower(float base, float exponent) {
        float power;
        power = 1.0F;
        for (int i = 1; i <= (int) exponent; i++) {
            power = power * base;
        }
        return power;

    }

    public static float getabsoluteValue(float number) {
        //if (number <= 0) {
        //number = number * -1;
        //return number;
        //}
        // return number;
        //}
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }
}
