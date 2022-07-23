import java.util.Scanner;
public class CreateSpaServices
{  public static void main(String[]   args)
   {  
      SpaService firstService = new SpaService();
      SpaService secondService = new SpaService();
      firstService = getData(firstService);
      secondService = getData(secondService);
     }
      public static SpaService getData(SpaService services)
         { String service;
           double price;
           Scanner inputDevice = new Scanner(System.in);
           System.out.print("Enter service >> ");
           service = inputDevice.nextLine();
           System.out.print("Enter price >> ");
           price = inputDevice.nextDouble();
           inputDevice.nextLine();
           services.setServiceDescription(service);
           services.setPrice(price);
           return services;
          }
      
}