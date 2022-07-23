import java.util.Scanner;
public class ShowStudent2
{  public static void main(String[]  args)
      {    int idNumber;
           int creditHours;
           int numberPoints;
           int gradeAverage;
           Student2 firstStudent = new Student2();
        Scanner inputDevice = new Scanner(System.in);
        //System.out.print("Enter student's ID number >> ");
        //idNumber = inputDevice.nextInt();
        //System.out.print("Enter student's credit hours earned >> ");
        //creditHours = inputDevice.nextInt();
        //System.out.print("Enter number of points earned >> ");
       // numberPoints = inputDevice.nextInt();
       // gradeAverage = numberPoints / creditHours;
        //firstStudent.setIdNumber(idNumber);
        //firstStudent.setCreditHours(creditHours);
        //firstStudent.setNumberPoints(numberPoints);
       // firstStudent.setGradeAverage(gradeAverage);
        System.out.println("Student ID number is >> " + firstStudent.getIdNumber() + 
                               "\nCredit hours are >> " + firstStudent.getCreditHours() +
                               "\nThe number of points are >> " + firstStudent.getNumberPoints());
     
          }
}