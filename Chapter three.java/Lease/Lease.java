public class Lease
{ private String tenantName;
  private int apartmentNumber;
  private int monthlyRent;
  private int numberOfMonths;
public Lease()
  { tenantName = "xxx";
    apartmentNumber = 0;
    monthlyRent = 1000;
    numberOfMonths = 12;
     }
public void setTenantName(String name)
    { tenantName = name;
         }
public void setApartmentNumber(int number)
    { apartmentNumber = number;
         }
public void setMonthlyRent(int rent)
    { monthlyRent = rent;
         }
public void setNumberOfMonths(int months)
   { numberOfMonths = months;
         }
public String getTenantName()
     { 
         return tenantName;
           }
public int getApartmentNumber()
     {
          return apartmentNumber;
           } 
public int getMonthlyRent()
     {
          return monthlyRent;
           }  
public int getNumberOfMonths()
     {
          return numberOfMonths;
         }
public int addPetFee()
      {   int petFee;
          final int PET_FEE = 10;
          petFee = monthlyRent + PET_FEE;
          explainPetPolicy();
          return petFee;
            }
public static String explainPetPolicy()
      { String petPolicy;
        petPolicy = "There is an additional charge of $10 on the monthly rent for all pets.";
        return petPolicy;
       
             }
}