import java.util.Scanner;
public class RentalDemo
{public static void main(String[]  args)
  { rentalTime();
    contractNumber();
    Rental objectOne = new Rental();
    Rental objectTwo = new Rental();
    objectOne = getData(objectOne);
    objectTwo = getData(objectTwo);
    SammysRentalPriceWithMethods.companyMotto();
    computeTime(objectOne, objectTwo);
             }
public static int rentalTime()
   { int minutes;
     Scanner inputDevice = new Scanner(System.in);
     System.out.print("Enter number of minutes >> ");
     minutes = inputDevice.nextInt();
     return minutes;
         }
public static String contractNumber()
   {  String contNumber;
      Scanner keyInput = new Scanner(System.in);
      System.out.print("Enter contract number >> ");
      contNumber = keyInput.nextLine();
      return contNumber;
         }
public static Rental getData(Rental details)
   {details.setContractNumber(contractNumber());
    details.setHoursAndMinutes(rentalTime());
    return details;
        }
public static void computeTime(Rental objectOne, Rental objectTwo)
   {   System.out.println("Display contract number >> " + objectOne.getContractNumber());
       System.out.println("Display hours >> " + objectOne.getNumberHours() + 
                          "\nDisplay minutes >> " + objectOne.getNumberRemMinutes());
       System.out.println("Display the hourly rate >> $" + objectOne.HOURLY_RENTAL_PAY);
       System.out.println("Display total price >> $" + objectOne.getPrice());

       System.out.println("Display contract number >> " + objectTwo.getContractNumber());
       System.out.println("Display hours >> " + objectTwo.getNumberHours() + 
                          "\nDisplay minutes >> " + objectTwo.getNumberRemMinutes());
       System.out.println("Display the hourly rate >> $" + objectTwo.HOURLY_RENTAL_PAY);
       System.out.println("Display total price >> $" + objectTwo.getPrice());
   }
}
  