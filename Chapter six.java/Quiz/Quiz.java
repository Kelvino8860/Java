import java.util.Scanner;
public class Quiz
{  public static void main(String[]  args)
      {  int answer1,answer2,answer3,answer4,answer5;
         int rights = 0;
         int fails = 0;
         double percentage;
         final int numQuiz = 5;
         Scanner inputDevice = new Scanner(System.in);
         System.out.println("\nAnswer questions by entering an integer representing the correct answer\n");
                         System.out.println("What does ''www'' stand for in a website broser?");
                         System.out.println("\n1.Wild wide web" + "      " + "2.World wide web" +
                                "\n3.Wikipedia world web" + "   " + "4.World wide work");
                            answer1 = inputDevice.nextInt();
                                  if(answer1 == 2)
                                     { System.out.println("Congratulation!!! You got it right");
                                            ++rights;
                                      }
                                  else
                                     { System.out.println("Sorry!! Wrong answer.");
                                         ++fails;
                                     }
                          System.out.println("\nWhich country was among the original Axis power in WWII?");
                         System.out.println("\n1.France" + "   " + "2.America" +
                                "\n3.Britain" + "   " + "4.Germany");
                            answer2 = inputDevice.nextInt();
                                  if(answer2 == 4)
                                     { System.out.println("Congratulation!!! You got it right");
                                            ++rights;
                                      }
                                  else
                                     { System.out.println("Sorry!! Wrong answer.");
                                         ++fails;
                                     }
                           System.out.println("\nWhat geometric shape is generally used for stop signs");
                         System.out.println("\n1.Pentagon" + "   " + "2.Heptagon" +
                                "\n3.Octagon" + "   " + "4.Decagon");
                            answer3 = inputDevice.nextInt();
                                  if(answer3 == 3)
                                     { System.out.println("Congratulation!!! You got it right");
                                            ++rights;
                                      }
                                  else
                                     { System.out.println("Sorry!! Wrong answer.");
                                         ++fails;
                                       } 
                           System.out.println("\nWhich animal can be seen on the Porsche logo?");
                         System.out.println("\n1.Eagle" + "   " + "2.Puma" +
                                "\n3.Deer" + "   " + "4.Horse");
                            answer4 = inputDevice.nextInt();
                                  if(answer4 == 4)
                                     { System.out.println("Congratulation!!! You got it right");
                                            ++rights;
                                      }
                                  else
                                     { System.out.println("Sorry!! Wrong answer.");
                                         ++fails;
                                       }
                           System.out.println("\nWhich is the only edible food that never goes bad?");
                         System.out.println("\n1.Cereals" + "   " + "2.Vegetables" +
                                "\n3.Honey" + "   " + "4.Meat");
                            answer5 = inputDevice.nextInt();
                                  if(answer5 == 3)
                                     { System.out.println("Congratulation!!! You got it right");
                                            ++rights;
                                      }
                                  else
                                     { System.out.println("Sorry!! Wrong answer.");
                                         ++fails;
                                       }
          System.out.println("\nNo of correct answers : " + rights + "   " + "No of wrong answers : " + fails);
                percentage = (double) rights / numQuiz * 100;
           System.out.println("Percentage score : " + percentage + "%");
         }
}