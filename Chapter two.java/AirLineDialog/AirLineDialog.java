import javax.swing.JOptionPane;
public class AirLineDialog
{  public static void main(String[]  args)
    { int Selection;
      boolean isYes;
      Selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?");
      isYes = (Selection == JOptionPane.YES_OPTION);
      JOptionPane.showMessageDialog(null, "You responded "  +  isYes);
    }
} 