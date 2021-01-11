/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author USER
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int mult;
        int div;
        
        int addendl;
        int addend2;
        
        int minuend;
        int subtrahend;
        
        int multiplicand;
        int multiplier;
        
        int dividend;
        int divisor;
        
        
        //initializacion
        addendl = 5;
        addend2 = 18;
        
        minuend = -23;
        subtrahend = -6;
        
        multiplicand = -8;
        multiplier = 5;
        
        dividend = 89;
        divisor= 13;
               
        //operation
        sum = addendl + addend2;
        
                System.out.println( " The addition of " + addendl + " + " + addend2 + 
                        " is igual to --> " +sum ); 
        
        mult = multiplicand * multiplier;
                
                System.out.println( " The multiplication of " + multiplicand + " * " 
                        + multiplier + " is igual to --> " + mult ); 
                
        div = dividend / divisor;
              
                System.out.println(" The division of " + dividend + " / " + divisor + 
                        " is igual to --> " + div + " ,and the modulus of division "
                        + "is igual to --> " + (dividend % divisor)); 
             
    ++sum;
    System.out.println( " sum is igual to --> " +sum);
    
    sum++;
    System.out.println( " sum is igual to --> " +sum);
    
    System.out.println( " adding one to sum --> " + (sum++));
    
    System.out.println( " adding one to sum --> " + ((++sum)));
    
    System.out.println(" The sustraction of " + minuend + " - " + subtrahend +
            " is iqual to " + (minuend - subtrahend));
      
    }
    
}
