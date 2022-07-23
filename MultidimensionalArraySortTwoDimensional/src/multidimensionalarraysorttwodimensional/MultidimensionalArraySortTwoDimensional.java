/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraysorttwodimensional;

/**
 *
 * @author NJORO
 */
public class MultidimensionalArraySortTwoDimensional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,2},{5,2},{5,1},{3,4},{3,3}};
        sort(array);
    }
    
    public static void sort(int[][] array)
    {
        //primary sort on rows
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
               { if(array[i][0] > array[j][0])
                  {
                      int[] temp = array[i];
                      array[i] = array[j];
                      array[j] = temp;
                    }
                }
        }
        
          //secondary sort on columns
          //the first loop helps to sort the array completely
         for(int j = 0; j < 2;j++)
          {
          for(int i = 0; i < array.length-1; i++)
            {
                  if(array[i][1] < array[i+1][1] && array[i][0] <= array[i+1][0])
                      {
                         int[] temp = array[i];
                         array[i] = array[i+1];
                         array[i+1] = temp;
                       }  
            }
          }
       
         //Display the sorted array
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
