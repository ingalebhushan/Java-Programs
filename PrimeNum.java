import java.util.*;

public class PrimeNum 
{
    //1. 1st Approach:
    // // only for num>=2
    // public static boolean isPrime(int num)
    // {
    //     //corner cases
    //     //2
    //     if(num == 2){
    //         return true;
    //     }
    //     for(int i=2; i<num; i++){
    //         if(num%i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }    
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int num = scan.nextInt();
    //     System.out.println(isPrime(num));
    //     scan.close();
    // }

    //2. 2nd Approach:
    public static boolean isPrime(int num)
    {
        //corner cases
        //2
        if(num == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        System.out.println(isPrime(num));
        scan.close();
    }
}