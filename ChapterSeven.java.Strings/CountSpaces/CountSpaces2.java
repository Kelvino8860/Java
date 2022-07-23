import java.util.Scanner;
public class CountSpaces2
{  public static void main(String[]  args)
      { Scanner inputDevice = new Scanner(System.in); 
        String myInspiration;
        System.out.print("Type your inspirational quote here >> ");
        myInspiration = inputDevice.nextLine();
        int count = 0;
        for(int i = 0; i < myInspiration.length(); ++i)
           {  if(myInspiration.charAt(i) == ' ')
               ++count;
             }
     System.out.println("Number of spaces in my quote is " + count);
      }
}