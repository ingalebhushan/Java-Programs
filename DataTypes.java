public class DataTypes
{
    public static void main(String args[])
    {
        byte b = 9;
        System.out.println(b);

        char ch = 'A';
        System.out.println(ch);

        boolean val = true;
        System.out.println(val);
        val = false;
        System.out.println(val);

        double price = 10.5;     //double is used for bigger decimal no.
        System.out.println(price);  

        //By default the java compiler sets any decimal number to a double value. 
        //So to tell the compiler, that the value provided is a float, we use 'f' after that number.
        //For eg. 3.44f, 4.0f, etc.
        float cgpa = 9.7f;  //float is used for lower dec no.
        System.out.println(cgpa);

        int num = 22;       //long is used for bigger int no.
        System.out.println(num);

        short n = 230;      //It is used for short/lower int no.
        System.out.println(n);

        int x = 5;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum = " + sum);
    }
}