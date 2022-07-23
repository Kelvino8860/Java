public class Patient 
{  private int idNum;
   private int age;
   private BloodData bloodData;
   public Patient()
   {  bloodData = new BloodData("O", '+');
      idNum = 0;
      age = 0;
      System.out.println("Patients ID number >> " + idNum +
                         "\nPatients age >> " + age);
         }
   public Patient(int idNum, int age)
     {  bloodData = new BloodData("AB", '-');
        this.idNum = idNum;
        this.age = age;
        System.out.println("Patients ID number >> " + idNum +
                         "\nPatients age >> " + age);
         }
               public void setIdNum(int idNum)
                   {  this.idNum = idNum;
                             }
                 public void setAge(int age)
                      {  this.age = age;
                            }
                   public void setBloodData(BloodData bloodData)
                       { this.bloodData = bloodData;
                                   }
  public int getIdNum()
     { return idNum;
           }
  public int getAge()
     { return age;
            }
  public BloodData getBloodData()
   {  return bloodData;
               }
}