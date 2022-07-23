import java.util.Scanner;
public class BabyNameComparison {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String name1 = null, name2 = null, name3 = null;
		String[] names ={name1, name2, name3};
		
		System.out.println("Please enter the names:");
		
		for(int x=0; x<=2;x++)
			names[x]= input.nextLine();
		
			System.out.println(names[0] + " " + names[1]);
			System.out.println(names[1] + " " + names[2]);
			System.out.println(names[0] + " " + names[2]);
	}
}