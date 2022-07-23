/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averageanarray;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class AverageAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        //Initialize two arrays
        //both should be double to enable you coppy 
        //one to the other
        
        double[] doubleArrays = new double[10];
        double[] integerArrays = new double[doubleArrays.length];
        
        //use a loop to copy the array
        System.out.print("Enter 10 double values >> ");
        for(int i = 0; i < doubleArrays.length; ++i)
        {   
            doubleArrays[i] = input.nextDouble();
            integerArrays[i] = doubleArrays[i];
        }
     
        //pass the two arrays in average() method
        
        average(integerArrays);
        average(doubleArrays);
        System.out.println("Average is >> " + average(integerArrays));
        System.out.println("Average is >> " + average(doubleArrays));
    }
    
    //use the methods to calculate the average
    //return the average to the methods
    public static int average(int[] integerArrays)
    {   int average, count = 0, total = 0;
        for(int i = 0; i < integerArrays.length; ++i)
        {  
            total += integerArrays[i];
            ++count;
        }
        average = total /count;
        return average;
    }
    public static double average(double[] doubleArrays)
    {
        double average, count = 0, total = 0;
        for(int i = 0; i < doubleArrays.length; ++i)
        {
            total += doubleArrays[i];
            ++count;
        }
        average = total/count;
        return average;
    }
}
