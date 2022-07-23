import java.util.Scanner;
public class AcmePay
{  public static void main(String[]   args)
    {  int hoursWorked;
       int shiftType;
       int electRetire;
       final int RETIRE_CODE = 1;
       final int SHIFT1_CODE = 1;
       final int SHIFT2_CODE = 2;
       final int SHIFT3_CODE = 3;
       String shift1 = "First Shift";
       String shift2 = "Second Shift";
       String shift3 = "Third Shift";
       final double PAY_RATE1 = 17;
       final double PAY_RATE2 = 18.50;
       final double PAY_RATE3 = 22;
       final double OVER_RATE1 = PAY_RATE1 / 1.5;
       final double OVER_RATE2 = PAY_RATE2 / 1.5;
       final double OVER_RATE3 = PAY_RATE3 / 1.5;
       final int HOURS_WORKED = 40;
       final double RETIRE_PLAN = 0.03;
       double regularPay, overTimePay, totalPay, netPay, retirementDeductions, grossPay;
       double deductions;
      Scanner inputDevice = new Scanner(System.in);
      System.out.print("Enter hours you have worked >> ");
      hoursWorked = inputDevice.nextInt();
      System.out.print("Which shift do you belong to?");
      System.out.print("\nEnter 1 = shift1, 2=shift2 & 3=shift3 >> ");
      shiftType = inputDevice.nextInt();
      if(hoursWorked <= HOURS_WORKED && shiftType == SHIFT1_CODE)
          {  regularPay = HOURS_WORKED * PAY_RATE1;
             overTimePay = 0;
             totalPay = regularPay + overTimePay;
             netPay = totalPay;
             System.out.println("HOURS WORKED : " + hoursWorked + " hours" + "\nSHIFT TYPE : " + shift1 + "\nHOURLY PAY RATE : $" + PAY_RATE1 + 
                             "\nREGULAR PAY : $" + regularPay + "\nOVERTIME PAY : $" + overTimePay + "\nTOTAL PAY : $" + totalPay +
                             "\nNET PAY : $" + netPay);
           }
      else
         if(hoursWorked > HOURS_WORKED && shiftType == SHIFT1_CODE)
           { regularPay = HOURS_WORKED * PAY_RATE1;
             overTimePay = (hoursWorked - HOURS_WORKED) * OVER_RATE1;
             totalPay = regularPay + overTimePay;
             netPay = totalPay;
             System.out.println("HOURS WORKED : " + hoursWorked + " hours" + "\nSHIFT TYPE : " + shift1 + "\nHOURLY PAY RATE : $" + PAY_RATE1 + 
                             "\nREGULAR PAY : $" + regularPay + "\nOVERTIME PAY : $" + overTimePay + "\nTOTAL PAY : $" + totalPay +
                             "\nNET PAY : $" + netPay);
          }  
      if(shiftType == SHIFT2_CODE || shiftType == SHIFT3_CODE)
          { System.out.print("Select 1 if you want a retirement plan >> ");
            electRetire = inputDevice.nextInt();
            
         if(hoursWorked <= HOURS_WORKED && shiftType == SHIFT2_CODE)
         {     regularPay = HOURS_WORKED * PAY_RATE2;
             overTimePay = 0;
            grossPay = regularPay + overTimePay;
             deductions = RETIRE_PLAN * grossPay;
            if(electRetire == RETIRE_CODE)
                retirementDeductions = deductions;
            else
              retirementDeductions = 0;
             netPay = grossPay - retirementDeductions;           
             System.out.println("HOURS WORKED : " + hoursWorked + " hours" + "\nSHIFT TYPE : " + shift2 + "\nHOURLY PAY RATE : $" + PAY_RATE2 + 
                             "\nREGULAR PAY : $" + regularPay + "\nOVERTIME PAY : $" + overTimePay + "\nTOTAL PAY : $" + grossPay +
                            "\nRETIREMENT DEDUCTIONS : $" + retirementDeductions + "\nNET PAY : $" + netPay);
                  }  
     else
       if(hoursWorked > HOURS_WORKED && shiftType == SHIFT2_CODE)
        {     regularPay = HOURS_WORKED * PAY_RATE2;
             overTimePay = (hoursWorked - HOURS_WORKED) * OVER_RATE2;
            grossPay = regularPay + overTimePay;
             deductions = RETIRE_PLAN * grossPay;
            if(electRetire == RETIRE_CODE)
                retirementDeductions = deductions;
            else
              retirementDeductions = 0;
             netPay = grossPay - retirementDeductions;           
             System.out.println("HOURS WORKED : " + hoursWorked + " hours" + "\nSHIFT TYPE : " + shift2 + "\nHOURLY PAY RATE : $" + PAY_RATE2 + 
                             "\nREGULAR PAY : $" + regularPay + "\nOVERTIME PAY : $" + overTimePay + "\nTOTAL PAY : $" + grossPay +
                            "\nRETIREMENT DEDUCTIONS : $" + retirementDeductions + "\nNET PAY : $" + netPay);
                 }
       else
       if(hoursWorked <= HOURS_WORKED && shiftType == SHIFT3_CODE)
           {   regularPay = HOURS_WORKED * PAY_RATE3;
             overTimePay = 0;
            grossPay = regularPay + overTimePay;
             deductions = RETIRE_PLAN * grossPay;
            if(electRetire == RETIRE_CODE)
                retirementDeductions = deductions;
            else
              retirementDeductions = 0;
             netPay = grossPay - retirementDeductions;           
             System.out.println("HOURS WORKED : " + hoursWorked + " hours" + "\nSHIFT TYPE : " + shift3 + "\nHOURLY PAY RATE : $" + PAY_RATE3 + 
                             "\nREGULAR PAY : $" + regularPay + "\nOVERTIME PAY : $" + overTimePay + "\nTOTAL PAY : $" + grossPay +
                            "\nRETIREMENT DEDUCTIONS : $" + retirementDeductions + "\nNET PAY : $" + netPay);
             }
       else
         if(hoursWorked > HOURS_WORKED && shiftType == SHIFT3_CODE)
         {  regularPay = HOURS_WORKED * PAY_RATE3;
             overTimePay = (hoursWorked - HOURS_WORKED) * OVER_RATE3;
            grossPay = regularPay + overTimePay;
             deductions = RETIRE_PLAN * grossPay;
            if(electRetire == RETIRE_CODE)
                retirementDeductions = deductions;
            else
              retirementDeductions = 0;
             netPay = grossPay - retirementDeductions;           
             System.out.println("HOURS WORKED : " + hoursWorked + " hours" + "\nSHIFT TYPE : " + shift3 + "\nHOURLY PAY RATE : $" + PAY_RATE3 + 
                             "\nREGULAR PAY : $" + regularPay + "\nOVERTIME PAY : $" + overTimePay + "\nTOTAL PAY : $" + grossPay +
                            "\nRETIREMENT DEDUCTIONS : $" + retirementDeductions + "\nNET PAY : $" + netPay);
          }
                }
   }          
}  



























