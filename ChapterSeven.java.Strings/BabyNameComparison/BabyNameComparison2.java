import javax.swing.JOptionPane;
public class BabyNameComparison2
{   public static void main(String[]   args)
      {  String name;
         String firstName = "";
         String secondName = "";
         String thirdName = "";
         String restNames = "";
         int spaces = 0;
         int spaces2 = 0;
       name = JOptionPane.showInputDialog(null, "Enter three first names.");
           for(int i = 0; i < name.length(); ++i)
                { spaces = name.indexOf(' ');
                  firstName = name.substring(0, spaces);
                  restNames = name.substring(spaces + 1, name.length());
                 }
           for(int x = 0; x < restNames.length(); ++x)
             {  spaces2 = restNames.indexOf(' ');
                secondName = restNames.substring(0, spaces2);
                thirdName = restNames.substring(spaces2 + 1, restNames.length());
               }
           JOptionPane.showMessageDialog(null, firstName + " " + secondName + "\n" + thirdName + " " + firstName +
                                               "\n" + secondName + " " + thirdName);
       }
}