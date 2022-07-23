
import java.util.Scanner;
public class AssignGrades {
    public static void main(String[] args)
    {  
         Scanner inputDevice = new Scanner(System.in);
          int lengthArray;
          //Enter the number of students to initialize length of Array
          System.out.print("Enter the number of students >> ");
             lengthArray = inputDevice.nextInt();
             int[] scores = new int[lengthArray];
        //Fill the array with grades
        System.out.print("Enter " + lengthArray + " scores >> ");
           for(int i = 0; i < scores.length; ++i)
               scores[i] = inputDevice.nextInt();
         //Find the best score in the array
         int temp = scores[0];
         for(int i = 0; i < scores.length; ++i)
         {
             if(scores[i] > temp)
                 temp = scores[i];
         }
         //Use conditional statements to set grades
         for(int i = 0; i < scores.length; ++i)
         {
            if(scores[i] >= (temp - 5))
           {
               System.out.println("Student " + i + " score is " + scores[i] +
                       " and grade is A");
               
           }
            if(scores[i] >= (temp - 10) && scores[i] < (temp - 5))
            {
                System.out.println("Student " + i + " score is " + scores[i] +
                        " and grade is B");
                
            }
            if(scores[i] >= (temp - 15) && scores[i] < (temp - 10))
            {
                System.out.println("Student " + i + " score is " + scores[i] +
                        " and grade is C");
                
            }
            if(scores[i] >= (temp - 20) && scores[i] < (temp - 20))
            {
                System.out.println("Student " + i + " score is " + scores[i] +
                        " and grade is D");
                
            }
            else
             if(scores[i] < (temp - 20))   
            { System.out.println("Student " + i + " score is " + scores[i] +
                        " and grade is F");
                 
            }
         }
    }
}
