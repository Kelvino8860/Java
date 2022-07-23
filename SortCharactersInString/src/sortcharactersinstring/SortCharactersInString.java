/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortcharactersinstring;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class SortCharactersInString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string >> ");
        String name = input.nextLine();
        
        sort(name);
        System.out.println("The sorted string is: " + sort(name));
    }
    public static String sort(String name)
    {
        char[] array = new char[name.length()];
         
        for(int i = 0; i < name.length(); i++)
        {
            array[i] = name.charAt(i);
        }
        
        for(int j = 0; j < array.length; j++)
        {
            for(int k = j + 1; k < array.length; k++)
            {
                if(array[j] > array[k])
                {
                    char temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }
        }
     String newName = String.valueOf(array);
       return newName;
    }
    
}
