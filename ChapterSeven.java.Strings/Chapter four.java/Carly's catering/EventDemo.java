import java.util.Scanner;
public class EventDemo
{  public static void main(String[] args)
     {  Event object1 = new Event();
        Event object2 = new Event();
        object1 = getData(object1);
        CarlysEventPriceWithMethods.displayMotto();
        computePrice(object1, object2);
       }
public static Event getData(Event details)
     { String eventNumber;
       int guest;
       Scanner inputDevice = new Scanner(System.in);
       System.out.print("Enter eventNumber >> ");
       eventNumber = inputDevice.nextLine();
       System.out.print("Enter number of guests >> ");
       guest = inputDevice.nextInt();
       details.setGuest(guest);
       details.setEventNumber(eventNumber);
          return details;
            }
public static void computePrice(Event g, Event t)
     {  boolean isEqual;
        isEqual = g.getGuest() >= g.LARGE_EVENT;
        System.out.println("Event number >> " + g.getEventNumber() + "\nNumber of guests >> " +
                            g.getGuest() + "\nPrice per guest >> " + g.PRICE_PER_GUEST +
                            "\nTotal price >> " + g.getPrice() + "\nEvent is large >> " + isEqual);
        isEqual = t.getGuest() >= t.LARGE_EVENT;
        System.out.println("Event number >> " + t.getEventNumber() + "\nNumber of guests >> " +
                            t.getGuest() + "\nPrice per guest >> " + t.PRICE_PER_GUEST +
                            "\nTotal price >> " + t.getPrice() + "\nEvent is large >> " + isEqual);
             }

}