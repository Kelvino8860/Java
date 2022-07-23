/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package normalizingintegers;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class NormalizingIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double[] numbers = new double[10];
       System.out.print("Enter 10 integers >> ");
       for(int i = 0; i < numbers.length; i++)
       {
           numbers[i] = input.nextDouble();
       }
       normalize(numbers);
    }
    public static void normalize(double[] numbers)
    {   //find the greatest value in array
        double max = numbers[0];
        for(int j = 0; j < numbers.length; j++)
        {
            if(numbers[j] > max)
            {
                max = numbers[j];
            }
        }
        
        //Divide all elements in array with max
        double answer = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            answer = (numbers[i] / max);
            System.out.printf("%1.0f has been normalized to %1.4f\n", numbers[i],answer);
        }
    }
    
}
