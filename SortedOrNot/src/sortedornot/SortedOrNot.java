/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortedornot;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class SortedOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter length of list >> ");
       int lengthList = input.nextInt();
       int[] numbers = new int[lengthList];
       System.out.println("Enter 8 value >> ");
       for(int i = 0; i < numbers.length; i++)
       {
           numbers[i] = input.nextInt();
       }
       isSorted(numbers);
      if(isSorted(numbers) == true)
      {
          System.out.println("The list is already sorted");
      }
      else
          System.out.println("The list is not sorted");
    }
    public static boolean isSorted(int[] numbers)
    {   boolean sorted = false; int count = 0;
            for(int j = 0; j < numbers.length - 1; j++)
            {
                if(numbers[j] > numbers[j + 1] || numbers[j] == numbers[j + 1])
                {
                    count++;
                }
            }
        if(count == (numbers.length - 1))
        {
            sorted = true;
        }
        return sorted;
    }
    
}
