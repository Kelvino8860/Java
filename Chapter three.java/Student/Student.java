public class Student
{  private int idNumber;
   private int creditHours;
   private int numberPoints;
   private int gradeAverage;
public void setIdNumber(int idNum)
    {
       idNumber = idNum;
       }
public void setCreditHours(int creditHrs)
    {
       creditHours = creditHrs;
      }
public void setNumberPoints(int numberPnts)
     {
       numberPoints = numberPnts;
         }
public void setGradeAverage(int gradeAve)
       {
           gradeAverage = gradeAve;
          }
public int getIdNumber()
    {
        return idNumber;
       }
public int getCreditHours()
    {
        return creditHours;
            }
public int getNumberPoints()
    {
       return numberPoints;
        }
public int getGradeAverage()
    {
       gradeAverage = numberPoints / creditHours;
       return gradeAverage;
      }
}