public class Event
{
   public static final int LOWER_PRICE_PER_GUEST = 32;
   public static final int HIGHER_PRICE_PER_GUEST = 35;
   public static final int LARGE_EVENT = 50;
   private String eventNumber;
   private String phoneNumber;
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
    {  if(number.length() == 4 && Character.isLetter(number.charAt(0)) &&
           Character.isDigit(number.charAt(1)) && Character.isDigit(number.charAt(2)) &&
           Character.isDigit(number.charAt(2)))
              {  char ch = Character.toUpperCase(number.charAt(0));
                  if(Character.isLowerCase(number.charAt(0)))
                    { String newNumber = number.replace(number.charAt(0), ch);
                      eventNumber = newNumber;
                     }
                   else
                     eventNumber = number;
               }
       else
         eventNumber = "A000";

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
public void setPhoneNumber(String phone)
      { int count = 0;  String oldPhone ="          ";
        char ch = ' '; 
         for(int i = 0; i < phone.length(); ++i)
              {  if(Character.isDigit(phone.charAt(i)))
                  ++count;
               }
         if(count == 10)
            { for(int i = 0; i < phone.length(); ++i)
               { if(Character.isDigit(phone.charAt(i)))
                  {  ch = phone.charAt(i);
                     phoneNumber = oldPhone.replace(oldPhone.charAt(i), ch);
                   }
               }
            }
          else
           phoneNumber = "0000000000";
        }
public String getPhoneNumber()
      { 
          return phoneNumber;
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
























