import javax.swing.JOptionPane;
public class RandomGuess2
{  public static void main(String[]   args)
    { String guessString, randomString;
      int guess;
      int random = (1 + (int)(Math.random() * 10));
      guessString = JOptionPane.showInputDialog(null, "Guess a number from 1 to 10", "RANDOM GUESSING FUN", JOptionPane.QUESTION_MESSAGE);
         guess = Integer.parseInt(guessString);
        if(guess == random)
             JOptionPane.showMessageDialog(null, "CORRECT", "RANDOM GUESSING FUN", JOptionPane.INFORMATION_MESSAGE);
        else
         if(guess > random)
            JOptionPane.showMessageDialog(null, "TOO HIGH", "RANDOM GUESSING FUN", JOptionPane.INFORMATION_MESSAGE);
        else
          if(guess < random)
             JOptionPane.showMessageDialog(null, "TOO LOW", "RANDOM GUESSING FUN", JOptionPane.INFORMATION_MESSAGE); 
    JOptionPane.showMessageDialog(null, "The number is" + random, "RANDOM GUESSING FUN", JOptionPane.INFORMATION_MESSAGE);
   }
}
        
   