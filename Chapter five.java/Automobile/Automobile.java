public class Automobile
{  private int idNum;
   private String make;
   private String model;
   private String color;
   private int year;
   private double milesPerGallon;
public Automobile(int id, String makes, String models, String colors, int years, double milesGallon)
   {   if(id > 0 && id <= 9999)
           this.idNum = id;
       else
        if(id < 0 || id > 9999)
         this.idNum = 0;
       make = makes;
       model = models;
       color = colors;
       if(years >= 2005 && years <= 2019)
           this.year = years;
        else
       if(years < 2005 || years > 2019)
          this.year = 0;
       if(milesGallon >= 10 && milesGallon <= 60)
           this.milesPerGallon = milesGallon;
        else
       if(milesGallon < 10 || milesGallon > 60)
          this.milesPerGallon = 0;
      System.out.println("Automobile ID number : " + idNum + "\nAutomobile make : " + make +
            "\nAutomobile model : " + model + "\nAutomobile color : " + color + "\nAutomobile year : " +
                 year + "\nAutomobile fuel consumption per mile : " + milesPerGallon + " gallons." + "\n ");
     }
public void setIdNum(int id)
   { if(id > 0 && id <= 9999)
         idNum = id;
     else
          idNum = 0;
    }
public void setMake(String make)
   {  this.make = make;
      }
public void setModel(String model)
  {  this.model = model;
      }
public void setColor(String color)
  {  this.color = color;
     }
public void setYear(int years)
  {  if(years >= 2005 && years <= 2019)
          year = years;
     else
        year = 0;
      }
public void setMilesPerGallon(double milesInGallon)
  {  if(milesInGallon >= 10 && milesInGallon <= 60)
         milesPerGallon = milesInGallon;
      else
         milesPerGallon = 0;
   }
public int getIdNum()
  {  return idNum;
      }
public String getMake()
  { return make;
      }
public String getModel()
  {  return model;
     }
public String getColor()
   {  return color;
       }
public int getYear()
   {  return year;
     }
public double getMilesPerGallon()
  { return milesPerGallon;
     }
}