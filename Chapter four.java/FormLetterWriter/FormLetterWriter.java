public class FormLetterWriter
{ public static void  displaySalutations(String lastNames)
     {  String lastName;
        lastName = lastNames;
        System.out.println("Dear Mr. or Ms." + lastName);
           }
   public static void displaySalutations(String firstNames, String secondNames)
    {   String firstName, secondName;
        firstName = firstNames;
        secondName =secondNames;
        System.out.println("Dear " + firstName + " " + secondName);
        System.out.println("Thank you for your order.");
         }

}