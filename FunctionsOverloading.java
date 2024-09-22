// import java.util.*;

public class FunctionsOverloading 
{
    //1. Function Overloading using Parameters (Different no. of para):
    //a.Calculating Sum of 2 numbers:
    // public static int sum(int a, int b)
    // {
    //     return a + b;
    // }
    //b.Calculating sum of 3 numbers:
    // public static int sum(int a, int b, int c)
    // {
    //     return a + b + c;
    // }
    //c.main method:
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the number of parameters: ");
    //     int num = scan.nextInt();
    //     if(num == 2){
    //         System.out.println("Enter the values of a & b: ");
    //         int a = scan.nextInt();
    //         int b = scan.nextInt();
    //         System.out.println("Sum = " + sum(a, b));
    //     }
    //     else if(num == 3){
    //         System.out.println("Enter the values of a, b & c: ");
    //         int a = scan.nextInt();
    //         int b = scan.nextInt();
    //         int c = scan.nextInt();
    //         System.out.println("Sum = " + sum(a, b, c));
    //     }
    //     scan.close();
    // }


    //2. Function Overloading using Data Types (Different data types of parameters):
    //a.Calculating Sum of 2 integers:
    public static float sum(float a, float b)
    {
        return a + b;
    }
    //b.Calculating Sum of 2 floating no:
    public static int sum(int a, int b)
    {
        return a + b;
    }
    //c.main method:
    public static void main(String args[])
    {
        System.out.println("Sum = " + sum(10, 22));
        System.out.println("Sum = " + sum(3.5f, 5.87f));
    }
}