import java.util.Scanner;
public class VallidatePassword
{   public static void main(String[]  args)
        {  String myPassword;
           int i;
           int countUpper = 0;
           int countLower = 0;
           int countDigit = 0;
          Scanner inputDevice = new Scanner(System.in);
          System.out.print("Password should have atleast 2 uppercase letters, 3 lowercase letters and atleast 1 digit");
     while(true){ System.out.print("\nEnter password >> ");
                     myPassword = inputDevice.nextLine();
                      for(i = 0; i < myPassword.length(); ++i)
                         { if(Character.isUpperCase(myPassword.charAt(i)))
                                ++countUpper;
                           if(Character.isLowerCase(myPassword.charAt(i)))
                               ++countLower;
                           if(Character.isDigit(myPassword.charAt(i)))
                                ++countDigit;
                        }
                  System.out.println("CountUpper : " + countUpper + "\nCountLower : " + countLower + "\nCountDigit : " + countDigit);
                      if(countUpper >= 2 && countLower >= 3 && countDigit >= 1)
                            { System.out.println("Password is valid");
                                break;
                             }
                      if(countUpper < 2)
                           {  System.out.println("Invalid password. Uppercase letters are less than 2");
                           }
                     if(countLower < 3)
                         {    System.out.println("Invalid password. Lowercase letters are less than 3");
                          }
                     if(countDigit < 1)
                          {   System.out.println("Invalid password. Digits are less than 1");
                           }
                     countUpper = 0;
                     countLower = 0;
                     countDigit = 0;
                  }
        }
}