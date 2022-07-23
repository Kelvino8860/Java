import java.util.Scanner;
public class RentalDemo
{public static void main(String[]  args)
  { Rental object1 = new Rental();
    Rental object2 = new Rental();
    object2 = getData(object2);
    SammysRentalPriceWithMethods.companyMotto();
    computeTime(object1, object2);
             }
public static Rental getData(Rental details)
   { int minutes;
     String contNumber;
     Scanner inputDevice = new Scanner(System.in);
     System.out.print("Enter contract number >> ");
     contNumber = inputDevice.nextLine();
     System.out.print("Enter number of minutes >> ");
     minutes = inputDevice.nextInt();
     details.setContractNumber(contNumber);
     details.setHoursAndMinutes(minutes);
     return details;
         }
public static void computeTime(Rental g, Rental t)
   {   System.out.println("Display contract number >> " + g.getContractNumber());
       System.out.println("Display hours >> " + g.getNumberHours() + 
                          "\nDisplay minutes >> " + g.getNumberRemMinutes());
       System.out.println("Display the hourly rate >> $" + g.HOURLY_RENTAL_PAY);
       System.out.println("Display total price >> $" + g.getPrice());

       System.out.println("Display contract number >> " + t.getContractNumber());
       System.out.println("Display hours >> " + t.getNumberHours() + 
                          "\nDisplay minutes >> " + t.getNumberRemMinutes());
       System.out.println("Display the hourly rate >> $" + t.HOURLY_RENTAL_PAY);
       System.out.println("Display total price >> $" + t.getPrice());
   }
}
  