import java.util.Scanner;
public class RentalDemo
{public static void main(String[]  args)
  { Rental object1 = new Rental();
    Rental object2 = new Rental();
    Rental object3 = new Rental();
    object1 = getData(object1);
    object2 = getData(object2);
    object3 = getData(object3);
    SammysRentalPriceWithMethods.companyMotto();
    computeTime(object1, object2, object3);
    compareObjects(object1, object2);
    compareObjects(object1, object3);
    compareObjects(object2, object3);
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
public static void computeTime(Rental g, Rental t, Rental r)
   {   System.out.println("Display contract number >> " + g.getContractNumber());
       System.out.println("Display hours >> " + g.getNumberHours() + 
                          "\nDisplay minutes >> " + g.getNumberRemMinutes());
       System.out.println("Display the hourly rate >> $" + g.HOURLY_RENTAL_PAY);
       System.out.println("Display total price >> $" + g.getPrice() + "\n ");

       System.out.println("Display contract number >> " + t.getContractNumber());
       System.out.println("Display hours >> " + t.getNumberHours() + 
                          "\nDisplay minutes >> " + t.getNumberRemMinutes());
       System.out.println("Display the hourly rate >> $" + t.HOURLY_RENTAL_PAY);
       System.out.println("Display total price >> $" + t.getPrice() + "\n ");
       
       System.out.println("Display contract number >> " + r.getContractNumber());
       System.out.println("Display hours >> " + r.getNumberHours() + 
                          "\nDisplay minutes >> " + r.getNumberRemMinutes());
       System.out.println("Display the hourly rate >> $" + r.HOURLY_RENTAL_PAY);
       System.out.println("Display total price >> $" + r.getPrice() + "\n " + "...........................................................................................");
   }
public static void compareObjects(Rental y, Rental x)
        {  System.out.println("Display contract number >> " + y.getContractNumber() + 
                                   "\nDisplay hours >> " + y.getNumberHours() + 
                                   "\nDisplay minutes >> " + y.getMinutes());
           System.out.println("Display contract number >> " + x.getContractNumber() + 
                                   "\nDisplay hours >> " + x.getNumberHours() + 
                                   "\nDisplay minutes >> " + x.getMinutes());
         if(y.getMinutes() > x.getMinutes())
           {  System.out.println("              LONGER RENTAL TIME.");
               System.out.println("Display contract number >> " + y.getContractNumber() + "\n ");
             }
         else
           if(x.getMinutes() > y.getMinutes())
             {   System.out.println("            LONGER RENTAL TIME.");
                 System.out.println("Display contract number >> " + x.getContractNumber() + "\n ");
                   }
          else
            if(x.getMinutes() == y.getMinutes())
              {  System.out.println("               EQUAL RENTAL TIME.");
                 System.out.println("Display contract number >> " + x.getContractNumber() +
                                    "\nDisplay contract number >> " + y.getContractNumber() + "\n ");
                }
            }
}




























  