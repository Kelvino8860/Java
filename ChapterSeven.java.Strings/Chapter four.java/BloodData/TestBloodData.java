public class TestBloodData
{  public static void main(String[]  args)
     { BloodData first = new BloodData();
       BloodData second = new BloodData("AB", '-');
       BloodData third = new BloodData();
       third = getData(third);
       display(third);
          }
public static BloodData getData(BloodData details)
        {  String bloodType = "B";
           char rhesusFactor = '+';
           details.setBloodType(bloodType);
           details.setRhesusFactor(rhesusFactor);
           return details;
                 }
public static void display(BloodData third)
     {  System.out.println("Your blood type is >> " + third.getBloodType() +
                              "\nYour rhesus factor is >> " + third.getRhesusFactor());
         }
}