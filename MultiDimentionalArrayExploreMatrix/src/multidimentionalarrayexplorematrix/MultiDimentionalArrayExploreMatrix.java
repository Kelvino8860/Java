/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimentionalarrayexplorematrix;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultiDimentionalArrayExploreMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of a square matrix: ");
        int lengthArray = input.nextInt();
        int[][] matrix = new int[lengthArray][lengthArray];
        
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                matrix[row][col] = (int)(Math.random()*2);
            }
        }
        
        displayMatrix(matrix,lengthArray);
    }
    
    public static void displayMatrix(int[][] matrix, int lengthArray)
    {
        //print matrix
          for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
          
          //find rows,columns and diagonals with all 0's or 1's
          int countRow = 0,countCol = 0,countDiagonal = 0, countSubDiagonal = 0;
          int indexRowZero = 0,indexColZero = 0;
            int temp = matrix[0][0], temp2 = matrix[0][0];
            int temp3 = matrix[0][matrix.length - 1];
            int lastElement = matrix.length - 1;
          for(int row = 0; row < matrix.length; row++)
          {
              for(int col = 0, j = col + 1; col < matrix.length; col++)
              {
                  if(matrix[row][col] == matrix[row][j])
                  {
                      countRow++;
                      indexRowZero = row;
                      temp = matrix[row][col];
                  }
                  if(matrix[col][row]== matrix[j][row])
                  {
                      countCol++;
                      indexColZero = row;
                      temp2 = matrix[col][row];
                  }
              }
              if(matrix[0][0] == matrix[row][row])
              {
                  countDiagonal++;
              }
              if(temp3 == matrix[row][lastElement--])
              {
                  countSubDiagonal++;
              }
              
              if(countRow == matrix.length)
              {
                  System.out.println("All " + temp + "'s on row " + indexRowZero);
              }
            
              if(countCol == matrix.length)
              {
                  System.out.println("All " + temp2 + "'s on column " + indexColZero);
              }
             
              countRow = 0;
              countCol = 0;
          }
          
          if(countDiagonal == matrix.length)
          {
              System.out.println("Same numbers on the major diagonals");
          }
          else
          System.out.println("No same number on the major diagonal");
          
          if(countSubDiagonal == matrix.length)
          {
              System.out.println("Same numbers on the  sub-diagonals");
          }
          else
              System.out.println("No same number on the sub-diagonals");
    }
}
