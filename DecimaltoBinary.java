import java.util.*;

public class DecimaltoBinary 
{
    public static void dectobin(int decNum)
    {
        int power = 0, binNum = 0;
        System.out.print("Binary of " + decNum + " = ");
        while(decNum > 0){
            int remain = decNum % 2;
            binNum = binNum + (remain * (int)Math.pow(10, power));
            power++;
            decNum /= 2;
        }
        System.out.print(binNum);
    }  
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int decNum = scan.nextInt();
        dectobin(decNum);
        scan.close();
    }
}