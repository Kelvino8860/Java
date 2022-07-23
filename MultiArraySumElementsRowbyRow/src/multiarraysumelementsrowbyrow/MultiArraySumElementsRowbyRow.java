/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiarraysumelementsrowbyrow;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultiArraySumElementsRowbyRow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create multidimensional array
        double[][] array = new double[3][4];
        
        //prompt user to fill the array
         Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-by-4 matrix row by row >> ");
        for(int row = 0; row < array.length; row++)
        {
            for(int column = 0; column < array[row].length; column++)
            {
                array[row][column] = input.nextDouble();
            }
        }
   
        //use a loop to invoke the sumRow method to print out
        //the sum of elements in each row
      for(int rowIndex = 0; rowIndex < array.length; rowIndex++)  
      {
          System.out.println("Sum of the elements at row " + rowIndex + " is " + sumRow(array,rowIndex));
      }
   
    }
    //call the method and use it to get sum of elements in each row
    public static double sumRow(double[][] array, int rowIndex)
    {     double total = 0;
        
            for(int j = 0; j < array[rowIndex].length; j++)
            {
                total += array[rowIndex][j];
            }
            return total;
    }
    
}
