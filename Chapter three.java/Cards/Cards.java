public class Cards
{ private String suits;
  private int values;
  private String rep; 
public void setSuits(String suit)
   {  suits = suit;
        }
public void setValues(int value)
   {   if(value >= 1 && value <= 13)
       values = value;
       else
         if(value < 1 || value > 13)
           values = 1;
      if(value == 1)
         rep = "Ace";
    else
      if(value >= 2 && value <= 10)
          { if(value == 2)
               rep = "2";
            else
             if(value == 3)
               rep = "3";
            else
              if(value == 4)
                 rep = "4";
            else
              if(value == 5)
                rep = "5";
            else
              if(value == 6)
                rep = "6";
            else
              if(value == 7)
                rep = "7";
            else
             if(value == 8)
               rep = "8";
            else
             if(value == 9)
               rep = "9";
            else
              if(value == 10)
                 rep = "10";
             }
    else
      if(value == 11)
         rep = "Jack";
    else
      if(value == 12)
         rep = "Queen";
    else
      if(value == 13)
         rep = "King";
      }
public String getSuits()
    {   return suits;
        }
public int getValues()
   { return values;
        }
public String getRep()
   {  return rep;
         }
}