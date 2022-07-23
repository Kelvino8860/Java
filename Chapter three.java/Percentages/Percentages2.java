import java.util.Scanner;
public class Percentages2
{  public static void main(String[]  args)
      {   
          double valOne;
          double valTwo;
          Scanner inputDevice = new Scanner(System.in);
          System.out.print("Enter first value >> ");
          valOne = inputDevice.nextDouble();
          System.out.print("Enter second value >> ");
          valTwo = inputDevice.nextDouble();
          computePercent(valOne, valTwo);
          computePercentl(valTwo, valOne); 
        }
   public static void computePercent(double valOne, double valTwo)
       { double percent;
         percent = valOne / valTwo * 100;
         System.out.println(valOne + " is " + percent + " percent of " + valTwo);
           }
         
  public static void computePercentl(double valTwo, double valOne)
      {   double percentT;
          percentT = valTwo / valOne * 100;
          System.out.println(valTwo + " is " + percentT + " percent of " + valOne);
        }
}
