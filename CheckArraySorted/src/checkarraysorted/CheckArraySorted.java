/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkarraysorted;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class CheckArraySorted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lengthArray;
        
        System.out.print("Enter length of array >> ");
        lengthArray = input.nextInt();
        
       int[] array = new int[lengthArray];
       System.out.print("Enter " + lengthArray + " integers >> ");
       for(int i = 0; i < array.length; i++)
       {
           array[i] = input.nextInt();
       }
       isSorted(array);
       
       if(isSorted(array) == true)
       System.out.println("The list is sorted");
       else
           System.out.println("The list is not sorted");
    }
    public static boolean isSorted(int[] array)
    {    boolean Sort = false;      
         int countTrue = 0;
    
        for(int i = 0; i < array.length - 1; i++)
        {
                if(array[i] <= array[i+1])
                {
                    ++countTrue;
                }
        }
        
        if(countTrue == array.length - 1)
        {
            Sort = true;
        }
        return Sort;
    }
    
}
