/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statisticscoputedeviation;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class StatisticsCoputeDeviation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double[] numbers = new double[10];
      Scanner input = new Scanner(System.in);
      System.out.print("Enter 10 values >> ");
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextDouble();
        }
      mean(numbers);
      deviation(numbers);
      System.out.println("The mean is >> " + mean(numbers));
      System.out.println("The standard deviation is >> " + deviation(numbers));
    }
    public static double mean(double[] numbers)
    {    double mean, total = 0;
         int count = 0;
        for(int i = 0; i < numbers.length; ++i)
        {
            total += numbers[i];
            ++count;
        }
        mean = total / count;
        return mean;
    }
    public static double deviation(double[] numbers)
    {
        double mean, total = 0, valueMinusMean = 0, deviation;
        int count = 0;
        for(int i = 0; i < numbers.length; ++i)
        {
            total += numbers[i];
            ++count;
        }
        mean = total / count;
        for(int i = 0; i < numbers.length; ++i)
        {
            valueMinusMean += Math.pow((numbers[i] - mean),2);
        }
        deviation = Math.sqrt(valueMinusMean / (count - 1));
        return deviation;
    }
    
}
