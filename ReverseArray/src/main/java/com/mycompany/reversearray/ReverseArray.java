/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.reversearray;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class ReverseArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int[] myArray = new int[10];
        
       System.out.print("Enter 10 integers >> ");
       for(int i = 0; i < myArray.length; i++)
       {
           myArray[i] = input.nextInt();
       }
       reverse(myArray);
       for(int e : reverse(myArray))
       System.out.print(e + " ");
    }
    public static int[] reverse(int[] myArray)
    {
        int[] newArray = new int[myArray.length];
        for(int i = 0, j = myArray.length - 1;
                i < myArray.length; i++, j--)
        {
              newArray[j] = myArray[i];
        }
        return newArray;
    }
}
