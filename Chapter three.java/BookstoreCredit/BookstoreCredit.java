import java.util.Scanner;
public class BookstoreCredit
{ public static void main(String[]  args)
      {  Bookstore studentDetail = new Bookstore();
         studentDetail = getData(studentDetail);
         }
  public static Bookstore getData(Bookstore details)
     {  String name;
        double grade;
        double credit;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter your name >> ");
        name = inputDevice.nextLine();
        System.out.print("Enter your average grade >> ");
        grade = inputDevice.nextDouble();
        details.setstudentName(name);
        details.setstudentGrade(grade);
        credit = grade * 10;
        System.out.println("Congratulations " + name + ", your grade point average was " +
                         grade + " points, thus you have received a credit of $" +
                           credit + " from the store.");
        return details;
       
      }
}
  