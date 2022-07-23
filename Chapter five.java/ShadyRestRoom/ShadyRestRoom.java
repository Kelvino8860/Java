import java.util.Scanner;
public class ShadyRestRoom
{  public static void main(String[]  args)
      {  int roomCode;
         String roomType1 = "Queen Bed";
         String roomType2 = "King";
         String roomType3 = "King Bed and Pullout Couch";
         String roomType4 = "Invalid choice";
         final int QUEEN_CODE = 1;
         final int KING_CODE = 2;
         final int KING_PULLOUT = 3;
         final int PRICE_QUEEN = 125;
         final int PRICE_KING = 139;
         final int PRICE_PULL = 165;
         final int PRICE_INVALID = 0;
         Scanner inputDevice = new Scanner(System.in);
         System.out.print("What type of room do you want?");
         System.out.println("\nEnter 1 for " + roomType1 +
                            "\nEnter2 for " + roomType2 +
                            "\nEnter3 for " + roomType3);
        roomCode = inputDevice.nextInt();
            if(roomCode == 1)
                System.out.println("Room selected : " + roomType1 + "\nPrice of room : $" + PRICE_QUEEN);
            else
             if(roomCode == 2)
                System.out.println("Room selected : " + roomType2 + "\nPrice of room : $" + PRICE_KING); 
             else
               if(roomCode == 3)
                System.out.println("Room selected : " + roomType3 + "\nPrice of room : $" + PRICE_PULL);
               else
                System.out.println("Room selected : " + roomType4 + "\nPrice of room : $" + PRICE_INVALID);
          }
}