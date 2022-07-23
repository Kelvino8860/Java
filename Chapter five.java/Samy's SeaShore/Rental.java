public class Rental
{  public static final int NUMBER_MIN_HOUR = 60;
   public static final int HOURLY_RENTAL_PAY = 40;
   public static final int PRICE_REM_MINUTES = 1;
   private String contractNumber;
   private int numberHours;
   private int numberRemMinutes;
   private int price;
   private int minutes;
   public Rental()
    {  contractNumber = "A000";
       numberHours = 0;
          }
  public Rental(String contractNumber, int numberHours)
     {  this.contractNumber = contractNumber;
        this.numberHours = numberHours;
          }
public void setContractNumber(String contract)
    {
      contractNumber = contract;
          }
public void setHoursAndMinutes(int minute)
    {   this.minutes = minute;
       numberHours = minutes / NUMBER_MIN_HOUR;
       numberRemMinutes = minutes % NUMBER_MIN_HOUR;
      if(numberRemMinutes <= 40)
       price = (numberHours * HOURLY_RENTAL_PAY) + (numberRemMinutes * PRICE_REM_MINUTES);
      else
       if(numberRemMinutes > 40)
           price = (numberHours * HOURLY_RENTAL_PAY) + (HOURLY_RENTAL_PAY);  
           }
public String getContractNumber()
   {
      return contractNumber;
         }
public int getMinutes()
   {  return minutes;
       }
public int getNumberHours()
   {
        return numberHours;
        }
public int getNumberRemMinutes()
    {
       return numberRemMinutes;
            }
public int getPrice()
    {
        return price;
           }
}