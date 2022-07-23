/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findthelargestelement;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class FindTheLargestElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       //initialize array and ask user
       //to provide the values
       double[] numbers = new double[10];
       System.out.print("Enter 10 double values >> ");
          for(int i = 0; i < numbers.length; ++i)
          {
              numbers[i] = input.nextDouble();
          }
          
          //pass the array in the max() method
          
        max(numbers);
          System.out.println("The largest double value is >> " +
                              max(numbers));
        }   
    //use the max() method to find the largest value
       public static double max(double[] numbers)         
       { double maximum = numbers[0];
           for(int i = 0; i < numbers.length; ++i)
        {
           if(numbers[i] > maximum)
           {
               maximum = numbers[i];
           }
        }
           //return the largest value to the method
           return maximum;
       }
}
