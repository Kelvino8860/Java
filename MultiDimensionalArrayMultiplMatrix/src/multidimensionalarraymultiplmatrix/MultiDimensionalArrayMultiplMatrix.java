/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraymultiplmatrix;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultiDimensionalArrayMultiplMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        
        System.out.println("Enter matrix1 >> ");
        for(int row = 0; row < matrix1.length; row++)
        {
            for(int col = 0; col < matrix1[row].length; col++)
            {
                matrix1[row][col] = input.nextDouble();
            }
        }
        
          System.out.println("Enter matrix2 >> ");
        for(int row = 0; row < matrix2.length; row++)
        {
            for(int col = 0; col < matrix2[row].length; col++)
            {
                matrix2[row][col] = input.nextDouble();
            }
        }
        
        multiplyMatrix(matrix1,matrix2);
        for(int row = 0; row < multiplyMatrix(matrix1,matrix2).length; row++)
        {
            for(int col = 0; col < multiplyMatrix(matrix1,matrix2)[row].length; col++)
            {
                System.out.printf("%1.1f\t", multiplyMatrix(matrix1,matrix2)[row][col]);
            }
            System.out.println();
        }
    }
    
    public static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2)
    {
        double multiple = 0;
        double[][] result = new double[matrix2.length][matrix2.length];
        for(int row = 0; row < matrix1.length; row++)
        {
            for(int row1 = 0; row1 < matrix1.length; row1++)
            {
               for(int col = 0; col < matrix1[row1].length; col++)
               {
                   multiple += matrix1[row][col] * matrix2[col][row1];
               }
               result[row][row1] = multiple;
               multiple = 0;
            }
            
        }
        return result;
    }
    
}
