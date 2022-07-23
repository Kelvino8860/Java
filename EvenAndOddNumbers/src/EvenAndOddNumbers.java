 import java.util.Scanner;
public class EvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myVal = new int[10];
        int i, countEven = 0, countOdd = 0;
        System.out.print("Enter integers >> ");
        for(i = 0; i < myVal.length; ++i)
        {
            myVal[i] = input.nextInt();
            if(myVal[i] == 0)
               break;
        }
        for(i = 0; i < myVal.length; ++i)
        {
            if(myVal[i]%2 == 0 && myVal[i] != 0)
            {
                ++countEven;
            }
            else
             if(myVal[i]%2 != 0)
             {
                 ++countOdd;
             }
        }
        System.out.println("The number of even numbers is : " + countEven);
        System.out.println("The number of odd numbers is : " + countOdd);
    }
    
}
