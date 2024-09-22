import java.util.*;

public class BitManipulation
{
    //1. Bit Wise Operators:
    // public static void main(String args[])
    // {
    //     //a. Binary AND(&):
    //     System.out.println("Binary AND = " + (5 & 6));

    //     //b. Binary OR(|):
    //     System.out.println("Binary OR = " + (5 | 6));

    //     //c. Binary XOR(^):
    //     System.out.println("Binary XOR = " + (5 ^ 6));

    //     //d. Binary One's Compliment(~):
    //     System.out.println("Binary 1's Comp = " + (~5));

    //     //e. Binary Left Shift(<<):
    //     System.out.println("Binary Left Shift = " + (5<<2));

    //     //f. Binary Right Shift(>>):
    //     System.out.println("Binary Right Shift = " + (5>>2));
    // }

    //2. Check if a number is Odd or Even:
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        if((num & 1) == 0){
            System.out.println("Even!");
        }
        else{
            System.out.println("Odd!");
        }
        scan.close();
    }

    //3. Get ith Bit:
    // public static void main(String args[])
    // {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int num = scan.nextInt();
        // System.out.println("Enter the ith bit value: ");
        // int i = scan.nextInt();
        // if((num & 1<<i) == 0){
        //     System.out.println("Bit at index " + i + " = 0");
        // }
        // else{
        //     System.out.println("Bit at index " + i + " = 1");
        // }
        // scan.close();
    // }

    //4. Set ith Bit:
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int num = scan.nextInt();
    //     System.out.println("Enter the ith bit value: ");
    //     int i = scan.nextInt();
    //     System.out.println(num | 1<<i);
    //     scan.close();
    // }

    //5. Clear ith Bit:
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int num = scan.nextInt();
    //     System.out.println("Enter the ith bit value: ");
    //     int i = scan.nextInt();
    //     System.out.println(num & ~(1<<i));
    //     scan.close();
    // }

    //6. Update ith Bit:
    //1st Approach:
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int num = scan.nextInt();
    //     System.out.println("Enter the ith bit : ");
    //     int i = scan.nextInt();
    //     System.out.println("Enter your value (0 or 1): ");
    //     int val = scan.nextInt();
    //     if(val == 0){
    //         System.out.println(num & ~(1<<i));
    //     }
    //     else if(val == 1){
    //         System.out.println(num | 1<<i);
    //     }
    //     scan.close();
    // }

    //2nd Approach:
    // public static int clearithBit(int num, int i)
    // {
    //     int bitMask = ~(1<<i);
    //     return num & bitMask;
    // }
    // public static int updateithBit(int num, int i, int newBit)
    // {
    //     num = clearithBit(num, i);
    //     int BitMask = newBit<<i;
    //     return num | BitMask;
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int num = scan.nextInt();
    //     System.out.println("Enter the ith bit : ");
    //     int i = scan.nextInt();
    //     System.out.println("Enter your new bit (0 or 1): ");
    //     int newBit = scan.nextInt();
    //     System.out.println(updateithBit(num, i, newBit));
    //     scan.close();
    // }

    //7. Clear Last i bits:
    // public static void main(String args[])
    // {
    //     int num = 15;
    //     int Bits = 2;
    //     int bitMask = (~0)<<Bits;
    //     System.out.println(num & bitMask);
    // }

    //8. Clear Range of bits:
    // public static int clearBitsinRange(int num, int i, int j)
    // {
    //     int a = ((~0)<<(j+1));
    //     int b = (1<<i)-1;
    //     int bitMask = a | b;
    //     return num & bitMask;
    // }
    // public static void main(String args[])
    // {
    //     System.out.println(clearBitsinRange(10, 2, 4));
    // }

    //9. Check if a number is a power of 2 or not:
    // public static boolean isPowerof2(int num)
    // {
    //     return (num & (num-1)) == 0;
    // }
    // public static void main(String[] args)
    // {
    //     System.out.println(isPowerof2(15));
    // }

    //10. Count set bits in a number:
    // public static int CountSetBits(int num)
    // {
    //     int count = 0;
    //     while(num > 0){
    //         if((num & 1) != 0){
    //             count++;
    //         }
    //         num = num>>1;
    //     }
    //     return count;
    // }
    // public static void main(String args[])
    // {
    //     System.out.println(CountSetBits(10));
    // }

    //11. Fast Exponentiation:
    // public static int fastExpo(int a, int n)
    // {
    //     int ans = 1;

    //     while(n>0){
    //         if((n & 1) != 0){
    //             ans = ans * a;
    //         }
    //         a = a * a;
    //         n = n>>1;
    //     }

    //     return ans;
    // }
    // public static void main(String args[])
    // {
    //     System.out.println(fastExpo(5, 3));
    // }
}
