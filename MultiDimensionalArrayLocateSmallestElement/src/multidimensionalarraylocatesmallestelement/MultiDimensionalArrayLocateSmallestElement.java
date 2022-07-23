/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraylocatesmallestelement;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultiDimensionalArrayLocateSmallestElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
           int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
           int cols = input.nextInt();
           
        double[][] array = new double[rows][cols];
        
        System.out.print("Enter the array: ");
          for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                array[row][col] = input.nextDouble();
            }
        }
        
        locateSmallest(array);
        System.out.print("(" + locateSmallest(array)[0] + ", " + locateSmallest(array)[1] + ")");
    }
    
    public static int[] locateSmallest(double[][] a)
    {
        double temp = a[0][0]; int[] array = new int[2];
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] < temp)
                {
                    temp = a[row][col];
                    array[0] = row;
                    array[1] = col;
                }
            }
        }
        return array;
    }
    
}
