public class Retirement
{  private int years;
   private int savings;
   private double totalAmount;
   private double k;
   private int j;
   private final double RATE = 0.04;
 public void setYears(int years)
    {  this.years = years;
      }
 public void setSavings(int savings)
    {  this.savings = savings;
      for(j = 1; j <= years ; ++j)
          { k = Math.pow(1.0 + RATE, j);
            this.savings *= k;
            }
      }
 public int getYears()
    {  return years;
         }
 public int getSavings()
    {  return savings;
       }
 public double getTotalAmount()
     {  return totalAmount;
         }
}