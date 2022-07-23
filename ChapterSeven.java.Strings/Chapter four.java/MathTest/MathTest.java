public class MathTest
{ public static void main(String[]  args)
     {  System.out.println("The squre root of 37 is >> " + Math.sqrt(37));
        System.out.println("The sine of 300 is >> " + Math.sin(300) + " and cosine is >> " + Math.cos(300));
        System.out.println("The floor value of 22.8 is >> " + Math.floor(22.8) + " and its celing value is >> " + Math.ceil(22.8));
        System.out.println("The round value of 22.8 is >> " + Math.round(22.8));
        int number = 'D';
        System.out.println("The larger value of character 'D' and integer 71 " + Math.max(number, 71));
        System.out.println("The smaller value of character 'D' and integer 71 " + Math.min(number, 71));
        System.out.println("A random number between 0 and 20 is >> " + (int)(Math.random() * 20 + 1));
     }
        
}