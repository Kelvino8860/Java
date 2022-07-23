/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraygeometrysameline;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultidimensionalArrayGeometrySameLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize array
        Scanner input = new Scanner(System.in);
        double[][] array = new double[5][2];
        
        System.out.print("Enter five points: ");
        for(int row = 0; row < array.length;row++)
        {
            for(int col = 0; col < array[row].length; col++)
            {
                array[row][col] = input.nextDouble();
            }
        }
        
        sameLine(array);
        if(sameLine(array))
        {
            System.out.println("The five points are on the same line");
        }
        else
            System.out.println("The five points are not on the same line");
       
    }
    
    public static boolean sameLine(double[][] array)
    {
        int count = 0;
        boolean fivePoints = false;
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length - 1; col++)
            {
                if(array[row][col] == array[row][col + 1])
                {
                    count++;
                }
            }
        }
        
        if(count == 5)
        {
            fivePoints = true;
        }
        
        return fivePoints;
    }
}
