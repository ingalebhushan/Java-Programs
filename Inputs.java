import java.util.*;

public class Inputs
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();   //Used to take single word input.
        // System.out.println(input);

        // String name = sc.nextLine();    //Used to take sentence/paragraph as input.
        // System.out.println(name);

        int num = sc.nextInt();     //Used to take integers.
        System.out.println(num);

        float price = sc.nextFloat();   //Used to input floats.
        System.out.println(price);

        double interest = sc.nextDouble();  //Used to input double.
        System.out.println(interest);

        boolean val = sc.nextBoolean();   //Used to input bools.
        System.out.println(val);

        byte x = sc.nextByte();   //Used to input byte values.
        System.out.println(x);

        System.out.println("Enter the values of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the values of b: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of a & b = " + sum);
        System.out.println("Sum = " + (a + b));

        sc.close();    //Used to close the scanner which has been opened.
    }
}