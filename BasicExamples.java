import java.util.*;

public class BasicExamples 
{
    public static void main(String args[])
    {
        //1. Product of a & b
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("Product = " + product);

        //2. Area of Circle
        Scanner sc1 = new Scanner(System.in);
        float pi = 3.14f;
        System.out.println("Enter the Radius of Circle : ");
        float rad = sc.nextFloat();
        float area = pi * rad * rad;
        System.out.println("Area of Circle = " + String.format("%.5f", area));
        sc.close();
        sc1.close();
    }
}
