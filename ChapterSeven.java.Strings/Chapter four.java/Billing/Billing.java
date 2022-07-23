public class Billing
{  public static double TAX = 0.08;
   public static double computeBilling(double price)
      { double totalPrice;
        totalPrice = price + (price * TAX);
        System.out.println("The price of one book is $" + price + 
            " and will cost a total amount of $" + totalPrice + 
            " With an 8% added tax.");
         return totalPrice;
          }
  public static double computeBilling(double price, int qnt)
      { double totalPrice;
        totalPrice = price * qnt + (price * TAX);
        System.out.println("The price of " + qnt + " books is $" + totalPrice + 
            " With an 8% added tax.");
        return totalPrice;
          }
 public static double computeBilling(double price, int qnt, double coup)
     { double totalPrice;
       totalPrice = (price * qnt) - coup + (price * TAX);
       System.out.println("The price of " + qnt + " books is $" + totalPrice + " given a coupon value of $" + 
           coup + " With an 8% added tax.");
       return totalPrice;
         }
}