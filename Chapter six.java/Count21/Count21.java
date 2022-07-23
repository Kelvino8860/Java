import java.util.Scanner;
public class Count21
{  public static void main(String[]  args)
     { Count player = new Count();
       Count computer = new Count();
        int myValue;
        int count = 0;
        int comp;
      Scanner inputDevice = new Scanner(System.in);
      System.out.println("WELCOME TO COUNT21 GAME. ENJOY YOUR PLAY.");
        do{   System.out.print("Enter 1, 2 or 3 >> ");
               myValue = inputDevice.nextInt();
               player.setMyVal(myValue);
                  count += player.getMyVal();
                System.out.println("Count is : " + count);
                    if(count >= 21)
                        {  System.out.println("Player lost!!!");
                           System.out.println("THANK YOU FOR PLAYING");
                           break;
                         }
             if(count <= 17)
                {  computer.compNum();
                  count += computer.getCompVal();
                 }
            else
             if(count >=18)
                  { count += computer.getDoctor();
                   }
          }while(true);
     }
}