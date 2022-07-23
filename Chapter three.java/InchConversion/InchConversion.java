import java.util.Scanner;
public class InchConversion
{  public static void main(String[]  args)
   {double inches;
    Scanner inputDevice = new Scanner(System.in);
    System.out.print("Enter value of inches >> ");
    inches = inputDevice.nextDouble();
    convToFeet(inches);
    convToYards(inches);
  }
    public static void convToFeet(double inches)
      {  double feet;
         final double INCH_TO_FEET = 12;
         feet = inches / INCH_TO_FEET;
         System.out.println(inches + " inches are equal to " + feet + "feet.");
         }
   public static void convToYards(double inches)
      {   double yard;
          final double INCH_TO_FEET = 12;
          final double FEET_YARD_CONS = 3;
          yard = (inches / INCH_TO_FEET) / FEET_YARD_CONS; 
          System.out.println(inches + " inches are equal to " + yard + " yards.");
          }
}