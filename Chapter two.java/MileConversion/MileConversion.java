public class MileConversion
{ public static void main(String[]  args)
  { final double inchesMile = 1.578e-5;
    final double feetMile= 0.000189;
    final double yardMile = 0.000568;
    int miles = 10;
    System.out.println("10 miles is equal to " + (miles/inchesMile) + " inches.");
    System.out.println("10 miles is equal to " + (miles/feetMile) + " feet.");
    System.out.println("10 miles is equal to " + (miles/yardMile) + " yards.");
   }
}