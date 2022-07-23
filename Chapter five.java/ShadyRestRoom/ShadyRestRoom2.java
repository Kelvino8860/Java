import java.util.Scanner;
public class ShadyRestRoom2
{  public static void main(String[]  args)
      {  int roomCode;
         int viewCode;
         String roomType1 = "Queen Bed";
         String roomType2 = "King";
         String roomType3 = "King Bed and Pullout Couch";
         String roomType4 = "Invalid choice";
         String viewType1 = "Lake View";
         String viewType2 = "Park View";
         String viewType3 = "Invalid";
         final int QUEEN_CODE = 1;
         final int KING_CODE = 2;
         final int KING_PULLOUT = 3;
         final int LAKE_VIEW = 1;
         final int PARK_VIEW = 2;
         final int PRICE_QUEEN = 125;
         final int PRICE_KING = 139;
         final int PRICE_PULL = 165;
         final int PRICE_VIEW = 15;
         final int PRICE_INVALID = 0;
         Scanner inputDevice = new Scanner(System.in);
         System.out.print("What type of room do you want?");
         System.out.println("\nEnter 1 for " + roomType1 +
                            "\nEnter 2 for " + roomType2 +
                            "\nEnter 3 for " + roomType3);
        roomCode = inputDevice.nextInt();
        System.out.print("What type of view would you love from your room?");
        System.out.println("\nEnter 1 for " + viewType1 +
                           "\nEnter 2 for " + viewType2);
        viewCode = inputDevice.nextInt();
        
            if(roomCode == 1)
                 { System.out.println("Room selected : " + roomType1);
                     if(viewCode == 1)
                   System.out.println("View selected : " + viewType1 + "\nPrice of room : $" + (PRICE_QUEEN + PRICE_VIEW));
                      else
                     if(viewCode == 2)
                   System.out.println("View selected : " + viewType2 + "\nPrice of room : $" + PRICE_QUEEN);
                     else
                   System.out.println("View selected : " + viewType3 + "\nPrice of room : $" + (PRICE_QUEEN + PRICE_VIEW));
                  }
            else
             if(roomCode == 2)
                  { System.out.println("Room selected : " + roomType2);
                     if(viewCode == 1)
                   System.out.println("View selected : " + viewType1 + "\nPrice of room : $" + (PRICE_KING + PRICE_VIEW));
                      else
                     if(viewCode == 2)
                   System.out.println("View selected : " + viewType2 + "\nPrice of room : $" + PRICE_KING );
                      else
                   System.out.println("View selected : " + viewType3 + "\nPrice of room : $" + (PRICE_KING + PRICE_VIEW));
                    } 
            else
             if(roomCode == 3)
                {  System.out.println("Room selected : " + roomType3);
                     if(viewCode == 1)
                   System.out.println("View selected : " + viewType1 + "\nPrice of room : $" + (PRICE_PULL + PRICE_VIEW));
                      else
                     if(viewCode == 2)
                   System.out.println("View selected : " + viewType2 + "\nPrice of room : $" + PRICE_PULL);
                      else
                   System.out.println("View selected : " + viewType3 + "\nPrice of room : $" + (PRICE_PULL + PRICE_VIEW));
                     }
              else
                 System.out.println("Room selected : " + roomType4 + "\nPrice of room : $" + PRICE_INVALID);
          }
}