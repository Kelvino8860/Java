import java.util.Scanner;
public class Inbetween
{   public static void main(String[]  args)
        {  int integer1, integer2;
           int factor;
           Scanner inputDevice = new Scanner(System.in);
           System.out.print("Enter an integer >> ");
            integer1 = inputDevice.nextInt();
           System.out.print("Enter an integer >> ");
            integer2 = inputDevice.nextInt();
       if(integer1 <= integer2)
          {   if((integer1 - integer2) == 1 || (integer2 - integer1) == 1 ||
                 (integer1 - integer2) == 0 || (integer2 - integer1) == 0)
                {   System.out.print("There are no integers in between!!");
                     System.out.println();
                  } 
             else
                { for(factor = (++integer1); factor < integer2; ++factor)
                    System.out.print(factor + " ");
                     System.out.println();
                   }
           }
       else
         if(integer2 <= integer1)
            {  if((integer1 - integer2) == 1 || (integer2 - integer1) == 1 ||
                    (integer1 - integer2) == 0 || (integer2 - integer1) == 0)
                {   System.out.print("There are no integers in between!!");
                     System.out.println();
                  } 
              else
                  {  for(factor = (++integer2); factor < integer1; ++factor)
                      System.out.print(factor + " ");
                        System.out.println();
                    }
              }
 
         } 
}