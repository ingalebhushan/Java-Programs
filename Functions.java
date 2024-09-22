import java.util.*;

public class Functions 
{
    //1.Function to calculate sum of 2 numbers entered from main func:
    public static int sum(int x, int y)
    {
        return (x + y);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print the values of a & b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = sum(a, b);
        System.out.println("Sum of a & b = " + result);
        scan.close();
    }

    //2.Function to swap 2 numbers (Call By Value):
    // public static void swap(int a, int b)
    // {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a = " + a);
    //     System.out.println("b = " + b);
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the values of a & b: ");
    //     int a = scan.nextInt();
    //     int b = scan.nextInt();
    //     swap(a, b);
    //     scan.close();
    // }

    //3. Function to calculate product of 2 numbers:
    // public static int product(int x, int y)
    // {
    //     int prod = x * y;
    //     return prod;
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter hte values of a & b: ");
    //     int a = scan.nextInt();
    //     int b = scan.nextInt();
    //     int result = product(a, b);
    //     System.out.println("Product of a & b = " + result);
    //     scan.close();
    // }

    //4. Function to find Factorial of a number:
    // public static int factorial(int num)
    // {
    //     int fact = 1;
    //     for(int i=1; i<=num; i++)
    //     {
    //         fact = fact*i;
    //     }
    //     return fact;
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int num = scan.nextInt();
    //     System.out.println("Factorial of " + num + " = " + factorial(num));
    //     scan.close();
    // }

    //5. Function to find Binomial Coefficient:
    // public static int binoCoeff(int num, int r)
    // {
    //     int numo = 1, deno1 = 1, deno2 = 1, result;
    //     for(int i=1; i<=num; i++){
    //         numo *= i;
    //     }
    //     for(int i=1; i<=r; i++){
    //         deno1 *= i;
    //     }
    //     for(int i=1; i<=(num-r); i++){
    //         deno2 *= i;
    //     }
    //     result = (numo/(deno1 * deno2));
    //     return result;
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter values of number and r: ");
    //     int num = scan.nextInt();
    //     int r = scan.nextInt();
    //     System.out.println("Binomail Coefficient = " + binoCoeff(num, r));
    //     scan.close();
    // }

    //6. Function to Print all Prime numbers in given Range:
    // public static void PrimeinRange(int num)
    // {
    //     for(int i=2; i<=num; i++){
    //         if(isPrime(i))
    //         {
    //             System.out.print(i + " ");
    //         }
    //     }
    //     System.out.println();
    // }
    // public static boolean isPrime(int val)
    // {
    //     if(val == 2){
    //         return true;
    //     }
    //     for(int j=2; j<val; j++){
    //         if(val%j==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the range: ");
    //     int num = scan.nextInt();
    //     System.out.println("Prime Numbers in given range are: ");
    //     PrimeinRange(num);
    //     scan.close();
    // }
}