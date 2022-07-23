
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patternrecognition;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class PatternRecognition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize array
        Scanner input = new Scanner(System.in);
        int lengthArray;
        System.out.print("Enter the number of values >> ");
        lengthArray = input.nextInt();
        int[] arrays = new int[lengthArray];
        System.out.print("Enter the values >> ");
        for(int i = 0; i < arrays.length; i++)
        {
            arrays[i] = input.nextInt();
        }
        isConsecutiveFour(arrays);
        if(isConsecutiveFour(arrays) == true)
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] b)
    {
        int count = 0; boolean consecutive = false;
        
        for(int j = 0; j < b.length - 1; j++)
        { 
           if(b[j] == b[j + 1])
           {
               count++;
           }
           else
               if(b[j] != b[j + 1] && count != 3)
               {
                   count = 0;
               }
        }
        if(count == 3)
        {
            consecutive = true;
        }
       
        return consecutive;
    }
}
