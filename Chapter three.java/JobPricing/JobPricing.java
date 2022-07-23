import java.util.Scanner;
public class JobPricing
{   public static void main(String[]  args)
       {
         String nameJob;
         int costMaterials;
         int noOfHoursWork;
         int noOfHoursTravel;
         Scanner inputDevice = new Scanner(System.in);
         System.out.print("Enter name of job >> ");
         nameJob = inputDevice.nextLine();
         System.out.print("Enter the total cost of materials >> ");
         costMaterials = inputDevice.nextInt();
         System.out.print("Enter hours of work required >> ");
         noOfHoursWork = inputDevice.nextInt();
         System.out.print("Enter hours of travel used >> ");
         noOfHoursTravel = inputDevice.nextInt();
         computeEstimate(costMaterials, noOfHoursWork, noOfHoursTravel);
         System.out.println("Name of the job " + nameJob + "\nEstimated price of job is $" + computeEstimate(costMaterials, noOfHoursWork, noOfHoursTravel));
           }
   public static int computeEstimate(int costMaterials, int noOfHoursWork,
                                      int noOfHoursTravel)
              { int price;
                final int PRICE_PER_HOUR_WORK = 35;
                final int PRICE_PER_HOUR_TRAVEL = 12;
                price = costMaterials + (noOfHoursWork * 35) + (noOfHoursTravel * 12);
                return price;
                        } 
}