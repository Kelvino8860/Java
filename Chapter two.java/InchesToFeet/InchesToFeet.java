public class InchesToFeet
{public static void main(String[]  args)
   { int inches = 86;
     final double feetInches = 0.0833;
     int numberOfFeet = (int) (inches*feetInches);
     double remainingInches = inches%feetInches;
     System.out.println(inches + " inches become " + numberOfFeet + " feet and " +
                         remainingInches + " inches.");
   }
}