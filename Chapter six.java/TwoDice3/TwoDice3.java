import java.util.Scanner;
public class TwoDice3
{    public static void main(String[]   args)
          {  Die2 Object1 = new Die2();
             int myVal;
             int count = 0;
              Scanner inputDevice = new Scanner(System.in);
               System.out.print("Enter an interger ranging from 2 to 12 >> ");
                 myVal = inputDevice.nextInt();
              for(int i = 0; i < 4; i++)
                 { Object1.roll();
                    ++count;
                        System.out.print("\nDie one : " + Object1.getRandomValue1() + "\nDie two : " + 
                                            Object1.getRandomValue2());
                       if(Object1.getTotal() == myVal && count <= 3)
                           { System.out.println("\nYou win!!!");
                              break;
                            }
                  }
                       if(count > 3)  
                  System.out.println("\nComputer wins!!!");
             }
}