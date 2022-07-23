import java.time.*;
public class Couple
{  private Person bride;
   private Person groom;
   public Couple(Person bride, Person groom)
    {  this.bride = bride;
       this.groom = groom;
         }
 public Person getBride()
    {  return bride;
        }
 public Person getGroom()
    {   return groom;
         }
}