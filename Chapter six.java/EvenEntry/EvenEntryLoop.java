import java.util.Scanner;
public class EvenEntryLoop
{    public static void main(String[]   args)
            {   final int SENTIMENTAL_VALUE = 999;
                int n;
              Scanner inputDevice = new Scanner(System.in);
                  while(true)
                    { System.out.print("Enter an even number or 999 to end program >> ");
                          n = inputDevice.nextInt(); 
                      if(n == 999)
                       {   break;
                             }
                       if(n % 2 == 0)
                          {     System.out.println("Good job!!!");
                                 }
                       else
                         if(n % 2 != 0)
                         {   System.out.println("Wrong entry!! Try again");
                          }
                     }
                 }
}