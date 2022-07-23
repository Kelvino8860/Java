public class Event
{
   public static final int PRICE_PER_GUEST = 35;
   public static final int LARGE_EVENT = 50;
   private String eventNumber;
   private int guest;
   private int price;
public  void setEventNumber(String number)
    {
      eventNumber = number;

          }
public  void setGuest(int noGuest)
    {
       guest = noGuest;
       price = guest * PRICE_PER_GUEST;

          }
public String getEventNumber()
    {
          return eventNumber;

        }
public int getGuest()
     {
        return guest;

         }
public int getPrice()
    {
         return price;

            }
}