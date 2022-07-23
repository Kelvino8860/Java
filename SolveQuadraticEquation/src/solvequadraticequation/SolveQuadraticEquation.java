/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solvequadraticequation;

import java.util.Scanner;

/**
 *
 * @author NJORO
 */
public class SolveQuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //creat two arrays one for storing user enterd values
      //the second one to store the roots
      double[] equation = new double[3];
      double[] roots = new double[2];
      //prompt user for values
      System.out.print("Enter three values a:b:c >> ");
      for(int i = 0; i < equation.length; i++)
      {
          equation[i] = input.nextDouble();
      }
     solveQuadratic(equation,roots);
     System.out.println("The number of real roots is/are >> " + solveQuadratic(equation,roots) );
     for(double e : roots)
     {
         System.out.println(e + " ");
     }
    }
    public static int solveQuadratic(double[] equation, double[] roots)
    {   int count = 0;
        double dicriminant = (Math.pow(equation[1],2)) - 4*(equation[0]*equation[2]);
        if(dicriminant > 0)
        {
            double r1 = (-equation[1] + Math.sqrt(dicriminant))/(2 * equation[0]);
            double r2 = (-equation[1] - Math.sqrt(dicriminant))/(2 * equation[0]);
            roots[0] = r1;
            roots[1] = r2;
         }
        if(dicriminant == 0)
        {
            double r3 = (-equation[1]/(2 * equation[0]));
            roots[0] = r3;
        }
        for(int j = 0; j < roots.length; j++)
        {
            if(roots[j] != 0)
            {
                count++;
            }
        }
        return count;
    }
    
}
