import java.util.Scanner;
public class RetirementGoal
{  public static void main(String[]  args)
     {  Retirement object1 = new Retirement();
        object1 = getData(object1);
        display(object1);
       }
     public static Retirement getData(Retirement details)
         {  int years, savings;
           Scanner inputDevice = new Scanner(System.in);
              System.out.print("Enter number of years till retirement : ");
                 years = inputDevice.nextInt();
              System.out.print("Enter amount you can save annually : ");
                  savings = inputDevice.nextInt();
                 while(years <= 0)
                    { --years;
                     System.out.print("Enter number of years till retirement : ");
                     years = inputDevice.nextInt();
                     System.out.print("Enter amount you can save annually : ");
                     savings = inputDevice.nextInt();
                   }
                 while(savings <= 0)
                   { --savings;
                      System.out.print("Enter number of years till retirement : ");
                      years = inputDevice.nextInt();
                      System.out.print("Enter amount you can save annually : ");
                      savings = inputDevice.nextInt();
                       }
                    details.setYears(years);
                    details.setSavings(savings);
                    return details;
            }
     public static void display(Retirement t)
            { System.out.println("Total amount saved : $" + t.getSavings());
                }
       }










