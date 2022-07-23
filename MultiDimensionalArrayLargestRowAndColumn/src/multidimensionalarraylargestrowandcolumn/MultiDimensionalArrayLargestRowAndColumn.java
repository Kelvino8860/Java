/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraylargestrowandcolumn;

import java.util.Arrays;

/**
 *
 * @author NJORO
 */
public class MultiDimensionalArrayLargestRowAndColumn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                matrix[row][col] = (int)(Math.random()*2);
            }
        }
      displayMatrix(matrix);
    }
    
    public static void displayMatrix(int[][] matrix)
    {
           for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
           largestRowsCols(matrix);
    }
    
    public static void largestRowsCols(int[][] matrix)
    {   
        int sumRow = 0;
        int sumCol = 0;
        int[] countRow = new int[matrix.length];
        int[] countCol = new int[matrix.length];
        
            for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                   sumRow += matrix[row][col];
                   sumCol += matrix[col][row];
            }
            countRow[row] = sumRow;
            countCol[row] = sumCol;
            sumCol = 0;
            sumRow = 0;
        }
            findLargest(countRow,countCol);
    }
    
    public static void findLargest(int[] countRow, int[] countCol)
    {
        int temp = countRow[0];      int indexRow = 0;
        int temp2 = countCol[1];     int indexCol = 0;
        
        for(int i = 0; i < countRow.length - 1; i++)
        {
            if(countRow[i + 1] > temp)
            {
                temp = countRow[i + 1];
                indexRow = i + 1;
            }
        }
        
          for(int i = 0; i < countCol.length - 1; i++)
        {
            if(countCol[i + 1] > temp)
            {
                temp = countCol[i + 1];
                indexCol = i + 1;
            }
        }
          
          System.out.println("The largest row index is " + indexRow);
          System.out.println("The largest column index is " + indexCol);
    }
}
