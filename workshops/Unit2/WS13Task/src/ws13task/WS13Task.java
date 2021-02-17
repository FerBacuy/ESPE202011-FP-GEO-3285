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

        float height;
        float minorradius;
        float largestradius;
        float generatrix = 0;
        float c = (float) 1 / 3;//Constant for the calculation of the volume 
        float AreaCone;
        float AreaCylinder;
        float radius;
        float n;//number of sides
        float sidesSize;
        float baseperimeter;
        float basearea;
        float Totalarea;
        float InicialPosition;
        float velocity;
        float tempo;
        float aceleration;
        float Position;
        float InicialVelocity;
        float distance;

        Scanner scanner = showAreaTruncatedCone(generatrix);
        showAreaofcylinder(scanner);
        System.out.printf("Enter the radius: ");
        radius = scanner.nextFloat();
        System.out.printf("Enter the height: ");
        height = scanner.nextInt();
        
        AreaCylinder = (float) (2 * Math.PI * radius) * (height + radius);
        System.out.println("The area of the cylinder is --> " + AreaCylinder);
        showAreaofacuadrangularprism(scanner);        
        System.out.printf("Enter the number of sides of the prism's base: ");
        n = scanner.nextInt();
        System.out.printf("Enter  how long each side is: ");
        sidesSize = scanner.nextFloat();
        System.out.printf("Enter the height: ");
        height = scanner.nextInt();
        baseperimeter = sidesSize * n;
        basearea = sidesSize * sidesSize;
        Totalarea = (baseperimeter * height) + (2 * basearea);
        System.out.println("The a cuadrangular prism --> " + Totalarea);

        showThePositionFormula(scanner);
        System.out.printf("Enter the inicial position : ");
        InicialPosition = scanner.nextInt();
        System.out.printf("Enter the inicial velocity : ");
        velocity = scanner.nextInt();
        System.out.printf("Enter the tempo: ");
        tempo = scanner.nextInt();
        Position = InicialPosition + (velocity * tempo);
        System.out.println("The final position is --> " + Position);
        
        
        showTheVelocityFormule(scanner);
        System.out.printf("Enter the inicial velocity : ");
        InicialVelocity = scanner.nextInt();
        System.out.printf("Enter the aceleration: ");
        aceleration = scanner.nextInt();
        System.out.printf("Enter the distance traveled  : ");
        distance = scanner.nextInt();
        velocity = (float) sqrt((InicialVelocity * InicialVelocity) + (2 * aceleration * distance));
        System.out.println("The final velocity is --> " + velocity);

    }

    private static void showTheVelocityFormule(Scanner scanner) {
        float InicialVelocity;
        float aceleration;
        float distance;
        float velocity;
        //formula for the final velocity in free fall knowing the acceleration and the distance traveled

    }

    private static void showThePositionFormula(Scanner scanner) {
        float InicialPosition;
        float velocity;
        float tempo;
        float Position;
        // formula of the position in free fall knowing velocity and time

    }

    private static void showAreaofacuadrangularprism(Scanner scanner) {
        float n;
        float sidesSize;
        float height;
        float baseperimeter;
        float basearea;
        float Totalarea;
        // Area of a cuadrangular prism



    }

    private static void showAreaofcylinder(Scanner scanner) {
        float radius;
        float height;
        float AreaCylinder;
        // Area of cylinder

    }

    private static Scanner showAreaTruncatedCone(float generatrix) {
        float height;
        float largestradius;
        float minorradius;
        float AreaCone;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the height: ");
        height = scanner.nextInt();
        System.out.printf("Enter the major radius: ");
        largestradius = scanner.nextInt();
        System.out.printf("Enter the minor radius: ");
        minorradius = scanner.nextInt();
        AreaCone = (int) (Math.PI * (generatrix * (largestradius + minorradius) + (Math.pow(largestradius, 2) + (Math.pow(minorradius, 2)))));
        System.out.println("The area of the truncated cone is iqual to --> " + AreaCone);
        return scanner;
    }

}
