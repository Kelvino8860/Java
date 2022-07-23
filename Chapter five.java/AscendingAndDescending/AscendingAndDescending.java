import java.util.Scanner;
public class AscendingAndDescending
{  public static void main(String[]  args)
         {  int myVal1, myVal2, myVal3;
            Scanner inputDevice = new Scanner(System.in);
            System.out.print("Enter an integer >> ");
            myVal1 = inputDevice.nextInt();
            System.out.print("Enter another integer >> ");
            myVal2 = inputDevice.nextInt();
            System.out.print("Enter last integer >> ");
            myVal3 = inputDevice.nextInt();
            System.out.println("\nThese integers are in decending order.");
              if((myVal1 > myVal2 && myVal1 > myVal3) && (myVal2 > myVal3))
                   System.out.println(myVal1 + ", " + myVal2 + ", " + myVal3);
              else
               if((myVal1 > myVal2 && myVal1 > myVal3) && (myVal3 > myVal2))
                   System.out.println(myVal1 + ", " + myVal3 + ", " + myVal2);
              else
               if((myVal2 > myVal1 && myVal2 > myVal3) && (myVal1 > myVal3))
                   System.out.println(myVal2 + ", " + myVal1 + ", " + myVal3);
             else
               if((myVal2 > myVal1 && myVal2 > myVal3) && (myVal3 > myVal1))
                   System.out.println(myVal2 + ", " + myVal3 + ", " + myVal1);
            else
               if((myVal3 > myVal1 && myVal3 > myVal2) && (myVal1 > myVal2))
                   System.out.println(myVal3 + ", " + myVal1 + ", " + myVal2);
            else
               if((myVal3 > myVal1 && myVal3 > myVal2) && (myVal2 > myVal1))
                   System.out.println(myVal3 + ", " + myVal2 + ", " + myVal1);
          System.out.println("\nThese integers are in ascending order.");
             if((myVal1 < myVal2 && myVal1 < myVal3) && (myVal2 < myVal3))
                   System.out.println(myVal1 + ", " + myVal2 + ", " + myVal3);
              else
               if((myVal1 < myVal2 && myVal1 < myVal3) && (myVal3 < myVal2))
                   System.out.println(myVal1 + ", " + myVal3 + ", " + myVal2);
              else
               if((myVal2 < myVal1 && myVal2 < myVal3) && (myVal1 < myVal3))
                   System.out.println(myVal2 + ", " + myVal1 + ", " + myVal3);
             else
               if((myVal2 < myVal1 && myVal2 < myVal3) && (myVal3 < myVal1))
                   System.out.println(myVal2 + ", " + myVal3 + ", " + myVal1);
            else
               if((myVal3 < myVal1 && myVal3 < myVal2) && (myVal1 < myVal2))
                   System.out.println(myVal3 + ", " + myVal1 + ", " + myVal2);
            else
               if((myVal3 < myVal1 && myVal3 < myVal2) && (myVal2 < myVal1))
                   System.out.println(myVal3 + ", " + myVal2 + ", " + myVal1);
           }
}