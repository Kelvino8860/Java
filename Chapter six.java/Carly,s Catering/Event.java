public class Event
{
   public static final int LOWER_PRICE_PER_GUEST = 32;
   public static final int HIGHER_PRICE_PER_GUEST = 35;
   public static final int LARGE_EVENT = 50;
   private String eventNumber;
   private int guest;
   private int price;
   private int pricePerGuest;
   public Event()
       {  this.eventNumber = "A000";
          this.guest = 0;
           }
   public Event(String eventNumber, int guest)
       {   this.eventNumber = eventNumber;
           this.guest = guest;
            }
public  void setEventNumber(String number)
    {
      eventNumber = number;

          }
public  void setGuest(int noGuest)
    {
       guest = noGuest;
        if(isLargeEvent() == true)
           {  price = guest * LOWER_PRICE_PER_GUEST;
              pricePerGuest = price / guest;
             }
        else 
          if(isLargeEvent() == false)
            {  price = guest * HIGHER_PRICE_PER_GUEST;
               pricePerGuest = price / guest;
          }
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
public int getPricePerGuest()
   {  
        return pricePerGuest;
    
          }
public boolean isLargeEvent()
    {   if(guest >= LARGE_EVENT)
           return true;
        else
          return false;
    }
}
























