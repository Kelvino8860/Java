/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrayfinancialtsunami;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultiDimensionalArrayFinancialTsunami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of banks: ");
       int n = input.nextInt();
       
      System.out.print("Enter asset limit: ");
          int limit = input.nextInt();
          
          //initialize an array borrowers to rep loans
          
          double[][] borrowers = new double[n][n];
          double[] assets = new double[n];
          
          for(int row = 0; row < borrowers.length; row++)
          {
              System.out.print("Enter Bank " + row + " debtors: ");
              for(int col = 0; col < borrowers[row].length; col++)
              {
                  borrowers[row][col] = input.nextDouble();
              }
              System.out.print("Enter Bank " + row + " initial assets: ");
                 assets[row] = input.nextDouble();
          }
          
          unsafeBanks(borrowers,assets,limit);
    }
    
    public static void unsafeBanks(double[][] borrowers, double[] assets, int limit)
    {
        //initialize array to record total assets of banks
        double totalAssets = 0;
        double[] totalAssetsArray = new double[5];
        for(int row = 0; row < borrowers.length; row++)
        {
            for(int col = 0; col < borrowers[row].length; col++)
            {
               totalAssets += borrowers[row][col];
            }
            totalAssets += assets[row];
           totalAssetsArray[row] = totalAssets;
           totalAssets = 0;
        }
       
        //find unsafe banks
        for(int i = 0; i < totalAssetsArray.length; i++)
        {
            if(totalAssetsArray[i] < limit)
            {
                for(int row = 0; row < borrowers.length; row++)
                {
                        if(borrowers[row][i] > 0)
                        {
                            totalAssetsArray[row] -= borrowers[row][i];
                        }
                }
            }
        }
       
        
        //display the unsafe banks
        System.out.print("Unsafe banks are ");
        for(int i = 0; i < totalAssetsArray.length; i++)
        {
            if(totalAssetsArray[i] < limit)
            {
                System.out.print(i + ", ");
            }
        }
    }
    
}
