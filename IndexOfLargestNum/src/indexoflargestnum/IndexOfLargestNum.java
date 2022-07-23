/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package indexoflargestnum;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class IndexOfLargestNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       
      //Initialize array and promp user
      //to enter 10 digits
      
      System.out.print("Enter 10 digits >> ");
        double[] numbers = new double[10];
        for(int i = 0; i < numbers.length; ++i)
        {
            numbers[i] = input.nextDouble();
        }
        
        //pass the array in the indexOfLargestNumber() method
        
      indexOfLargestNumber(numbers);
      System.out.println("The largest index of the largest number is >> " +
                          indexOfLargestNumber(numbers));
    }
    //invoke the method
    //use the method to find the index of largest digit
    
    public static int indexOfLargestNumber(double[] numbers)
    {
       double maximum = numbers[0];
       int temp = 0, i;
       for(i = 0; i < numbers.length; ++i)
       {
           if(numbers[i] > maximum)
           { 
               maximum = numbers[i];
              temp = i;
              
           }
           //reloop the array incase of more than one large
           //values that are equal to give the largest index
           for(int j = i; j < numbers.length; ++j)
           {
               if(maximum == numbers[j])
               {
                   temp = j;
               }
           }
           
       }
       return temp;
    }
    
}
