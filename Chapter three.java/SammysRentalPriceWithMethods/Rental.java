public class Rental
{  public static final int NUMBER_MIN_HOUR = 60;
   public static final int HOURLY_RENTAL_PAY = 40;
   private String contractNumber;
   private int numberHours;
   private int numberRemMinutes;
   private int price;
public void setContractNumber(String contract)
    {
      contractNumber = contract;
          }
public void setHoursAndMinutes(int minutes)
    {   
       numberHours = minutes / NUMBER_MIN_HOUR;
       numberRemMinutes = minutes % NUMBER_MIN_HOUR;
       price = (numberHours * HOURLY_RENTAL_PAY) + ( numberRemMinutes);
         
           }
public String getContractNumber()
   {
      return contractNumber;
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