import java.util.*;

public class Switch {
    public static void main(String args[]){
        //1. Simple switch-case-default Program:
        // int num = 20;
        // switch(num)
        // {
        //     case 1:
        //         System.out.println("Number belongs to case 1");
        //         break;
        //     case 5:
        //         System.out.println("Number belongs to case 5");
        //         break;
        //     case 20:
        //         System.out.println("Number belongs to case 20");
        //         break;
        //     case 2:
        //         System.out.println("Number belongs to case 2");
        //         break;
        //     default:
        //         System.out.println("Number doesn't belong to any!");
        // }

        //2. Make a Calculator:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int a = scan.nextInt();
        System.out.println("Enter the value of B: ");
        int b = scan.nextInt();
        System.out.println("Enter th Operator: ");
        char oper = scan.next().charAt(0);
        scan.close();

        switch(oper)
        {
            case '+':
                System.out.println("Addition = " + (a+b));
                break;
            case '-':
                System.out.println("Subtraction = " + (a-b));
                break;
            case '*':
                System.out.println("Multiplication = " + (a*b));
                break;
            case '/':
                System.out.println("Division = " + (a/b));
                break;
            case '%':
                System.out.println("Remainder = " + (a%b));
                break;
            default:
                System.out.println("Enter a valid operator!!");
        }
    }
}
