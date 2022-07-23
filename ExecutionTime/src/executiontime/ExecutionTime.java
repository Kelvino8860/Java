/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package executiontime;
/**
 *
 * @author NJORO
 */
public class ExecutionTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      long[] numbers = new long[100_000_000];
      long key = 50_000_000;
      int n = 1;
      for(int i = 0; i < numbers.length; ++i)
      {
          numbers[i] = n++;
      }   
      binarySearch(numbers,key);
      //linear search
      long startTime = System.nanoTime();
   for(int i = 0; i < numbers.length; i++)
   {
       if(key == numbers[i])
           break;
   }
    long endTime = System.nanoTime();
    long executionTime = endTime - startTime;
    System.out.println("Linear search takes " +executionTime + " nanoSeconds");
    System.out.println("Binary search takes " +binarySearch(numbers,key) + " nanoSeconds");
    }
    //BinnarySearch
    public static long binarySearch(long[] numbers, long key)
    {        
     int low = 0;
      int high = numbers.length - 1;
      long staTime = System.nanoTime();
      while(high >= low)
     {
        int mid = (low + high)/2;
        if(key < numbers[mid])
            high = mid - 1;
        else
            if(key == mid)
                return mid;
        else
            if(key > mid)
                low = mid + 1;
      }
      long enTime = System.nanoTime();
      long executionBinary = enTime - staTime;
      return executionBinary;
    }
}
