import java.util.Scanner;
public class TestLease
{    public static void main(String[]  args)
       { Lease firstObject = new Lease();
         Lease secondObject = new Lease();
         Lease thirdObject = new Lease();
         Lease fourthObject = new Lease();
         firstObject = getData(firstObject);
         secondObject = getData(secondObject);
         thirdObject = getData(thirdObject);
         showValues(firstObject);
         showValues(secondObject, thirdObject, fourthObject);
            }
     public static Lease getData(Lease details)
                    {  String tenantName;
                       int apartmentNumber;
                       int monthlyRent;
                       int numberOfMonths;
                       Scanner inputDevice = new Scanner(System.in);
                       System.out.print("Enter tenant's name >> ");
                       tenantName = inputDevice.nextLine();
                       System.out.print("Enter apartment number >> ");
                       apartmentNumber = inputDevice.nextInt();
                       System.out.print("Enter monthly rent >> ");
                       monthlyRent = inputDevice.nextInt();
                       System.out.print("Enter number of months >> ");
                       numberOfMonths = inputDevice.nextInt();
                       details.setTenantName(tenantName);
                       details.setApartmentNumber(apartmentNumber);
                       details.setMonthlyRent(monthlyRent);
                       details.setNumberOfMonths(numberOfMonths);
                       return details;
                      }
       public static void showValues(Lease firstObject)
                   {   System.out.println("\nName of tenant # " + firstObject.getTenantName() +
                                          "\nApartment number # " + firstObject.getApartmentNumber() +
                                          "\nMonthly rent # " + firstObject.getMonthlyRent() +
                                          "\nNumber of months # " + firstObject.getNumberOfMonths() +
                                          "\nMonthly rent for those with pets # " + firstObject.addPetFee() +
                                          "\nPolicy explanation # " + firstObject.explainPetPolicy());
                      
                             }
       public static void showValues(Lease secondObject, Lease thirdObject, Lease fourthObject)
            
            {    System.out.println("\nName of tenant # " + secondObject.getTenantName() +
                                          "\nApartment number # " + secondObject.getApartmentNumber() +
                                          "\nMonthly rent # " + secondObject.getMonthlyRent() +
                                          "\nNumber of months # " + secondObject.getNumberOfMonths() +
                                          "\nMonthly rent for those with pets # " + secondObject.addPetFee() +
                                          "\nPolicy explanation # " + secondObject.explainPetPolicy());
                      
     
                System.out.println("\nName of tenant # " + thirdObject.getTenantName() +
                                          "\nApartment number # " + thirdObject.getApartmentNumber() +
                                          "\nMonthly rent # " + thirdObject.getMonthlyRent() +
                                          "\nNumber of months # " + thirdObject.getNumberOfMonths() +
                                          "\nMonthly rent for those with pets # " + thirdObject.addPetFee() +
                                          "\nPolicy explanation # " + thirdObject.explainPetPolicy());
                    
       
               System.out.println("\nName of tenant # " + fourthObject.getTenantName() +
                                          "\nApartment number # " + fourthObject.getApartmentNumber() +
                                          "\nMonthly rent # " + fourthObject.getMonthlyRent() +
                                          "\nNumber of months # " + fourthObject.getNumberOfMonths() +
                                          "\nMonthly rent for those with pets # " + fourthObject.addPetFee() +
                                          "\nPolicy explanation # " + fourthObject.explainPetPolicy());
                            }
    
}


































