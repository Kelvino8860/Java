import javax.swing.JOptionPane;
public class HobbyDialog
{ public static void main(String[]  args)
   { int Hobby;
     boolean isYap;
     Hobby = JOptionPane.showConfirmDialog(null, 
                "Do you have a hobby?", "Select an option", JOptionPane.YES_OPTION,
                 JOptionPane.QUESTION_MESSAGE);
     isYap = (Hobby == JOptionPane.YES_OPTION);
     JOptionPane.showMessageDialog(null, "You responded " + isYap);
    }
}
     