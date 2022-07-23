import java.util.Scanner;
public class ShowStudent
{  public static void main(String[]  args)
      { Student firstStudent = new Student();
        firstStudent = getData(firstStudent);
           }
public static Student getData(Student details)
       {
           int idNumber;
           int creditHours;
           int numberPoints;
           int gradeAverage;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter student's ID number >> ");
        idNumber = inputDevice.nextInt();
        System.out.print("Enter student's credit hours earned >> ");
        creditHours = inputDevice.nextInt();
        System.out.print("Enter number of points earned >> ");
        numberPoints = inputDevice.nextInt();
        gradeAverage = numberPoints / creditHours;
        details.setIdNumber(idNumber);
        details.setCreditHours(creditHours);
        details.setNumberPoints(numberPoints);
        details.setGradeAverage(gradeAverage);
           System.out.println("Student average grade point >> " + gradeAverage);
          return details;
          }
}