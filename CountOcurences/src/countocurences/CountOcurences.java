 
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package countocurences;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class CountOcurences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code
       Scanner input = new Scanner(System.in);
       int[] num = new int[50];
       int lengthArry = 0;
       
       //Initialize variables i and temp
       //that will be used as elements in the array
       //and index
       
       int i,temp = 0;
       System.out.print("Enter integers between 1 to 50 >> ");
        for(i = 0 ; i < num.length; ++i)
        {
           num[i] = input.nextInt();
           ++lengthArry;
           if(num[i] == 0)
               break;
        }
         int[] count = new int[50];
        //value at a given index i will be temp
        //temp will be used as the index of count array
        //that will be used to keep record the number of occurences 
        //of each number
         
        for(i = 0; i < num.length; ++i)
        {
            temp = num[i];
            count[temp]++;
        }
        for(i = 1; i < count.length; ++i)
        {
            if(count[i] > 0 && count[i] == 1)
            {
                System.out.printf("%d occurs %d time\n", i, count[i]);
                
            }
            else
              if(count[i] >= 2)
              {
                  System.out.printf("%d occurs %d times\n", i, count[i]);
              }
    }
  }
}
