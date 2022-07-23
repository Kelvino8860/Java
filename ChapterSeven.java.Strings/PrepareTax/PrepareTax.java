import java.util.Scanner;
public class PrepareTax
{  public static void main(String[]   args)
       { String socialSecurity, firstName, lastName, streetAdress, city, state, zipCode, maritalStatus;
         int annualIncome; 
         Scanner inputDevice = new Scanner(System.in);
            
             System.out.print("Enter social security number >> ");
             socialSecurity = inputDevice.nextLine();
     while(true)
              {  if(socialSecurity.charAt(3) == '-' && socialSecurity.charAt(6) == '-')  //confirm social security number is in correct order
                         break;
                   else
                     if((socialSecurity.charAt(3) != '-' && socialSecurity.charAt(6) != '-'))
                           {  System.out.print("Enter social security number >> ");
                                socialSecurity = inputDevice.nextLine();
                             }
                }
           System.out.print("Enter last name >> ");
              lastName = inputDevice.nextLine();
           System.out.print("Enter first name >> ");
              firstName = inputDevice.nextLine();
           System.out.print("Enter street adress >> ");
              streetAdress = inputDevice.nextLine();
           System.out.print("Enter city >> ");
              city = inputDevice.nextLine();
           System.out.print("Enter state >> ");
              state = inputDevice.nextLine();
        
               System.out.print("Enter zip code >> ");
               zipCode = inputDevice.nextLine();
         while(true)
                {  if(zipCode.length() == 5)
                         break;
                    else
                      if(zipCode.length() != 5)
                             { System.out.print("Enter zip code >> ");
                                zipCode = inputDevice.nextLine();
                                }
                  }
     
            System.out.print("Enter marital status >> ");
            maritalStatus = inputDevice.nextLine();
         while(true)
               {  if(maritalStatus.charAt(0) == 's' || maritalStatus.charAt(0) == 'S' ||
                     maritalStatus.charAt(0) == 'm' || maritalStatus.charAt(0) == 'M')
                         break;
                  else
                    if(maritalStatus.charAt(0) != 's' || maritalStatus.charAt(0) != 'S' || 
                       maritalStatus.charAt(0) != 'm' || maritalStatus.charAt(0) != 'M')
                             { System.out.print("Enter marital status >> ");
                                maritalStatus = inputDevice.nextLine();
                               }
               }

         System.out.print("Enter annual income >> ");
         annualIncome = inputDevice.nextInt();
      while(true)       
            {   if(annualIncome > 0)
                     break;
                else
                  if(annualIncome < 0)
                        { System.out.print("Enter annual income >> ");
                            annualIncome = inputDevice.nextInt();
                          }
            }
       TaxReturn person1 = new TaxReturn(socialSecurity, lastName, firstName, streetAdress, city, state, zipCode, annualIncome, maritalStatus);
        display(person1);
         }
 public static void display(TaxReturn t)
          { System.out.println("\nSocial Security Number : " + t.getSecurityNum() + "\nLast Name : " + t.getLastName() +
                               "\nFirst Name : " + t.getFirstName() + "\nStreet Adress : " + t.getStreetAdress() +
                               "\nCity : " + t.getCity() + "\nState : " + t.getState() + "\nZip Code : " + t.getZipCode() +
                               "\nMarital Status : " + t.getMaritalStatus() + "\nAnnual Income : $" + t.getAnnualIncome() +
                               "\nTax Liability : $" + t.getTaxLiability());
                }
}




































