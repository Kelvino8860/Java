/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkarraysortedwithconstantinterval;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class CheckArraySortedWithConstantInterval {

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
       System.out.println("The list is sorted with a constant interval");
       else
           System.out.println("The list is not sorted with a constant interval");
    }
    public static boolean isSorted(int[] array)
    {    boolean Sort = false;      
         int countTrue = 0;
         //set an interval constant
         int sortConstant = array[1] - array[0];
    
        for(int i = 0; i < array.length - 1; i++)
        {   //find intervals between two consecutive values
            //use if statement to determine if the array is
            //sorted with an interval constant
            int interval = array[i + 1] - array [i];
                if(array[i] < array[i+1] && sortConstant == interval)
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
