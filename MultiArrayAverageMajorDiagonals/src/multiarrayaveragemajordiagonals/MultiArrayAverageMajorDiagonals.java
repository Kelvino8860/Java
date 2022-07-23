/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiarrayaveragemajordiagonals;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultiArrayAverageMajorDiagonals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double[][] array = new double[4][4];
      
      System.out.print("Enter a 4-by-4 matrix >> ");
      for(int row = 0; row < array.length; row++)
      {
          for(int col = 0; col < array[row].length; col++)
          {
              array[row][col] = input.nextDouble();
          }
      }
      
      System.out.println("Average of the elements in the major diagonal is " + 
              averageMajorDiagonals(array));
    }
    public static double averageMajorDiagonals(double[][] array)
    {    
        double sum = 0;
        for(int row = 0; row < array.length; row++)
        {
           sum += array[row][row];
        }
        double average = sum/array.length;
        
        return average;
    }
    
}
