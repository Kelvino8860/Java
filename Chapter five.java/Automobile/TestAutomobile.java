public class TestAutomobile
{  public static void main(String[]  args)
     {  Automobile object1 = new Automobile(8860, "Chevrolet", "Colorado", "Black", 2009, 30.2);
        Automobile object2 = new Automobile(10000, "Toyota", "GT 86", "White", 2020, 65);
        object1 = getData(object1);
        object2 = getData2(object2);
          display(object1);
          display(object2);
      }
public static Automobile getData(Automobile app)
    {  int idNum = 1349;
       String make = "Lexus";
       String model = "LX 570";
       String color = "White";
       int year = 2019;
       double milesPerGallon = 45.2;
       app.setIdNum(idNum);
       app.setMake(make);
       app.setModel(model);
       app.setColor(color);
       app.setYear(year);
       app.setMilesPerGallon(milesPerGallon);
         return app;
     }
public static Automobile getData2(Automobile apps)
    {  int idNum = -567;
       String make = "Tesla";
       String model = "x Plaid";
       String color = "Red";
       int year = 2004;
       double milesPerGallon = 45.2;
       apps.setIdNum(idNum);
       apps.setMake(make);
       apps.setModel(model);
       apps.setColor(color);
       apps.setYear(year);
       apps.setMilesPerGallon(milesPerGallon);
         return apps;
     }
public static void display(Automobile t)
    {  System.out.println("Automobile ID number : " + t.getIdNum() + "\nAutomobile make : " + t.getMake() +
            "\nAutomobile model : " + t.getModel() + "\nAutomobile color : " + t.getColor() + "\nAutomobile year : " +
                 t.getYear() + "\nAutomobile fuel consumption per mile : " + t.getMilesPerGallon() + " gallons." + "\n ");
       }
}




















