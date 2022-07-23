import java.util.Scanner;
public class CreatePurchase
{   public static void main(String[]   args)
      { Purchase object1 = new Purchase();
        object1 = getData(object1);
        }
   public static Purchase getData(Purchase details)
      {  int invoiceNum, salesAmount;
         final int j = 1000;
         final int k = 8000;
         Scanner inputDevice = new Scanner(System.in);
         System.out.print("Enter invoice number >> ");
            invoiceNum = inputDevice.nextInt(); 
          while(invoiceNum < j || invoiceNum > k)           
          {   System.out.print("Enter invoice number >> ");
                  invoiceNum = inputDevice.nextInt();
            }
              
          System.out.print("Enter sales amount number >> ");
          salesAmount = inputDevice.nextInt();
                  while(salesAmount < 0)
                     { --salesAmount;
                       System.out.print("Enter sales amount number >> ");
                         salesAmount = inputDevice.nextInt();
                       }
           details.setSalesAmount(salesAmount);
           details.setInvoiceNum(invoiceNum);
           Purchase.display();
             return details;
     }
}