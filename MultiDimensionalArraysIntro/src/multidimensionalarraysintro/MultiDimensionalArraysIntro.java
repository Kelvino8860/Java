/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraysintro;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class MultiDimensionalArraysIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaring multidimensional arrays
       int[][] x = new int[3][4];
       x[0][0] = 1;  x[0][1]= 2; x[0][2] = 3;  x[0][3]= 4;
       x[1][0] = 5; x[1][1] = 6; x[1][2] = 7; x[1][3] = 8;
       x[2][0] = 9; x[2][1] = 10; x[2][2] =11; x[2][3] = 12;
       //printing out the array
       for(int row = 0; row < x.length; row++)
       {
           for(int column = 0; column < x[row].length; column++)
           {
               System.out.print(x[row][column] + " ");
           }
           System.out.println();
       }
     int[][] array = new int[5][6];
     int[] y = {1,2,3,4,5,6};
     array[0] = y;
     System.out.println("array[0][1] is " + array[0][5]);
     
     //Initializing arrays with input methods
     Scanner input = new Scanner(System.in);
     int[][] matrix = new int[5][5];
     System.out.println("Enter " + matrix.length + " rows and " + 
             matrix[0].length + " columns");
     for(int row = 0; row < matrix.length; ++row)
     {
         for(int columns = 0; columns < matrix[row].length; ++columns)
         {
             matrix[row][columns] = input.nextInt();
         }
     }
     //Printing out arrays
     for(int row = 0; row < matrix.length; row ++)
     {
         for(int columns = 0; columns < matrix[row].length; columns++)
         {
             System.out.print(matrix[row][columns] + " ");
         }
         System.out.println();
     }
     System.out.println();
     //initializing arrays with random numbers
     int[][] randoms = new int[5][5];
     for(int row = 0; row < randoms.length; row++)
     {
         for(int columns = 0; columns < randoms[row].length; columns++)
         {
             randoms[row][columns] = (int)(Math.random()* 100);
         }
     }
     //printing arrays
       for(int row = 0; row < randoms.length; row ++)
     {
         for(int columns = 0; columns < randoms[row].length; columns++)
         {
             System.out.print(randoms[row][columns] + " ");
         }
         System.out.println();
     }
       
       //suming all elements
       int total = 0;
       for(int row = 0; row < matrix.length; ++row)
       {
           for(int column = 0; column < matrix[row].length; column++)
           {
               total += matrix[row][column];
           }
       }
       //suming elements by column
       
       for(int column = 0; column < randoms[0].length; ++column)
       {
           int totals = 0;
           for(int row = 0; row < randoms.length; ++row)
           {
               totals += randoms[row][column];
               
           }
           System.out.println("Sum for column " + column + " is "+
                                    totals);
       }
       
       //which row has the largest sum
       int maxRow = 0;
       int indexOfMaxRow = 0;
       //get sum of the first row
       for(int column = 0; column < randoms[0].length; column++)
       {
           maxRow += randoms[0][column];
       }
       for(int row = 0; row < randoms.length; row++)
       {
           int totalOfThisRow = 0;
           for(int column = 0; column < randoms[row].length; column++)
           {
               totalOfThisRow += randoms[row][column];
               if(totalOfThisRow > maxRow)
               {
                   maxRow = totalOfThisRow;
                   indexOfMaxRow = row;
               }
           }
       }
       System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " +
                          maxRow);
       
       //Random shufling
       for(int i= 0; i < x.length; i++)
       {
           for(int j = 0; j < x[i].length; j++)
           {
               int i1 = (int)(Math.random()* x.length);
               int j1 = (int)(Math.random()* x.length);
              //swap x[i][j] with x[i1][j1]
              int temp = x[i][j];
              x[i][j] = x[i1][j1];
              x[i1][j1] = temp;
           }
       }
        for(int row = 0; row < x.length; row++)
       {
           for(int column = 0; column < x[row].length; column++)
           {
               System.out.print(x[row][column] + " ");
           }
           System.out.println();
       }
    }
}
