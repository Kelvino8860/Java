public class QuartsToGallons
{  public static void main(String[]  args)
   { final int NO_OF_QUARTS_IN_GALLON = 4;
     int noOfQuartsNeeded = 18;
     int noOfRemainingQuarts = noOfQuartsNeeded % NO_OF_QUARTS_IN_GALLON;
     int noOfGallonsNeeded = noOfQuartsNeeded / NO_OF_QUARTS_IN_GALLON;
     System.out.println("A job that requires " + noOfQuartsNeeded + " quarts require " +
                         noOfGallonsNeeded + " gallons plus " + noOfRemainingQuarts + " quarts.");
    }
}