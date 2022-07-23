import javax.swing.JOptionPane;
import java.time.*;
public class TimedResponse
{ public static void main(String[]  args)
    {  LocalDateTime time1, time2;
       int second1, second2, difference;
       time1 = LocalDateTime.now();
       second1 = time1.getSecond();
       JOptionPane.showConfirmDialog
        (null, "Is stealing justified? ");
       time2 = LocalDateTime.now();
       second2 = time2.getSecond();
       difference = second2 - second1;
       JOptionPane.showMessageDialog(null, "End seconds: " + second2 +
                         "\nStart seconds: " + second1 +
                      "\nIt took " + difference + " seconds for you to answer."); 
      }

}