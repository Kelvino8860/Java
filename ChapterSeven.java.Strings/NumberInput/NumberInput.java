import javax.swing.*;
public class NumberInput
{  public static void main(String[]   args)
      {  String stringNum;
         int num;
         int arithmetic;
         final int FACTOR = 10;
           stringNum = JOptionPane.showInputDialog(null, "Enter a number");
             num = Integer.parseInt(stringNum);
             arithmetic = FACTOR * num;
         JOptionPane.showMessageDialog(null, stringNum + " * " + FACTOR + " = " + arithmetic);
       }
}