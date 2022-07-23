import java.time.*;
public class FitnessTracker
{  private String fitnessActivity;
   private int numMinutes;
   private LocalDate date;
   public FitnessTracker()
     {  fitnessActivity = "running";
        numMinutes = 0;
        date = LocalDate.of(2022, 1, 1);
        System.out.println("Activity carried out >> " + fitnessActivity +
                         "\nNumber of minutes taken >> " + numMinutes +
                         "\nDate the activity was done >> " + date);
        }
  public FitnessTracker(String activity, int num, LocalDate date)
    {  this.fitnessActivity = activity;
       this.numMinutes = num;
       this.date = date;
       System.out.println("Activity carried out >> " + fitnessActivity +
                         "\nNumber of minutes taken >> " + numMinutes +
                         "\nDate the activity was done >> " + date);
            }
}