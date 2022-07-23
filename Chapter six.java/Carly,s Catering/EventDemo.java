import java.util.Scanner;
public class EventDemo
{  public static void main(String[] args)
     {  Event object1 = new Event();
        Event object2 = new Event();
        Event object3 = new Event();
        object1 = getData(object1);
        object2 = getData(object2);
        object3 = getData(object3);
        CarlysEventPriceWithMethods.displayMotto();
        loopingMethod(object2);
        computePrice(object1,object3);
        compareEvent(object1, object2);
        compareEvent(object1, object3);
        compareEvent(object2, object3);
       }
public static Event getData(Event details)
     { String eventNumber;
       int guest;
       Scanner inputDevice = new Scanner(System.in);
       System.out.print("Enter eventNumber >> ");
       eventNumber = inputDevice.nextLine();
          do{ System.out.print("Enter number of guests >> ");
               guest = inputDevice.nextInt();
             }while(guest < 5 || guest > 100);
       details.setGuest(guest);
       details.setEventNumber(eventNumber);
          return details;
            }
public static void loopingMethod(Event t)
   {  for(int i = 0; i < t.getGuest(); ++i)
            System.out.println("Please come to my event!");
       System.out.println("Event number >> " + t.getEventNumber() + "\nNumber of guests >> " +
                            t.getGuest() + "\nPrice per guest >> " + t.getPricePerGuest() +
                            "\nTotal price >> " + t.getPrice() + "\nEvent is large >> " + t.isLargeEvent() + "\n ");
         }
public static void computePrice(Event g, Event j)
     {  System.out.println("Event number >> " + g.getEventNumber() + "\nNumber of guests >> " +
                            g.getGuest() + "\nPrice per guest >> " + g.getPricePerGuest() +
                            "\nTotal price >> " + g.getPrice() + "\nEvent is large >> " + g.isLargeEvent() + "\n ");
            System.out.println("Event number >> " + j.getEventNumber() + "\nNumber of guests >> " +
                            j.getGuest() + "\nPrice per guest >> " + j.getPricePerGuest() +
                            "\nTotal price >> " + j.getPrice() + "\nEvent is large >> " + j.isLargeEvent() + "\n............................................................................");
             }
public static void compareEvent(Event y, Event x)
   {    System.out.println("COMPARISON OF EVENTS");
        System.out.println("Event number : " + y.getEventNumber() + "\nNumber of guests : " +
                            y.getGuest() + "\n ");
               System.out.println("Event number : " + x.getEventNumber() + "\nNumber of guests : " +
                            x.getGuest() + "\n ");
        if(y.getGuest() > x.getGuest())
           {  
              System.out.println("THE LARGER EVENT" + "\nEvent Number : " + y.getEventNumber() + "\nNumber Of Guests : " +
                                  y.getGuest()+ "\n.............................................................");
           }  
        else
         if(x.getGuest() > y.getGuest())
             {  
              System.out.println("THE LARGER EVENT" + "\nEvent Number : " + x.getEventNumber() + "\nNumber Of Guests : " +
                                  x.getGuest() + "\n...............................................................");
                     } 
         else
           if(x.getGuest() == y.getGuest())
           {    
              System.out.println("BOTH ARE LARGER EVENT" + "\nEvent Number : " + x.getEventNumber() + "\nNumber Of Guests : " +
                                  x.getGuest()+ "\n ");
              System.out.println("Event Number : " + y.getEventNumber() + "\nNumber Of Guests : " +
                                  y.getGuest() + "\n..........................................................................");
                 }  
}



















}