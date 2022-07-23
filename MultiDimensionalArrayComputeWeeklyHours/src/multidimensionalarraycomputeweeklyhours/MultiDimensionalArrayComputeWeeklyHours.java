/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraycomputeweeklyhours;

import java.util.Arrays;

/**
 *
 * @author NJORO
 */
public class MultiDimensionalArrayComputeWeeklyHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialize array
       int[][] array = {{2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},
                        {9,3,4,7,3,4,1},{3,5,4,3,6,3,8},{3,4,4,6,3,4,4},
                        {3,7,4,8,3,8,4},{6,3,5,9,2,7,9}};
       
       //pass the array to a display method for convinence
       //to calculate the total hours of each row
       //and to allow you to be abble to handle your code
       display(array);
    }
    
    public static void display(int[][] array)
    {  
        //create two more arrays, one for the totals of rows
        //the other for the positions rows in order to shuffle and
        //still maintain theirs original tag or number or name or however you will want to refer
        int total = 0;
        int[] totalArray = new int[8];
        int[] position = new int[8];
        
        //loop through the array and add the hours in each rows
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                total += array[row][col];
            }
            totalArray[row] = total;
            position[row] = row;
            total = 0;
        }
        
        //for convenience and neatness pass the array containig totals
        //and the array containig positions to anothr method for sorting
        //remember also to pass the original array
        sortArray(array,totalArray,position);
    }
    
    public static void sortArray(int[][] array, int[] totalArray, int[] position)
    {
        //sort the total array in increasing order
        //sort the position array to maintain the original tags on the
        //sorted total array
        for(int i = 0; i < totalArray.length; i++)
        {
            for(int j = 0; j < totalArray.length - 1; j++)
            {
                if(totalArray[j] > totalArray[j + 1])
                {
                    int temp = totalArray[j];
                    totalArray[j] = totalArray[j + 1];
                    totalArray[j + 1] = temp;
                    
                    int temp2 = position[j];
                    position[j] = position[j + 1];
                    position[j + 1] = temp2;
                }
            }
        }
        
        //finaly display your info whichever way
        //you find easy and suitable
        //or the way your organization recomends
        System.out.println("              " + "Su  Mo  Tu  Wd  Th  Fr  Sa");
        for(int row = 0; row < array.length; row++)
        {   
           
            System.out.print("Employee " + position[row] + "     ");
            for(int col = 0; col < array[row].length; col++)
            {
                System.out.print(array[position[row]][col] + "   ");
            }
            System.out.println();
        }
    }
    
}
