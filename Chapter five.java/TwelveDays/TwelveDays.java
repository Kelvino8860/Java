import java.util.Scanner;
public class TwelveDays
{  public static void main(String[]  args)
    {  int day;
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("Enter value of day >> ");
      day = inputDevice.nextInt();
      System.out.println("\nOn day " + day + " of christmas" + "\nMy good friend brought to me");
         switch(day)
          { case 12:
              System.out.println("All their good wishes");
            case 11:
              System.out.println("Gifts for one and all");
            case 10:
               System.out.println("Some mistletoe");
            case 9:
              System.out.println("A guardian angle");
            case 8:
              System.out.println("Gold and silver tinsel");
            case 7:
              System.out.println("Candle a-glowing");
            case 6:
              System.out.println("Litle silver bells"); 
            case 5:
              System.out.println("A shining star");
            case 4:
              System.out.println("Four colored lights");
            case 3:
              System.out.println("Three boughs of holly");
            case 2:
              System.out.println("Two candy canes");
            case 1:
              System.out.println("A song and a christmass tree"); 
                 break;
            default:
              System.out.println("Invalid day");                     
                           }
    }
}