import java.util.Scanner;
public class PhoneNumberFormat
{  public static void main(String[]  args)
      {  String phoneNumber;
         String endProgram = "999";
         String newPhoneNumber = "";
       Scanner inputDevice = new Scanner(System.in);
       System.out.print("Enter phone number >> ");
           phoneNumber = inputDevice.nextLine();
               while(phoneNumber.length() != 10)
                  {  System.out.println("ERROR!!! Enter 10 digits.");
                       System.out.print("Enter phone number >> ");
                          phoneNumber = inputDevice.nextLine();
                      if(phoneNumber.equals(endProgram))
                          break;
                     }
    if(phoneNumber.length() == 10)
      { StringBuilder object = new StringBuilder(phoneNumber);
        object.insert(0, "(");
        object.insert(4, ")");
        object.insert(5, " ");
        object.insert(9, "-");
        System.out.println(object);
       }
      }
}