import java.util.*;

public class Loops 
{
    public static void main(String args[])
    {
        //1. while loop:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        scan.close();
        int revnum = 0, lastdigit;
        while(num > 0)
        {
            lastdigit = num%10;
            revnum = (revnum * 10) + lastdigit;
            num /= 10;
        }
        System.out.println("Reversed Number = " + revnum);

        //2. for loop:
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int num = scan.nextInt();
        // scan.close();
        // int sum = 0;
        // for(int i=1; i<=num; i++){
        //     sum += i;
        // }
        // System.out.println("Sum of 1st " + num + " natural numbers = " + sum);

        //3. do-while loop:
        // int num = -203;
        // do{
        //     System.out.println("The number is " + num + " positive");
        // }while(num > 0);

        //4. for-each loop:     Used for arrays.
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // for(String i : cars){
        //     System.out.println(i);
        // }

        //1. break statement:
        //a.
        // Scanner scan = new Scanner(System.in);
        // int num;
        // while(true){
        //     System.out.println("Enter the number: ");
        //     num = scan.nextInt();
        //     if(num%10 == 0)
        //         break;
        //     else
        //         System.out.println("Your number is " + num);
        // }
        // scan.close();

        //b. Prime Number:
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int num = scan.nextInt();
        // scan.close();
        // int i=2;
        // for(; i<num; i++){
        //     if(num%i == 0){
        //         System.out.println(num + " is a not prime number!");
        //         break;
        //     }
        // }
        // if(i == num){
        //     System.out.println(num + " is a prime number!");
        // }

        //2. continue statement:
        // Scanner scan = new Scanner(System.in);
        // int num;
        // do{
        //     System.out.println("Enter the number: ");
        //     num = scan.nextInt();
        //     if(num%10 == 0)
        //         continue;
        //     else
        //         System.out.println("Your number is " + num);
        // }while(true);
    }
}