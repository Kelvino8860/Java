/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrayfinancialapplicationtax;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class MultiDimensionalArrayFinancialApplicationTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creat a twodimensional array to store the tax bracket
        int[][] taxBracket = {{8350,33950,82250,171550,372950},
                              {16700,67900,137050,208850,372950},
                              {8350,33950,68525,104425,186475},
                              {11950,45500,117450,190200,372950}};
        double[] rates = {0.10,0.15,0.25,0.28,0.33,0.35};
        
        userInfo(taxBracket,rates);
    }
    
    public static void userInfo(int[][] bracket, double[] rate)
    {
        Scanner input = new Scanner(System.in);
        //prompt user for status
        System.out.print("0-single filer, 1-married jointly or " + 
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filling status: ");
        int status = input.nextInt();
        
        //prompt user for taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        
        calculateTax(bracket,rate,status,income);
    }
    
    public static void calculateTax(int[][] bracket, double[] rate, int status, double income)
    {
        int fillingStatus = status;
        if(status == fillingStatus)
        {  
            double tax = 0;
            if(income <= bracket[fillingStatus][0] && income >= 0)
            {
                tax = income * rate[0];
                System.out.println("Tax is " + tax);
            }
            if(income < 0)
            {
                System.out.println("Enter a positive amount");
            }
            //find tax bracket
            int limit = 0;   
            int index = 0;
            
            for(int col = 0; col < bracket[fillingStatus].length; col++)
            {
                if(income <= bracket[fillingStatus][col])
                {
                    //when you reach the tax bracket break the loop
                    limit = bracket[fillingStatus][col];
                    index = col;
                    break;
                }
            }
            //if the tax bracket limit index for the income is 1
            //perform the operation bellow
           if(index == 1)
           {
               tax += (bracket[fillingStatus][0] * rate[0]) + (income - bracket[fillingStatus][0]) * rate[1];
               System.out.println("Tax is " + tax);
           }
           //else if the index is greater than one, loop thourgh the array with
           //index as the limit (indicating the tax bracket excluding the final tax bracket) performing the operations
           //finally after the loop perfome the final operations that is icome minus limit multiplied by rate
           //finally add to the tax the tax from 0 to the first taxable limit
           if(index > 1)
           {
               for(int i = 0; i < index - 1; i++)
               {
                   tax += (bracket[fillingStatus][i + 1] - bracket[fillingStatus][i]) * rate[i + 1];
               }
               tax += (income - bracket[fillingStatus][index - 1]) * rate[index];
               tax += bracket[fillingStatus][0] * rate[0];
               System.out.println("Tax is " + tax);
           }
           //if the income is greater than all the tax brackets
           //calculate all the tax in each bracket using a loop except the first tax bracket
           //finaly after the loop subtract the last tax bracket from income and get the tax
           //dont forget to calculate tax for the first bracket and add
               if(income > bracket[fillingStatus][4])
               {
                   for(int i = 0; i < bracket[fillingStatus].length - 1; i++)
                   {
                       tax += (bracket[fillingStatus][i + 1] - bracket[fillingStatus][i]) * rate[i + 1];
                   }
                   tax += (income - bracket[fillingStatus][4]) * rate[5] + (bracket[fillingStatus][0] * rate[0]);
                   
                   System.out.println("Tax is " + tax);
               }
        }
    }
    
}
