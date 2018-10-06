//I pledge my Honor that I have not cheated, and will not cheat, on this assignment._Si Dang

import java.util.Scanner;

public class SumMatrix {

    public static void main(String[] args)
     {
    //Setup input
       Scanner input = new Scanner(System.in);
       
    //Variables   
       int[][] m1 = new int[3][3];
       int[][] m2 = new int[3][3];
       
    //Input for 1st matrix
       System.out.print("Enter matrix1: ");
       for (int i = 0; i < m1.length; i++) {
           for (int j = 0; j < m1[0].length; j++) {
               m1[i][j] = input.nextInt();
           }
       }
       
    //Input for 2nd matrix
       System.out.print("Enter matrix2: ");
       for (int i = 0; i < m2.length; i++) {
           for (int j = 0; j < m2[0].length; j++) {
               m2[i][j] = input.nextInt();
           }
       }

    
       int[][] m3 = sum(m1, m2);
       System.out.println("The addition of the matrices is \n");
       
    //Print m1
       int rowsM1 = m1.length;
       int columnsM1 = m1[0].length; 
       for (int i = 0; i < rowsM1; i++)
         {
          for (int j = 0; j < columnsM1; j++)
           {
             System.out.print((double)m1[i][j] + "  "); 
           }
           System.out.println();
         }
         
       System.out.println("   + ");
        
     //Print m2
       int rowsM2 = m2.length;
       int columnsM2 = m2[0].length; 
       for (int i = 0; i < rowsM2; i++) 
         {
         for (int j = 0; j < columnsM2; j++) 
          {
             System.out.print((double)m2[i][j] + "  ");    
           }
           System.out.println();
       }
       
       System.out.println("   = ");

     //Calling sum method
       for (int i = 0; i < m3.length; i++) 
         {
         for (int j = 0; j < m3[0].length; j++) 
           {
             System.out.print((double)m3[i][j] + "  ");
           } 
           System.out.println();
         } 
      }

      //Separate method for the sum of 1st and 2nd matrices
   public static int[][] sum(int[][] m1, int[][] m2) 
      {
       int rowsM1 = m1.length;
       int columnsM1 = m1[0].length; 
       int columnsM2 = m2[0].length;
       int[][] m3 = new int[rowsM1][columnsM2];
       
       for (int i = 0; i < rowsM1; i++) 
         {
         for (int j = 0; j < columnsM2; j++) 
           {
             m3[i][j] = m1[i][j] + m2[i][j]; 
           }
         }
       return m3;
      }
}