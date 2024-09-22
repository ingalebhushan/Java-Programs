import java.util.*;

public class BinarytoDecimal
{
    public static void bintodec(int binNum)
    {
        int power = 0, decNum = 0;
        System.out.print("Decimal of " + binNum + " = ");
        while(binNum > 0)
        {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2, power));
            power++;
            binNum = binNum/10;
        }
        System.out.print(decNum);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Binary Number: ");
        int binNum = scan.nextInt();
        bintodec(binNum);
        scan.close();
    }
}