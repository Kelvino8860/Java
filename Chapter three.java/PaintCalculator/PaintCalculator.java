import java.util.Scanner;
public class PaintCalculator
{  public static void main(String[]  args)
      { double length;
        double width;
        double height;
        double price;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter length of room >> ");
        length = inputDevice.nextDouble();
        System.out.print("Enter width of room >> ");
        width = inputDevice.nextDouble();
        System.out.print("Enter height of room >> ");
        height = inputDevice.nextDouble();
        calculateWallArea(length, width, height);
          }
   public static void calculateWallArea(double length, double width, double height)
          {   double price;
              double areaOne = (length * height); 
              double areaTwo = (width * height);
              double totalArea = areaOne + areaTwo;
              calculateNoOfGallons(totalArea);
              System.out.println("The cost to paint a " + length + " by " + width + " foot room with " +
                                   height + "foot cellings is $" + calculateNoOfGallons(totalArea));
            }
   public static double calculateNoOfGallons(double totalArea)
        {  int noOfGallonsNeeded;
           double price;
           int remainingFraction;
           final int PRICE_PER_GALLON = 32;
           final int SQUARE_FEET_GALLON = 350;
           noOfGallonsNeeded = (int) totalArea / SQUARE_FEET_GALLON;
           remainingFraction = noOfGallonsNeeded % SQUARE_FEET_GALLON;
           price = (PRICE_PER_GALLON * noOfGallonsNeeded) + (PRICE_PER_GALLON * remainingFraction);
           //System.out.println(price);
           return price;
          }
}