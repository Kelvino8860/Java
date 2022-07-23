/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarraygradingmultiplechoice;

import java.util.Arrays;

/**
 *
 * @author NJORO
 */
public class MultiDimensionalArrayGradingMultipleChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Student's answers to questions
        char[][] answers = {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        
        //KEY to the question
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        //grade all the answers
        int[] scores = new int[8];
        int[] position = new int[8];
        for(int i = 0; i < answers.length; i++)
        {
            int correctCount = 0;
            for(int j = 0; j < answers[i].length; j++)
            {
                if(answers[i][j] == key[j])
                    correctCount++;
            }
           System.out.println("Student " + i + "'s " + "correct count is " + correctCount);
            scores[i] = correctCount;
            position[i] = i;
            
        }
 
        for(int j = 0; j < scores.length; j++)
        { 
            for(int i = 0; i < scores.length-1; i++)
            {
                if(scores[i] < scores[i+1])
                {
                    int temp = scores[i];
                    scores[i] = scores[i + 1];
                    scores[i + 1] = temp;
                 
                    int temp2 = position[i];
                    position[i] = position[i + 1];
                    position[i + 1] = temp2;
                }
            }
        }
      
        System.out.println();
        System.out.println("STUDENTS IN DECREASING ORDER OF THEIR SCORES");
        for(int i = 0; i < scores.length; i++)
        {
            System.out.println("Student " + position[i] + "'s " + "correct count is " + scores[i]);
        }
    }
    
    }
    
