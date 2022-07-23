public class DogTriathlonParticipant3
{ private final int NUM_EVENTS;
  private static int totalCumulativeScore = 0;
  private String name;
  private int obidienceScore;
  private int conformationScore;
  private int agilityScore;
  private int total;
  private double avg;
  private boolean doScoresAgree;
  private int events;
public DogTriathlonParticipant3(String name, int numEvents,
                int score1, int score2, int score3)
      { this.name = name;
        NUM_EVENTS = numEvents;
      if(score1 > 0 && score2 > 0 && score3 > 0)
          events = 3;
      if(score1 == 0 || score2 == 0 || score3 == 0)
          events = 2;
      if((score1 == 0 && score2 == 0) || (score2 == 0 && score3 == 0) || (score1 == 0 && score3 == 0))
          events = 1;
     if(NUM_EVENTS == events)
         doScoresAgree = true;
     else
         doScoresAgree = false;
     if(doScoresAgree)
        {  obidienceScore = score1;
           conformationScore = score2;
           agilityScore = score3;
          }
      else
        {  obidienceScore = 0;
           conformationScore = 0;
           agilityScore = 0;
          }
          
      if(NUM_EVENTS == 0)
           avg = 0;
      else
        total = obidienceScore + conformationScore + agilityScore;
           avg = (double)total / NUM_EVENTS;
        totalCumulativeScore = totalCumulativeScore + total;
      }
public void display()
   { if(!doScoresAgree)
         System.out.println("\nNotice!! The number of events for " + 
                          name + " does not agree with scores reported.");
     System.out.println(name + " participated in " + NUM_EVENTS + 
        " events and has an average score of " + avg);
     System.out.println(" " + name + " has a total score of " + total +
        " bringing the cumulative score to " + totalCumulativeScore);
    }

}