import java.util.Scanner;
public class TestInfo
{  public static void main(String[]  args)
     {  Sandwich firstSandwich = new Sandwich();
        Sandwich secondSandwich = new Sandwich();
        firstSandwich = getData(firstSandwich);
        secondSandwich = getData(secondSandwich);
           }
public static Sandwich getData(Sandwich details)
      {   
         String mainIngredients;
         String breadType;
         double price;
     Scanner inputDevice = new Scanner(System.in);
     System.out.print("Enter main ingredient >> ");
     mainIngredients = inputDevice.nextLine();
     System.out.print("Enter bread type >> ");
     breadType = inputDevice.nextLine();
     System.out.print("Enter price >> ");
     price = inputDevice.nextDouble();
     details.setMainIngredient(mainIngredients);
     details.setBreadType(breadType);
     details.setPrice(price);
     return details;
       }
}