public class CarInsurancePolicy
{ private int policyNumber;
  private int numPayments;
  private String residentCity;
public CarInsurancePolicy(int num, int payment, String city)
   {  policyNumber = num;
      numPayments = payment;
      residentCity = city;
     }
public CarInsurancePolicy(int num, int payment)
   {  policyNumber = num;
      numPayments = payment;
      residentCity = "Mayfield";
       }
public CarInsurancePolicy(int num)
     { policyNumber = num;
       numPayments = 2;
       residentCity = "Mayfield";
         }
public void display()
    { System.out.println("Policy # " + policyNumber + "." + numPayments +
                          " payments annually. Driver resides in " +
                         residentCity + ".");
          }

}