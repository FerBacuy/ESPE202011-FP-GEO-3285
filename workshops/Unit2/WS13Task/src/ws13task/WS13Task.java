/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13task;

import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 *
 * @author DIANA BACUY
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODONE
        // AreaCone of the truncated cone  

        float height = 0;
        float minorradius = 0;
        float largestradius = 0;
        float generatrix = 0;
        float c = (float) 1 / 3;//Constant for the calculation of the volume 
        float AreaCone = 0;
        float AreaCylinder = 0;
        float radius = 0;
        float numberofsides = 0;//number of sides
        float sidesSize = 0;
        float baseperimeter = 0;
        float basearea = 0;
        float Totalarea;
        float InicialPosition = 0;
        float velocity = 0;
        float tempo = 0;
        float aceleration = 0;
        float Position = 0;
        float InicialVelocity = 0;
        float FinalVelocity = 0;
        float distance = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Area of a truncated cocne: \n");     
        System.out.printf("Enter the height: \n");  
        height = scanner.nextInt();
        System.out.printf("Enter the major radius: ");
        largestradius = scanner.nextInt();
        System.out.printf("Enter the minor radius: ");
        minorradius = scanner.nextInt();
        System.out.println("The area this cone is --> " + AreaCone);
        
        System.out.printf("Area of a cylinder: \n");
        System.out.printf("Enter the radius: ");
        radius = scanner.nextFloat();
        System.out.printf("Enter the height: ");
        height = scanner.nextInt();
        System.out.println("The area of the cylinder is --> " + AreaCylinder);
        
        System.out.printf("Area of a cuadrangular prism: \n");
        System.out.printf("Enter the number of sides of the prism's base: ");
        numberofsides = scanner.nextInt();
        System.out.printf("Enter  how long each side is: ");
        sidesSize = scanner.nextFloat();
        System.out.printf("Enter the height: ");
        height = scanner.nextInt();
        System.out.println("The area this cone is --> " + AreaCone);
  
        System.out.printf("The Position Formule: \n");
        System.out.printf("Enter the inicial position : ");
        InicialPosition = scanner.nextInt();
        System.out.printf("Enter the inicial velocity : ");
        velocity = scanner.nextInt();
        System.out.printf("Enter the tempo: ");
        tempo = scanner.nextInt();
        System.out.println("The position is  --> " + Position);
               
        System.out.printf("The Velocity Formule: \n");
        System.out.printf("Enter the inicial velocity : ");
        InicialVelocity = scanner.nextInt();
        System.out.printf("Enter the aceleration: ");
        aceleration = scanner.nextInt();
        System.out.printf("Enter the distance traveled  : ");
        distance = scanner.nextInt();
        System.out.println("The final velocity is --> " + velocity);
            
        System.out.printf("The Aceleration Formule: \n");
        System.out.printf("Enter the final velocity : ");
        FinalVelocity = scanner.nextInt();
        System.out.printf("Enter the initial velocity ");
        InicialVelocity = scanner.nextInt();
        System.out.printf("Enter the time treveled  : ");
        tempo = scanner.nextInt();
        System.out.println("The position is  --> " + aceleration);       
        
        
        
        calculateAreaTruncatedCone( generatrix,  height, largestradius, minorradius, basearea);
        calculateAreaofcylinder(radius, height);
        calculateAreaofacuadrangularprism(numberofsides, sidesSize, height, baseperimeter, basearea);
        calculateThePositionFormule(InicialPosition, velocity, tempo);      
        calculateTheVelocityFormule(InicialVelocity, aceleration, distance);
        calculateTheAcelerationFomule(FinalVelocity, InicialVelocity, tempo);
    }

    private static float calculateAreaTruncatedCone(float generatrix, float height, float largestradius, float minorradius, float basearea) {
        float AreaCone;
        AreaCone = (int) (Math.PI * (generatrix * (largestradius + minorradius) + (Math.pow(largestradius, 2) + (Math.pow(minorradius, 2)))));
        return AreaCone;
    }

    private static float calculateAreaofcylinder(float radius, float height) {

        float AreaCylinder;
        AreaCylinder = (float) (2 * Math.PI * radius) * (height + radius);
        return AreaCylinder;
    }

    private static float calculateAreaofacuadrangularprism(float numberofsides, float sidesSize, float height, float baseperimeter, float basearea) {
        float Totalarea;

        baseperimeter = sidesSize * numberofsides;
        basearea = sidesSize * sidesSize;
        Totalarea = (baseperimeter * height) + (2 * basearea);
        return Totalarea;
    }

    private static float calculateThePositionFormule(float InicialPosition, float velocity, float tempo) {
        float Position;
        Position = InicialPosition + (velocity * tempo);
        return Position;
    }

    private static float calculateTheVelocityFormule(float InicialVelocity, float aceleration, float distance) {

        float velocity;
        velocity = (float) sqrt((InicialVelocity * InicialVelocity) + (2 * aceleration * distance));
        return velocity;
    }

    private static float calculateTheAcelerationFomule(float FinalVelocity, float InicialVelocity, float tempo) {

        float aceleration;
        aceleration = ((float) FinalVelocity - InicialVelocity) / tempo;
        return aceleration;
    }

}
