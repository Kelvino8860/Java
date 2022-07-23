import java.util.Scanner;
public class BarChart
{   public static void main(String[]  args)
      {  int art, bob, cal, dan, eli;
         int i;
         Scanner inputDevice = new Scanner(System.in);
         System.out.print("Enter points earned by Art >> ");
           art = inputDevice.nextInt();
         System.out.print("Enter points earned by Bob >> ");
           bob = inputDevice.nextInt();
         System.out.print("Enter points earned by Cal >> ");
           cal = inputDevice.nextInt();
         System.out.print("Enter points earned by Dan >> ");
           dan = inputDevice.nextInt();
         System.out.print("Enter points earned by Eli >> ");
           eli = inputDevice.nextInt();
                   System.out.println("\nPoints for Game" + "\n ");
           System.out.print("Art  ");
           for(i = 0; i < art; ++i)
                {  System.out.print("*");
                    }
           System.out.print("\nBob  ");
           for(i = 0; i < bob; ++i)
                { System.out.print("*");
                    } 
           System.out.print("\nCal  ");
           for(i = 0; i < cal; ++i)
                {  System.out.print("*");
                    }
           System.out.print("\nDan  ");
           for(i = 0; i < dan; ++i)
                { System.out.print("*");
                    }
           System.out.print("\nEli  ");
           for(i = 0; i < eli; ++i)
                { System.out.print("*");
                    }
        }
}