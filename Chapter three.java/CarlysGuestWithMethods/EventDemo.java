import java.util.Scanner;
public class EventDemo
{  public static void main(String[] args)
     {  numberOfGuests();
        numberOfEvent();
        Event oneObject = new Event();
        oneObject = getData(oneObject);
        CarlysEventPriceWithMethods.displayMotto();
        computePrice(oneObject);
        }
public static int numberOfGuests()
       {  int noGuest;
          Scanner inputDevice = new Scanner(System.in);
          System.out.print("Number of guests >> ");
          noGuest = inputDevice.nextInt();
          return noGuest;
     }
public static String numberOfEvent()
     {   String noEvent;
         Scanner keyInput = new Scanner(System.in);
         System.out.print("Enter event number >> ");
         noEvent = keyInput.nextLine();
           return noEvent;
              }
public static Event getData(Event details)
     { 
       details.setGuest(numberOfGuests());
       details.setEventNumber(numberOfEvent());
          return details;
            }
public static void computePrice(Event oneObject)
     {  boolean isEqual;
        isEqual = oneObject.getGuest() >= oneObject.LARGE_EVENT;
        System.out.println("Event number >> " + oneObject.getEventNumber() + "\nNumber of guests >> " +
                            oneObject.getGuest() + "\nPrice per guest >> " + oneObject.PRICE_PER_GUEST +
                            "\nTotal price >> " + oneObject.getPrice() + "\nEvent is large >> " + isEqual);
             }

}