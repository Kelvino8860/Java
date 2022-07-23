import javax.swing.JOptionPane;
public class ElectionStatistics
{public static void main(String[]  args)
  { String partyOne, partyTwo, partyThree, votesoneString, votestwoString, votesthreeString;
    double votesOne;
    double votesTwo;
    double votesThree;
    double averageVote;
    double percentageVoteOne;
    double percentageVoteTwo;
    double percentageVoteThree;
    partyOne = JOptionPane.showInputDialog(null, "Enter name of political party.", 
                                            "Party 1", JOptionPane.INFORMATION_MESSAGE);
    votesoneString = JOptionPane.showInputDialog(null, "Enter votes of political party.", 
                                            "Party 1", JOptionPane.INFORMATION_MESSAGE);
    votesOne = Double.parseDouble(votesoneString);
    partyTwo = JOptionPane.showInputDialog(null, "Enter name of political party.",
                                             "Party 2", JOptionPane.INFORMATION_MESSAGE);
    votestwoString = JOptionPane.showInputDialog(null, "Enter votes of political party.", 
                                            "Party 2", JOptionPane.INFORMATION_MESSAGE);
    votesTwo = Double.parseDouble(votestwoString);
    partyThree = JOptionPane.showInputDialog(null, "Enter name of political party.",
                                             "Party 3", JOptionPane.INFORMATION_MESSAGE);
    votesthreeString = JOptionPane.showInputDialog(null, "Enter votes of political party.", 
                                            "Party 3", JOptionPane.INFORMATION_MESSAGE);
    votesThree = Double.parseDouble(votesthreeString);
    averageVote = votesOne + votesTwo + votesThree;
    percentageVoteOne = (votesOne/averageVote)*100;
    percentageVoteTwo = (votesTwo/averageVote)*100;
    percentageVoteThree = (votesThree/averageVote)*100;
    System.out.println(partyOne + " had a total of " + votesOne + " votes and a total percentage of " +
                        percentageVoteOne + "%.");
    System.out.println(partyTwo + " had a total of " + votesTwo + " votes and a total percentage of " +
                        percentageVoteTwo + "%.");
    System.out.println(partyThree + " had a total of " + votesThree + " votes and a total percentage of " +
                        percentageVoteThree + "%.");
    }
}
    


    
   