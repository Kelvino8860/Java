
        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hangmangamearray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class HangManGameArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an array of strings
        String[] words = {"program","java","kelvin","italy"};
        checkWord(words);
    }
    
    //create an array with asteriks and
    //an array of letters for a random String from words array
    public static void checkWord(String[] words)
    {   Scanner input = new Scanner(System.in);
    
    //use a do loop to play the number of times you wish
       
     do{  
         //chose a word randomly
         //create a char array to hold astericks with
         //equal length to the choosen word
           String choosen = words[(int)(Math.random()*4)];
           char[] asterick = new char[choosen.length()];
        
           //create a char array and fill it with the characters
           //of the word choosen randomly
           char[] choosenArray = new char[choosen.length()];
            for(int i = 0; i < choosenArray.length; i++)
            {
                choosenArray[i] = choosen.charAt(i);
            }
            
            //also fill the asterick array with astericks
            //it will be used to replace the asterick with letters
         for(int j = 0; j < asterick.length; j++)
          {
             asterick[j] = '*';
          }
             
         //initialize miss to calculate the number of wrong entries
         //absent to be used to display a message if character entered by user is not in the word
         //present to display message is a user enters same character twice or more
            int miss = 0;
            int absent = 0,present = 0;
            
            //the do..while loop allows user to continue entering characters
            //till the righ word is complete
  do{
        System.out.print("(Guesss) Enter a letter in word " + String.valueOf(asterick) + " > ");
        char guess = input.nextLine().charAt(0);
        
        //use while loop to search through the array 
        //and replace characters
        for(int i = 0; i < asterick.length; i++)
        {
             if(guess == asterick[i])
            {
                present++;
            }
            if(guess == choosen.charAt(i))
            {  
                asterick[i] = guess;
                absent++;
            }
           
        }
        
        if(absent == 0)
        {
            System.out.println(guess + " is not in the word");
            miss++;
        }
        if(present > 0)
        {
            System.out.println(guess + " is already in the word");
        }
        
        //reset the values of absent and present to zero
        //after every input
        absent = 0;
        present = 0;
        
        //break loop once the whole word is complete
        
    }while(!Arrays.equals(asterick,choosenArray));
  
  //Display the word and number of failed attempts
     System.out.println("The word is " + choosen + ". You missed " +
                  miss + " time");
  
     //promp user to user to input y if they want to continue playing
     //or n if they want to terminate programm
  System.out.println("Do you want to guess another word? Enter y or n >> ");
       char askPermision;
       askPermision = input.nextLine().charAt(0);
       
       if(askPermision == 'n')
           break;
       
     }while(true);
     }
}
