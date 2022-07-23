/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countnumberofvowels;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class CountNumberOfVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string >> ");
        String words = input.nextLine();
        //create an array of vowels
        char[] vowels = {'a','e','i','o','u'};
        countVowels(words,vowels);
    }
    public static void countVowels(String words, char[] vowels)
    {    //initialize array of characters
        //place all characters word in an array
        char[] array = new char[words.length()];
        for(int i = 0; i < words.length(); i++)
        {
            array[i] = words.charAt(i);
        }
        //loop array to count all characters
        //both uppercase and lowercase
        int countUpper = 0, countLower = 0;
        for(int j = 0; j < array.length - 1; j++)
        {
           for(int i = 0; i < vowels.length; i++)
           {
               if(array[j] == vowels[i])
               {
                   countLower++;
               }
               if(array[j] == Character.toUpperCase(vowels[i]))
               {
                   countUpper++;
               }
           }
        }
        System.out.printf("There are %d lowercase vowels \nThere are %d Uppercase vowels ",
                         countLower, countUpper);
    }
    
}
