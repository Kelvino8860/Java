import java.time.*;
public class FitnessTracker2 extends FitnessTracker
{  private String fitnessActivity;
   private int numMinutes;
   private LocalDate date;
   public FitnessTracker2()
     {  super("Cycling", 60, LocalDate.of(2022, 4, 29));
        fitnessActivity = "running";
        numMinutes = 0;
        date = LocalDate.of(2022, 1, 1);
        System.out.println("Activity carried out >> " + fitnessActivity +
                         "\nNumber of minutes taken >> " + numMinutes +
                         "\nDate the activity was done >> " + date);
      
          }
}