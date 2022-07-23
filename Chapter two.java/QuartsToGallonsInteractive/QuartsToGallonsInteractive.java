import java.util.Scanner;
public class QuartsToGallonsInteractive
{ public static void main(String[]  args)
 {int noOfQuartsNeeded;
  final int NO_OF_QUARTS_IN_GALLON;
  int noOfGallonsNeeded;
  int noOfRemainingQuarts;
  Scanner input = new Scanner(System.in);
  System.out.print("How many quarts are needed for this painting job? >> ");
  noOfQuartsNeeded = input.nextInt();
  System.out.print("How many quarts are in one gallon? >> ");
  NO_OF_QUARTS_IN_GALLON = input.nextInt();
  noOfGallonsNeeded = noOfQuartsNeeded/NO_OF_QUARTS_IN_GALLON;
  noOfRemainingQuarts = noOfQuartsNeeded%NO_OF_QUARTS_IN_GALLON;
  System.out.println("A job that requires " + noOfQuartsNeeded + " quarts will require " +
                      noOfGallonsNeeded + " gallons of paint plus " + noOfRemainingQuarts +
                      " quarts to finish the job ");
  
  }
}
  
  