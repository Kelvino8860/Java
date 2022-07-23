public class CreatePolicies2
{  public static void main(String[]  args)
    { CarInsurancePolicy2 firstObject = new CarInsurancePolicy2(123);
      CarInsurancePolicy2 secondObject = new CarInsurancePolicy2(456, 4);
      CarInsurancePolicy2 thirdObject = new CarInsurancePolicy2(789, 5, "Nairobi");
     // CarInsurancePolicy fourthObject = new CarInsurancePolicy();
      firstObject.display();
      secondObject.display();
      thirdObject.display();
    }
}