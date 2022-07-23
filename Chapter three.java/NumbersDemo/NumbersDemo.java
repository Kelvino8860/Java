public class NumbersDemo
{  public static void main(String[]  args)
     {  int myVarOne = 2;
        int myVarTwo = 4;
        displayTwiceTheNumber(myVarOne, myVarTwo);
        displayNumberPlusFive(myVarOne, myVarTwo);
        displayNumberSquared(myVarOne, myVarTwo);
       }
    public static void displayTwiceTheNumber(int myVarOne, int myVarTwo)
       { final int MUL_TWO = 2;
         int twiceOne;
         int twiceTwo;
         twiceOne = myVarOne * MUL_TWO;
         twiceTwo = myVarTwo * MUL_TWO;
         System.out.println("The values " + myVarOne + " and " + myVarTwo + " when multiplied by " + MUL_TWO + " are " +
                               twiceOne + " and " + twiceTwo + " respectively.");
          }
    public static void displayNumberPlusFive(int myVarOne, int myVarTwo)
       {   final int ADD_FIVE = 5;
           int addOne;
           int addTwo;
           addOne = myVarOne + ADD_FIVE;
           addTwo = myVarTwo + ADD_FIVE;
           System.out.println("The values " + myVarOne + " and " + myVarTwo + " when added to " + ADD_FIVE + " are " +
                               addOne + " and " + addTwo + " respectively.");
                 }
   public static void displayNumberSquared(int myVarOne, int myVarTwo)
       {  int squareOne;
          int squareTwo;
          squareOne = myVarOne * myVarOne;
          squareTwo = myVarTwo * myVarTwo ;
          System.out.println("The values " + myVarOne + " and " + myVarTwo + " when squared are " +
                               squareOne + " and " + squareTwo + " respectively.");
            }  
}