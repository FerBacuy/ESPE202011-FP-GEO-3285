/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;
import java.util.Scanner;

/**
 *
 * @Diana Bacuy
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
      //Done
       long n,p,r=1;
	
       Scanner sc=new Scanner(System.in);
 
       System.out.println("enter number");
	  
       n=sc.nextLong();
 
       System.out.println("enter power");
	  
       p=sc.nextLong();
 
       if(n>=0&&p==0)
       {   
          r =1;
       }
       else if(n==0&&p>=1)
	{   
            r=0;
	} 
       else
	{ 
              for(int i=1;i<=p;i++)
	       { 
                   r=r *n;
 	 	}    
  	 }    
 
    	  System.out.println(n+"^"+p+"="+r);
 
    }
 
          
    }
         


