import java.util.Scanner;
public class IntegerDemoInteractiveWithName
{    public static void main(String[] ars)
     { int anInt;
       byte aByte;
       short aShort;
       long aLong;
       String name;
       Scanner input = new Scanner(System.in); 
       System.out.println("Please enter an integer  ");
       anInt = input.nextInt();
       System.out.println("Please enter a byte integer  ");
       aByte = input.nextByte();
       System.out.println("Please enter a short integer  ");
       aShort = input.nextShort();
       System.out.println("Please enter a long integer  ");
       aLong = input.nextLong();
       System.out.print("Please enter your name >>  ");
       name = input.nextLine();
       System.out.println("Thank you  " + name);
      }
}