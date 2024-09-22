import java.util.*;

public class Conditional1 {
    public static void main(String args[]){
        //1. if-else Statement:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int A = scan.nextInt();
        scan.close();
        if(A % 2 == 0)
            System.out.println(A + " is even!");
        else
            System.out.println(A + " is odd!");

        //2. if-else if-else Statement:
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter your Annual Income: ");
        // int income = scan.nextInt();
        // int tax;
        // scan.close();
        // if(income < 500000){
        //     tax = 0;
        // }
        // else if(income>=500000 && income<1000000){
        //     tax = (int) (income * 0.2);
        // }
        // else{
        //     tax = (int) (income * 0.3);
        // }
        // System.out.println("Tax = " + tax);

        //3. Ternary Operator:
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter your marks: ");
        // int marks = scan.nextInt();
        // scan.close();
        // String result;
        // result = ((marks>=33) ? "Pass!" : "Fail!");
        // System.out.println("You are " + result);
    }
}