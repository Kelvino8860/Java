import java.util.Scanner;
public class ComparingNumbers {
    public static void main(String[] args)
    {
        int lengthArray;
        Scanner inputDevice = new Scanner(System.in);
        //ask user to input length of array
        System.out.print("Enter number of digits >> ");
            lengthArray = inputDevice.nextInt();
             int[] integers = new int[lengthArray];
            //Creat loop to fill array with the number of integers
            //the number of elements must be equall to length of array
            System.out.print("Enter " + lengthArray + " integers >> ");
            for(int i = 0; i < integers.length; ++i)
            {
               integers[i] = inputDevice.nextInt();
            }
            //create another loop with conditional statements
            //to find integers greater than the last digit
               int temp = integers[lengthArray - 1];
               for(int i = 0; i < integers.length; ++i)
               {
                   if(integers[i] > temp)
                   {
                       System.out.println("Integer at " + i + " is greater than " +
                                           temp);
                   }
                   if(integers[i] < temp)
                   {
                       System.out.println("Integer at " + i + " is smaller than " +
                                           temp);
                   }
                   else
                     if(integers[i] == temp)
                     {
                         System.out.println("Intagers at " + i + " is equal to " +
                                             temp);
                     }
               }
    }
}
