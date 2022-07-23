/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analyzescore;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class AnalyzeScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       //first initialize the array to a maximum os
       //100 scores
        double[] score = new double[100];
        
         //initialize variables i to represent index of elements in array
         //total to calculate the sum of all scores in array
         //count to record the total number of scores
        int i,count = 0, total = 0;
        
         //create loop to receive input from user
         System.out.print("Enter scores & a negative number to stop >> ");
        for(i = 0; i < score.length; ++i)
        {
            score[i] = input.nextDouble();
            ++count;
            
            //if value entered is negative break loop
            if(score[i] < 0)
                break;
        }
        
        //loop to sum up all the scores in the aray
        for(i = 0; i < score.length; ++i)
        {
            total += score[i];
        }
        //calculate the average that is
        //sum of all scores divided by number of scores
        //initialize variables countHigh and countLow
        //to record the number of scores above & equal 
        //and below average
        //count is subtracted by 1 to eliminate the negative input
        //newtotal ensures the negative input does not affect the total
        double newTotal = total - score[count-1];
        double average = newTotal / (count - 1);
        int countHigh = 0, countLow = 0;
        //loop to find the score that
        //are above average,bellow average and
        //equal to average using conditional statements
        for(i = 0; i < count-1; ++i)
        {  
            if(score[i] > average || score[i] == average)
            {
              ++countHigh;
            }
            else
             if(score[i] < average)
             {
                 ++countLow;
             }
        }
        System.out.println(average + " " + count + " " + newTotal);
        System.out.println("There are " + countHigh + " scores that are above and equal to average.");
        System.out.println("There are " + countLow + " scores that are below average.");
    }
    
}
