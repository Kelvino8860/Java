public class CreatePolicies
{  public static void main(String[]  args)
    { CarInsurancePolicy firstObject = new CarInsurancePolicy(123);
      CarInsurancePolicy secondObject = new CarInsurancePolicy(456, 4);
      CarInsurancePolicy thirdObject = new CarInsurancePolicy(789, 5, "Nairobi");
     // CarInsurancePolicy fourthObject = new CarInsurancePolicy();
      firstObject.display();
      secondObject.display();
      thirdObject.display();
    }
}