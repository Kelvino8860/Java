public class TestPatient
{  public static void main(String[]  args)
     {  Patient first = new Patient();
        Patient second = new Patient(13267, 70);
        Patient third = new Patient();
        third = getData(third);
         }
   public static Patient getData(Patient third)
     {  BloodData bloodData = new BloodData("AB", '-');
        int idNum = 56890;
        int age = 56;
        third.setIdNum(idNum);
        third.setAge(age);
        third.setBloodData(bloodData);
        System.out.println("ID number >> " + third.getIdNum() +
                           "\nAge >> " + third.getAge());
        return third;
       }
}