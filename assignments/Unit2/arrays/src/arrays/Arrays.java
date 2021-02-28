/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option = 0;
        int count = 0;
        int sum = 0;
        double average;

        do {

            System.out.println("1 ➙ JANUARY ");
            System.out.println("2 ➙ FEBRUARY");
            System.out.println("3 ➙ MARCH");
            System.out.println("4 ➙ APRIL");
            System.out.println("5 ➙ MAY");
            System.out.println("6 ➙ JUNE");
            System.out.println("7 ➙ JULY");
            System.out.println("8 ➙ AGOST");
            System.out.println("9 ➙ SEPTEMBER");
            System.out.println("10 ➙ OCTOBER");
            System.out.println("11 ➙ NOVEMBER");
            System.out.println("12 ➙ DECEMBER");
            System.out.println("13 ➙ Exit ✘ \n");
            System.out.printf("Enter your menu option --> ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            System.out.print("Enter 1 to 4 weeks to be averaged : ");
            int weeks = scanner.nextInt();
            int[] temperatures = new int[weeks];

            switch (option) {
                case 1:
                    
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;

                case 2:                   
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;
                    
                case 3:
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;
                    
                case 4:
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;
                    
                case 5:
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;
                    
                case 6:
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;
                    
                case 7:
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;
                    
                case 8:
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;
                    
                case 9:
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;
                    
                case 10:
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;
                    
                case 11:
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;
                    
                case 12:
                    sum = readTemperature(weeks, temperatures, input, sum);
                    average = operatorAverage(sum, weeks);
                    count = readWeeks(weeks, temperatures, average, count);
                    calculateRain(average, count);
                    break;

                case 13:
                    System.out.println("IT HAS BEEN A PLEASURE TO HELP YOU ( ＾◡＾)"
                            + "COME BACK SOON...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR ✘ \n");
                    System.exit(0);
                    break;
            }

        } while (option < 13);

    }
    
    
    
    
    

    private static int readWeeks(int weeks, int[] temperatures, double average, int count) {
        for (int i = 0; i < weeks; i++) {
            if (temperatures[i] > average) {
                count++;
            }
        }
        return count;
    }

    private static void calculateRain(double average, int count) {
        System.out.printf("Average temp = %.1f\n", average);
        if (average <= 20) {
            System.out.println("There is a 95% probability of rain that week.");
        }
        System.out.println(count + " weeks above average");
    }

    private static int readTemperature(int weeks, int[] temperatures, Scanner input, int sum) {
        for (int i = 0; i < weeks; i++) {
            System.out.print("Week " + (i + 1) + "'s low temperature in °C: ");
            temperatures[i] = input.nextInt();
            sum += temperatures[i];
        }
        return sum;
    }

    private static double operatorAverage(int sum, int weeks) {
        double average = (double) sum / weeks;
        return average;
    }

}
