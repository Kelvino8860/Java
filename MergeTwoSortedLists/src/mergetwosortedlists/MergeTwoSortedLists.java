/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergetwosortedlists;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MergeTwoSortedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialize lengths of lists lists
        Scanner input = new Scanner(System.in);
        int lengthOne,lengthTwo;
        
        //Initialize list1 and fill the array
        //Display the contents
        System.out.print("Enter list1 size >> ");
        lengthOne = input.nextInt();
        int[] arrayOne = new int[lengthOne];
        System.out.print("Enter list1 contents >> ");
        for(int i = 0; i < arrayOne.length; i++)
        {
            arrayOne[i] = input.nextInt();
        }
        System.out.print("List 1 is ");
        for(int e : arrayOne)
            System.out.print(e + " ");
        System.out.println();
        
        //Initialize list2 and fill the array
        //Display the contents
         System.out.print("Enter list2 size >> ");
        lengthTwo = input.nextInt();
        int[] arrayTwo = new int[lengthTwo];
        System.out.print("Enter list2 contents >> ");
        for(int i = 0; i < arrayTwo.length; i++)
        {
            arrayTwo[i] = input.nextInt();
        }
        System.out.print("List 2 is ");
        for(int e : arrayTwo)
            System.out.print(e + " ");
        System.out.println();
        
        //Display the merged list
        System.out.print("The merged list is ");
        //Pass the two lists in the method
        merg(arrayOne,arrayTwo);
        for(int e : merg(arrayOne,arrayTwo))
            System.out.print(e + " ");
        System.out.println();
    }
    public static int[] merg(int[] arrayOne, int[] arrayTwo)
    {   
        int indexOne = 0;
        
     //initialize the mergedlist
     //set length of merged list which is equal to length of two arrays
        int[] mergedArray = new int[arrayOne.length + arrayTwo.length];
        
        //fill the contents of list one to the mergedlist
        for(int j = 0; j < arrayOne.length; j++)
        {
            mergedArray[j] = arrayOne[j];
            indexOne = j;
        }
        
        //fill the contents of list two to the mergedlist
        for(int i = 0; i < arrayTwo.length; i++)
        {
            mergedArray[indexOne + 1 + i] = arrayTwo[i];
        }
        
        //sort the merged array
        for(int p = 0; p < mergedArray.length; p++)
        {
           for(int j = 0; j < mergedArray.length - 1; j++)
           {
               if(mergedArray[j] > mergedArray[j + 1])
               {
                   int temp = mergedArray[j];
                   mergedArray[j] = mergedArray[j + 1];
                   mergedArray[j + 1] = temp;
               }
           }
        }
        return mergedArray;
    }
}
