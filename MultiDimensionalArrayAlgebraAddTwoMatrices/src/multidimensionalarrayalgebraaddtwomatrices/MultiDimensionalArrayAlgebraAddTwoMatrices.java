/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrayalgebraaddtwomatrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultiDimensionalArrayAlgebraAddTwoMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double[][] matrix1 = new double[2][2];
        double[][] matrix2 = new double[2][2];
        
        System.out.print("Enter matrix1: ");
        for(int row = 0; row < matrix1.length; row++)
        {
            for(int col = 0; col < matrix1[row].length; col++)
            {
                matrix1[row][col] = input.nextDouble();
            }
        }
        
          System.out.print("Enter matrix2: ");
        for(int row = 0; row < matrix2.length; row++)
        {
            for(int col = 0; col < matrix2[row].length; col++)
            {
                matrix2[row][col] = input.nextDouble();
            }
        }
        
       addMatrix(matrix1,matrix2);
       for(int row = 0; row < addMatrix(matrix1,matrix2).length; row++)
       {
           for(int col = 0; col < addMatrix(matrix1,matrix2)[row].length; col++)
           {
               System.out.print(addMatrix(matrix1,matrix2)[row][col] + " ");
           }
           System.out.println();
       }
    }
    
    public static double[][] addMatrix(double[][] a, double[][] b)
    {
        double[][] total = new double[2][2];
        double sum = 0;
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                sum += a[row][col] + b[row][col];
                total[row][col] = sum;
                sum = 0;
            }
        }
        
        return total;
    }
    
}
