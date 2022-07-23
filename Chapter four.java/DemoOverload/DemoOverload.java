public class DemoOverload
{ public static void main(String[]  args)
   { int month = 6, day = 24, year = 2019;
     displayDate(month);
     displayDate(month, day);
     displayDate(month, day, year);
    }
  public static void displayDate(int mon)
     { System.out.println("Event date " + mon + "/1/2018");
            }
  public static void displayDate(int mon, int dd)
     { System.out.println("Event date " + mon + "/" + dd + "/2018");
            }
  public static void displayDate(int mon, int dd, int yrs)
     { System.out.println("Event date " + mon + "/" + dd + "/" + yrs);
          }

}