import javax.swing.JOptionPane;
public class MadLib
{ public static void main(String[]  args)
  { String nounString1, nounString2, nounString3, nounString4,verbString1, 
           verbString2, verbString3, verbString4, adjectiveString1;
    nounString1 = JOptionPane.showInputDialog(null, "Fill in a noun", "Noun1", JOptionPane.INFORMATION_MESSAGE);
    nounString2 = JOptionPane.showInputDialog(null, "Fill in a noun", "Noun2", JOptionPane.INFORMATION_MESSAGE);
    nounString3 = JOptionPane.showInputDialog(null, "Fill in a noun", "Noun3", JOptionPane.INFORMATION_MESSAGE);
    verbString1 = JOptionPane.showInputDialog(null, "Fill in a verb", "Verb1", JOptionPane.INFORMATION_MESSAGE);
    verbString2 = JOptionPane.showInputDialog(null, "Fill in a verb", "Verb2", JOptionPane.INFORMATION_MESSAGE);
    verbString3 = JOptionPane.showInputDialog(null, "Fill in a verb", "Verb3", JOptionPane.INFORMATION_MESSAGE);
    adjectiveString1 = JOptionPane.showInputDialog(null, "Fill in an adjective.", "Adjective", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, nounString1 + " I say " + verbString1 + " here, " +
                                  verbString2 + " at my " + nounString2 + " it is " + adjectiveString1 + ", I say " +
                                   verbString3 + " my " + nounString3 + ", " + verbString3 + " my " + nounString3 + ".");
   }
}
                                   