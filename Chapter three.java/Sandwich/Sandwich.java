public class Sandwich
{ private String mainIngredient;
  private String breadType;
  private double price;
public void setMainIngredient(String ingredient)
   { 
       mainIngredient = ingredient;
              }
public void setBreadType(String bread)
   {
      breadType = bread;
       }
public void setPrice(double sandPrice)
    {
       price = sandPrice;
         }
public String getMainIngredient()
    {
       return mainIngredient;
          }
public String getBreadType()
    {
       return breadType;
         }
public double getPrice()
    { 
       return price;
         }
}