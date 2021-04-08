/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float processor = 0;
        float harddisk = 0;
        int battery = 0;
        System.out.println("AUTHOR DIANA FERNANDA BACUY TARCO");
        Scanner data = new Scanner(System.in);

        System.out.println("Enter the capacity of you processor in GHz");
        processor = data.nextInt();

        System.out.println("Enter the capacity of you processor in GB");
        harddisk = data.nextInt();

        System.out.println("Enter the capacity of you processor in Hours");
        battery = data.nextInt();

        CalculatePreocessor(processor);

        CalculateTerabytes(harddisk, battery);
    }

    private static void CalculatePreocessor(float processor) {

        if (processor < 3) {
            {
                System.out.println("You can have Multimedia equipment\n"
                        + "Gaming equipment\n"
                        + "Labor-intensive computers");
            }
        } else {
            System.out.println("With you processor. You can't do arithmetic calculations with more than 500 characters ");
        }
    }

    private static void CalculateTerabytes(float harddisk, int battery) {

            {

            float Terabytes = 1024 * harddisk;
            System.out.println("You hardisk in terabytes is " + Terabytes);

            {
                float milliamperehour = 2500 * battery;
                System.out.println("You battery in milliamperehour " + milliamperehour);

            }

        }
    }
}
