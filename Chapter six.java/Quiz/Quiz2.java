import java.util.Scanner;
public class Quiz2
{  public static void main(String[]  args)
      {  int answer1,answer2,answer3,answer4,answer5;
         Scanner inputDevice = new Scanner(System.in);
         System.out.println("\nAnswer questions by entering an integer representing the correct answer\n");

                        do{ System.out.println("What does ''www'' stand for in a website broser?");
                            System.out.println("\n1.Wild wide web" + "      " + "2.World wide web" +
                                "\n3.Wikipedia world web" + "   " + "4.World wide work");
                             answer1 = inputDevice.nextInt();
                                     }while(answer1 != 2);

                        do{  System.out.println("\nWhich country was among the original Axis power in WWII?");
                             System.out.println("\n1.France" + "   " + "2.America" +
                                "\n3.Britain" + "   " + "4.Germany");
                            answer2 = inputDevice.nextInt();
                                     }while(answer2 != 4);

                        do{   System.out.println("\nWhat geometric shape is generally used for stop signs");
                              System.out.println("\n1.Pentagon" + "   " + "2.Heptagon" +
                                "\n3.Octagon" + "   " + "4.Decagon");
                            answer3 = inputDevice.nextInt();
                                       }while(answer3 != 3);

                        do{  System.out.println("\nWhich animal can be seen on the Porsche logo?");
                              System.out.println("\n1.Eagle" + "   " + "2.Puma" +
                                "\n3.Deer" + "   " + "4.Horse");
                            answer4 = inputDevice.nextInt();
                                       }while(answer4 != 4);

                        do{ System.out.println("\nWhich is the only edible food that never goes bad?");
                             System.out.println("\n1.Cereals" + "   " + "2.Vegetables" +
                                "\n3.Honey" + "   " + "4.Meat");
                            answer5 = inputDevice.nextInt();
                                       }while(answer5 != 3);

         }
}