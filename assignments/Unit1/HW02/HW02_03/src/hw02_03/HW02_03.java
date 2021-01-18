/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02_03;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class HW02_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//AREA DE UN CONO TRUNCADO

        float h;//height
        float r;//minor radius
        float R;//largest radius
        float g;//generatrix
        float c = (float)1/3;//Constant for the calculation of the volume 
        float Area;
        float Volume;
      
    
        
        //operation
        Scanner scanner = new Scanner( System.in );
        System.out.printf( "Enter the height: " );
        h = scanner.nextFloat();        
        System.out.printf( "Enter the major radius: ");
        R = scanner.nextFloat();        
        System.out.printf( "Enter the minor radius: ");
        r = scanner.nextFloat();
   
        
        //operation
         
        g = (float)sqrt((Math.pow(h, 2))+ Math.pow((R-r),2));
        System.out.println( "The generatrix of the truncated cone is iqual to --> " + g ); 
        
        Area = (float)(Math.PI*(g*(R+r)+(Math.pow(R, 2)+(Math.pow(r, 2)))));
        System.out.println( "The area of the truncated cone is iqual to --> " + Area ); 
        
        Volume =  (float)(c * Math.PI*h*((Math.pow(R, 2)+(Math.pow(r, 2)+R*r))));
        System.out.println( "The volume of the truncated cone is iqual to --> " + Volume );
        System.exit(0);     
    }
    
}
