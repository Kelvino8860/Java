/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computinglcm;

/**
 *
 * @author NJORO
 */
public class ComputingLcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numbers ={2,4};
       lcm(numbers);
       System.out.println(lcm(numbers));
    }
    public static int lcm(int[] numbers)
    {
        int counter = 0, divisor = 2, lcmArray = 1;
        boolean divicible = false;
        while(true)
        {
            for(int i = 0; i < numbers.length; i++)
            {   
                //if the number is negative
                //make it positive
                if(numbers[i] < 0)
                {
                    numbers[i] = numbers[i] * (-1);
                }
                //if the number is 1
                //just continue the loop
                if(numbers[i] == 1)
                {
                    ++counter;
                }
                //if we have a zero in the array
                //the lcm will be zero definitely
                //zero multiplied by any number is zero
                if(numbers[i] == 0)
                {
                    return 0;
                }
                //if number is divisible by our divisor
                //set the divicible to true
                //set the number[i] to the new value 
                if(numbers[i] % divisor == 0)
                {
                    divicible = true;
                    numbers[i] = numbers[i] / divisor; 
                }
            }
            if(divicible)
            {
                lcmArray = lcmArray*divisor;
            }
            else
                divisor++;
            //check if all elements in array are all one
            //terminate while loop
            if(counter == numbers.length)
                return lcmArray;
        }
    }
}
