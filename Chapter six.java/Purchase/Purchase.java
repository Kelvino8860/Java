public class Purchase
{  private static int invoiceNum;
   private static int salesAmount;
   private static double salesTax;
   private static final double RATE = 0.05;
public void setInvoiceNum(int invoice)
   {  invoiceNum = invoice;
      }
public void setSalesAmount(int sales)
   {  salesAmount = sales;
      salesTax = RATE * salesAmount;
        }
public static void display()
  {  System.out.println("Invoice Number : " + invoiceNum + "\nSales Amount : " +
                   salesAmount + "\nSales Tax : " + salesTax);
   }
}