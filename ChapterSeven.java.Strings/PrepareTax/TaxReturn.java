public class TaxReturn
{  private final double SIN_RATE1 = 0.15;          private String securityNum;
   private final double SIN_RATE2 = 0.22;          private String lastName;
   private final double SIN_RATE3 = 0.30;          private String firstName;       
   private final double MAR_RATE1 = 0.14;          private String streetAdress;           
   private final double MAR_RATE2 = 0.20;          private String city;     
   private final double MAR_RATE3 = 0.28;         
   private String state;
   private String zipCode;
   private int annualIncome;
   private String maritalStatus;
   private double taxLiability;                                          
public TaxReturn(String securityNum, String lastName, String firstName, String streetAdress, String city, String state,
                 String zipCode, int annualIncome, String maritalStatus)
                             {  this.securityNum = securityNum;           this.state = state;
                                this.lastName = lastName;                 this.zipCode = zipCode;
                                this.firstName = firstName;               this.annualIncome = annualIncome;
                                this.streetAdress = streetAdress;         this.maritalStatus = maritalStatus;
                                this.city = city;                   
                                                    if(maritalStatus.charAt(0) == 's' || maritalStatus.charAt(0) == 'S')
                                                          {  if(annualIncome > 0 && annualIncome <= 20_000)
                                                                  taxLiability = SIN_RATE1 * annualIncome;
                                                             else
                                                               if(annualIncome > 20_000 && annualIncome <= 50_000)
                                                                   taxLiability = SIN_RATE2 * annualIncome;
                                                             else
                                                               if(annualIncome > 50_000)
                                                                    taxLiability = SIN_RATE3 * annualIncome;
                                                             }
                                                     if(maritalStatus.charAt(0) == 'm' || maritalStatus.charAt(0) == 'M')
                                                          {  if(annualIncome > 0 && annualIncome <= 20_000)
                                                                  taxLiability = MAR_RATE1 * annualIncome;
                                                             else
                                                               if(annualIncome > 20_000 && annualIncome <= 50_000)
                                                                   taxLiability = MAR_RATE2 * annualIncome;
                                                             else
                                                               if(annualIncome > 50_000)
                                                                    taxLiability = MAR_RATE3 * annualIncome; 
                                                              }
                                 }
public String getSecurityNum()          
   {  return securityNum; 
          }
public String getLastName()
   {   return lastName;
          }
public String getFirstName()
   {   return firstName;
        }
public String getStreetAdress()
    {  return streetAdress;
       }
public String getCity()
    {  return city;
       }
public String getState()
   {  return state;
        }
public String getZipCode()
  {  return zipCode;
      }
public int getAnnualIncome()
   {  return annualIncome;
        }
public String getMaritalStatus()
   {   return maritalStatus;
        }
public double getTaxLiability()
   {  return taxLiability;
       }
}




















