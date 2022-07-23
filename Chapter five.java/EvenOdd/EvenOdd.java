import java.util.Scanner;
public class EvenOdd
{  public static void main(String[]  args)
    {  int anyVal;
       Scanner inputDevice = new Scanner(System.in);
       System.out.print("Enter an integer >> ");
       anyVal = inputDevice.nextInt();
        if(anyVal % 2 == 0)
          System.out.println("The integer you entered is an even number.");
        else
          System.out.println("The integer you entered is an odd number.");
      }
}