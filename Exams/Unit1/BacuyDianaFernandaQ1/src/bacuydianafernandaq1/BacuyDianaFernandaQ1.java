/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacuydianafernandaq1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BacuyDianaFernandaQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Multiplication tables =======");
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int n;
                    int top = 12;
                    System.out.println("What table do you want to study");
                    n = input.nextInt();
                    for (int i = 1; i<=top; i++){
                    System.out.println(  + n + "*"+ i +"  = " +n*i );
                    }
                    System.out.println("Press 0 to exit");
                    break;
                
                case 0:                  
                    System.out.println("Press 0 to exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}