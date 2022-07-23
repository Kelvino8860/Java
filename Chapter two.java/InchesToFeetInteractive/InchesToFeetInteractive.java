import java.util.Scanner;
public class InchesToFeetInteractive
{public static void main(String[]  args)
   { final double feetInches = 0.0833;
     Scanner inputDevice = new Scanner(System.in);
     System.out.print("Input your inches here >> ");
     int inches = inputDevice.nextInt();
     int numberOfFeet = (int) (inches*feetInches);
     double remainingInches = inches%feetInches;
     System.out.println(inches + " inches become " + numberOfFeet + " feet and " +
                         remainingInches + " inches.");
   }
}