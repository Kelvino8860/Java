import java.util.Scanner;
public class QuizScoreStatistics
{   public static void main(String[] args)
       {  int score;
          int totalScore = 0;
          int numTest = 0;
          double average = 0;
          int highestScore = 0;
          int lowestScore = 0;
          final int BREAK_PROG = 99;
            Scanner inputDevice = new Scanner(System.in);
              while(true)
                  {  System.out.print("Enter value of student score >> ");
                        score = inputDevice.nextInt();
                      if(score == BREAK_PROG)
                          {  break;
                              }
                      if(score < 0 || score > 10)
                             { System.out.println("Enter a valid score!! Should not be less than 0 or greater than 10 ");
                                 System.out.print("Enter value of Student score >> "); 
                                 score = inputDevice.nextInt();
                                }
                                   totalScore =totalScore + score;
                                     ++numTest;
                      lowestScore = score;
                     if(score > highestScore)
                          {  highestScore = score;
                                }
                     else
                       if(score < lowestScore)
                             { lowestScore = score;
                                 }
                    }
               average = (double) totalScore / numTest;
               System.out.println("Student's scores : " + numTest);
               System.out.println("Total Scores : " + totalScore);
               System.out.println("Highest Score : " + highestScore);
               System.out.println("Lowest Score : " + lowestScore);
               System.out.println("Average Score : " + average);
       }
}