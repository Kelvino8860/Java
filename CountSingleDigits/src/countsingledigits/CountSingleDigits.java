/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countsingledigits;

/**
 *
 * @author NJORO
 */
public class CountSingleDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //creat an array of 200 numbers
       //creat an array to count number of literations
        int[] numbers = new int[200];
        int[] count = new int[10];
        int i, temp;
        
        //loop to fill the array with random numbers
        //between 0 to 9
        for(i = 0; i < numbers.length; ++i)
        {
            numbers[i] = (int)(Math.random()*10);
        }
        
        //loop to count the number of occurence
        //initialize temp to number at position i
        //use temp as index of count array
        for(i = 0; i < numbers.length; ++i)
        {
            temp = numbers[i];
            count[temp]++;
        }
        //display all integers between 0 to 9
        //display the number of occurences
        for(i = 0; i< count.length; ++i)
        {
            System.out.println(i + " appered " + count[i] + " times.");
        }
    }
    
}
