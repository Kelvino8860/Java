import javax.swing.JOptionPane;
public class CellPhoneService
{   public static void main(String[]  args)
      { String talkTimeString, numTextString, numDataString;
        int talkTime, numText, numData;
        final int PLAN_A = 49;
        final int PLAN_B = 55;
        final int PLAN_C = 61;
        final int PLAN_D = 70;
        final int PLAN_E = 79;
        final int PLAN_F = 87;
    talkTimeString = JOptionPane.showInputDialog(null, "Enter maximum monthly value for talk minutes used.",
                           "HORIZON PHONES", JOptionPane.INFORMATION_MESSAGE);
    talkTime = Integer.parseInt(talkTimeString);

    numTextString = JOptionPane.showInputDialog(null, "Enter maximum monthly value for text messages sent.",
                           "HORIZON PHONES", JOptionPane.INFORMATION_MESSAGE);
    numText = Integer.parseInt(numTextString);
   
    numDataString = JOptionPane.showInputDialog(null, "Enter maximum monthly value for gigabytes of data used.",
                           "HORIZON PHONES", JOptionPane.INFORMATION_MESSAGE);
    numData = Integer.parseInt(numDataString);

          if(talkTime < 500 && numText == 0 && numData == 0)
              JOptionPane.showMessageDialog(null, "Dear customer, subscribe to our monthly plan of : $" + PLAN_A, "HORIZON PHONES",
                                              JOptionPane.INFORMATION_MESSAGE);
          else
           if(talkTime < 500 && numText >= 0 && numData == 0)
               JOptionPane.showMessageDialog(null, "Dear customer, subscribe to our monthly plan of : $" + PLAN_B, "HORIZON PHONES",
                                                JOptionPane.INFORMATION_MESSAGE);
          else
           if(talkTime >= 500 && numText <= 100 && numData == 0)
             JOptionPane.showMessageDialog(null, "Dear customer, subscribe to our monthly plan of : $" + PLAN_C, "HORIZON PHONES",
                                                JOptionPane.INFORMATION_MESSAGE);  
          else
            if(talkTime >= 500 && numText >= 100 & numData == 0)
              JOptionPane.showMessageDialog(null, "Dear customer, subscribe to our monthly plan of : $" + PLAN_D, "HORIZON PHONES",
                                                JOptionPane.INFORMATION_MESSAGE);
          else
            if(talkTime == 0 && numText == 0 && numData <= 3)
                JOptionPane.showMessageDialog(null, "Dear customer, subscribe to our monthly plan of : $" + PLAN_E, "HORIZON PHONES",
                                                JOptionPane.INFORMATION_MESSAGE);
          else
            if(talkTime == 0 && numText == 0 && numData >= 3)
                JOptionPane.showMessageDialog(null, "Dear customer, subscribe to our monthly plan of : $" + PLAN_F, "HORIZON PHONES",
                                                JOptionPane.INFORMATION_MESSAGE);
          }
}