import java.util.Scanner;
public class TestApartments
{  public static void main(String[]   args)
    {  Apartment apart1 = new Apartment(345, 1, 1, 9000);
       Apartment apart2 = new Apartment(89, 2, 1, 15000);
       Apartment apart3 = new Apartment(8860, 3, 2, 25000);
       Apartment apart4 = new Apartment(707, 5, 3, 60000);
       Apartment apart5 = new Apartment(2176,2, 2, 20000); 
            int bedRoomNum;
            int bathNum;
            double maxRent;
        Scanner inputDevice = new Scanner(System.in);
         System.out.print("Enter minimum number of bedrooms required >> ");
             bedRoomNum = inputDevice.nextInt();
         System.out.print("Enter minimum number of baths required >> ");
             bathNum = inputDevice.nextInt();
         System.out.print("Enter maximum amount of rent you are willing to pay >> ");
             maxRent = inputDevice.nextDouble();
     if( apart1.getBedRoomNum() >= bedRoomNum && apart1.getBathNum() >= bathNum && apart1.getRentAmount() <= maxRent)
         {   System.out.println("\nApartment Number : " + apart1.getApartmentNum() + "\nNumber of Bedroom(s) : " +
                apart1.getBedRoomNum() + "\nNumber of bathroom(s) : " + apart1.getBathNum() + "\nMonthly Rent : $" +
                   apart1.getRentAmount());
           }
      if(apart2.getBedRoomNum() >= bedRoomNum && apart2.getBathNum() >= bathNum && apart2.getRentAmount() <= maxRent)
          {    System.out.println("\nApartment Number : " + apart2.getApartmentNum() + "\nNumber of Bedroom(s) : " +
                apart2.getBedRoomNum() + "\nNumber of bathroom(s) : " + apart2.getBathNum() + "\nMonthly Rent : $" +
                   apart2.getRentAmount());
            }
       if( apart3.getBedRoomNum() >= bedRoomNum && apart3.getBathNum() >= bathNum && apart3.getRentAmount() <= maxRent)
         {   System.out.println("\nApartment Number : " + apart3.getApartmentNum() + "\nNumber of Bedroom(s) : " +
                apart3.getBedRoomNum() + "\nNumber of bathroom(s) : " + apart3.getBathNum() + "\nMonthly Rent : $" +
                   apart3.getRentAmount());
           }
       if( apart4.getBedRoomNum() >= bedRoomNum && apart4.getBathNum() >= bathNum && apart4.getRentAmount() <= maxRent)
         {   System.out.println("\nApartment Number : " + apart4.getApartmentNum() + "\nNumber of Bedroom(s) : " +
                apart4.getBedRoomNum() + "\nNumber of bathroom(s) : " + apart4.getBathNum() + "\nMonthly Rent : $" +
                   apart4.getRentAmount());
           }
       if( apart5.getBedRoomNum() >= bedRoomNum && apart5.getBathNum() >= bathNum && apart5.getRentAmount() <= maxRent)
         {   System.out.println("\nApartment Number : " + apart5.getApartmentNum() + "\nNumber of Bedroom(s) : " +
                apart5.getBedRoomNum() + "\nNumber of bathroom(s) : " + apart5.getBathNum() + "\nMonthly Rent : $" +
                   apart5.getRentAmount());
           }
     else
       if((bedRoomNum > apart1.getBedRoomNum() || bathNum > apart1.getBathNum() || apart1.getRentAmount() > maxRent) ||
            (bedRoomNum > apart2.getBedRoomNum() || bathNum > apart2.getBathNum() || apart2.getRentAmount() > maxRent) ||
              (bedRoomNum > apart3.getBedRoomNum() || bathNum > apart3.getBathNum() || apart3.getRentAmount() > maxRent) ||
                 (bedRoomNum > apart4.getBedRoomNum() || bathNum > apart4.getBathNum() || apart4.getRentAmount() > maxRent) ||
                    (bedRoomNum > apart5.getBedRoomNum() || bathNum > apart5.getBathNum() || apart5.getRentAmount() > maxRent))  
        { System.out.println("\nSORRY WE DO NOT HAVE APARTMENTS THAT SATISFIES YOUR CRITERIA.");
              }
     }
         
}