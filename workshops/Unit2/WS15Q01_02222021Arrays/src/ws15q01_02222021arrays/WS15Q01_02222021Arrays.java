/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws15q01_02222021arrays;

import java.util.Scanner;

/**
 *
 * @author Diana Fernanda Bacuy Tarco
 */
public class WS15Q01_02222021Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalOfPlayers = 0;
        String[] players;
        float[] goalAverages;

        

        System.out.println("Please enter the amount of players you want to record ->");
        Scanner scanner = new Scanner(System.in);        
        totalOfPlayers = scanner.nextInt();

        players = new String[totalOfPlayers];
        goalAverages = new float[totalOfPlayers];

        for (int i = 0; i < totalOfPlayers; i++) {
            
            System.out.println("Please enter the name of customer #" + i + "->");
            scanner.nextLine();
            
            players[i] = scanner.nextLine();
            System.out.println("Please enter" + players[i] + "goals average ->");
            goalAverages[i] = scanner.nextFloat();
        }
        
        System.out.println(" Players  ->  \t  goal average ");
        for(int i =0; i < totalOfPlayers; i++){
            System.out.println(players[i] + " ->   \t  " + goalAverages[i]);
        
        }
            
        
    }

}
