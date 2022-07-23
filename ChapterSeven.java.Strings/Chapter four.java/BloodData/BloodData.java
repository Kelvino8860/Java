public class BloodData
{ private String bloodType;
  private char rhesusFactor;
  public BloodData()
   { bloodType = "O";
     rhesusFactor = '+';
     System.out.println("Blood group is >> " + bloodType +
                        "\nRhesus factor is >> " + rhesusFactor);
      }
  public BloodData(String bloodType, char rhesusFactor)
     { this.bloodType = bloodType;
       this.rhesusFactor = rhesusFactor;
       System.out.println("Blood group is >> " + bloodType +
                        "\nRhesus factor is >> " + rhesusFactor);
      }
 public void setBloodType(String bloodType)
    { this.bloodType = bloodType;
           }
 public void setRhesusFactor(char rhesusFactor)
    { this.rhesusFactor = rhesusFactor;
          }
 public String getBloodType()
   {  return bloodType;
        }
 public char getRhesusFactor()
   { return rhesusFactor;
       } 
}