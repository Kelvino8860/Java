/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortstudents;
import java.util.Scanner;
/**
 *
 * @author NJORO
 */
public class SortStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numStudents;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students >> ");
        numStudents = input.nextInt();
        int[] scores = new int[numStudents];
        String[] names = new String[numStudents + 1];
        
        //Fill the arrays using a loop
        System.out.print("Enter students names >> ");
        for(int i = 0; i < names.length; ++i)
        {
            names[i] = input.nextLine();
        }
        System.out.print("Enter students scores >> ");
        for(int i = 0; i < scores.length; i++)
        {
            scores[i] = input.nextInt();
        }
       int temp = scores[0];
       String nameTemp = names[0];
       System.out.println("Scores" + "    " + "Name");
       int l = scores.length;
           for(int i = 0; i < l; ++i)
           {
               int pos = i;
               for(int j = 1; j < l-1; ++j)
                   if(scores[i] < scores[j])
                   {
                       pos = j;
                   }
               //swap scores
               int t1 = scores[pos];
               scores[pos] = scores[i];
               scores[i] = t1;
               //swap names
               String t2 = names[pos];
               names[pos] = names[i];
               names[i] = t2;
                   
           }
           //Print names in descending order
           for(int i = 0; i < numStudents; ++i)
           {
               System.out.println(scores[i] + "      " + names[i]);
           }
    }
    
}
