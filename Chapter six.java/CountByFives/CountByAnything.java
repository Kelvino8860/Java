import java.util.Scanner;
public class CountByAnything
{   public static void main(String[]   args)
       {  int count;
          int x;
          int LIMIT = 500;
          int FACTOR = 50;
          int NUMBER_PER_LINE = 10;
         Scanner inputDevice = new Scanner(System.in);
         System.out.print("Enter value to count by >> ");
           count = inputDevice.nextInt();
           for(x = count; x <= LIMIT; x += count)
              {  System.out.print(x + " ");
                if(x % (NUMBER_PER_LINE * count) == 0)
                  System.out.println();
                }
       } 
}