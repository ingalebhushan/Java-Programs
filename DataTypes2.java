import java.util.*;

public class DataTypes2 
{
    public static void main(String args[])
    {
        //1.Type Conversion or Widening or Implicit Conversion.
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();    //Important...
        System.out.println(number);
        sc.close();

        //2.Type Promotion in Expressions.
        //a.
        char a = 'a';
        char b = 'b';
        System.out.println((int)b);
        System.out.println((int)a);
        System.out.println(b - a);
        System.out.println(a);
        //b.
        int w = 10;
        float x = 20.25f;
        long y = 25;
        double z = 30;
        double ans = w + x + y + z;
        System.out.println("Answer = " + ans);
        //Another Example (V.Imp!!)
        byte m = 5;
        m = (byte)(m * 2);
        System.out.println(m);
        
        //3.Type Casting or Narrowing Conversion or Explicit Conversion.
        int marks = (int)99.5f;
        System.out.println("Marks = " + marks);
        float i = 25.12f;
        int j = (int) i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
