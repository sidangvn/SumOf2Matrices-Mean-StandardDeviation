//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

import java.util.Scanner;
import java.lang.*;

public class MeanSD
{
   public static void main (String [] args)
   {
      // Declare an array for 10 numbers   
      double[] Num = new double[10];
      
      //Input 10 values of array
      Scanner input = new Scanner(System.in);
      
      //Promt the user to input
      System.out.print("Enter ten numbers: ");
      int lim = 0;
      while (lim <10)
      {
         Num[lim] = input.nextDouble();
         lim ++;
       }
       
      //Output       
      System.out.print("The mean is " + mean(Num)); //call mean method
      System.out.print("\nThe standard deviation is " + deviation(Num));//call deviation method

    }//End of main method
    
   //Beginning of mean method 
   public static double mean (double[] i1)
   {
      //variables to store
      double Num1 = 0;
      double ans =0;
      
      for (int i = 0; i < i1.length; i ++)
         {
            ans += i1[i];
            
            Num1 = ans/i1.length;             
          }
       return Num1;
   } //End of mean method
   
   //Beginning of deviation method
   public static double deviation (double[] u2)
   {   
      //Variables to store     
      double mean2 = mean(u2);      
      double Num2 = 0;
      double devi = 0;
      
      for (int u = 0; u < u2.length; u ++)
         {  
         
             
            devi += Math.pow(u2[u]-mean2,2);
            
            Num2 = Math.sqrt((devi)/(u2.length-1));           
                      }
       return Num2; 
       }//End of deviation method
  
}//End of class MeanSD
