import java.util.Scanner;
public class Dollars
{ public static void main(String[]  args)
  { double dollarS;
    int convTwenty;
    int convTen;
    int convFive;
    int convOne;
    final int twentyS = 20;
    final int tenS = 10;
    final int fiveS = 5;
    final int oneS = 1;
    Scanner inputDevice = new Scanner(System.in);
    System.out.print("Input the total amount of dollars for conversion >> ");
    dollarS = inputDevice.nextDouble();
    convTwenty = (int) (dollarS/twentyS);
    convTen = (int) (dollarS/tenS);
    convFive = (int) (dollarS/fiveS);
    convOne = (int) (dollarS/oneS);
    System.out.println("In $" + dollarS + " there are " +
                       convTwenty + " 20s, " + convTen + " 10s, " + convFive + 
                       " 5s and " + convOne + " 1s.");
   }
}