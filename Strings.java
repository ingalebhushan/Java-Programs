import java.util.*;

public class Strings
{
    //1. Creating an String:
    // public static void main(String args[])
    // {
    //     char arr[] = {'a', 'b', 'c', 'd'};      //Character Array
    //     String str1 = "abcd";
    //     String str2 = new String("xyz@1234#");
    // }

    //2. Taking String as Input: (Only one word as Input)
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     String name;
    //     name = scan.next();     //Will ignore the characters after space/enter.
    //     System.out.println("Name = " + name);
    //     scan.close();
    // }

    //3. Taking String as Input: (Full Sentence)
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     String fullName;
    //     fullName = scan.nextLine();     //Will take whole sentence.
    //     System.out.println("Full Name = " + fullName);
    //     scan.close();
    // }

    //4. Find String Length:
    // "StringName.length()" function gives string length.
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     String str = scan.nextLine();
    //     System.out.println("String = " + str);
    //     System.out.println(str.length());   
    //     scan.close();
    // }

    //5. String Concatenation:
    // public static void main(String args[])
    // {
    //     String firstName = "Bhushan";
    //     String lastName = "Ingale";
    //     String fullName = firstName + " " + lastName;
    //     System.out.println(fullName);
    // }

    //6. "StringName.charAt(index)" function:
    // It is used to get character present at a specific index.
    // public static void main(String args[])
    // {
    //     String name = "Bhushan";
    //     System.out.println(name.charAt(0));
    //     System.out.println(name.charAt(1));
    //     System.out.println(name.charAt(2));
    //     System.out.println(name.charAt(3));
    // }

    //7. Write a function to print all characters of a given string:
    // public static void Print(String str)
    // {
    //     for(int i=0; i<str.length(); i++){
    //         System.out.println("Character at index " + i + " = " + str.charAt(i));
    //     }
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the string: ");
    //     String str = scan.nextLine();
    //     Print(str);
    //     scan.close();
    // }

    //8. Check if a String is a Palindrome:
    // public static void CheckPalindrome(String str)
    // {
    //     int start = 0, end = str.length()-1;
    //     while(start<=end)
    //     {
    //         if(str.charAt(start) != str.charAt(end)){
    //             System.out.println("Not a Palindrome!");
    //             return;
    //         }
    //         start++;
    //         end--;
    //     }
    //     System.out.println(str + " is Palindrome!");
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the string: ");
    //     String str = scan.nextLine();
    //     CheckPalindrome(str);
    //     scan.close();
    // }

    //9. Find shortest path to reach destination:
    // public static float ShortestPath(String path)
    // {
    //     int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
    //     int x, y;
    //     float disp;
    //     for(int i=0; i<path.length(); i++)
    //     {
    //         char dir = path.charAt(i);
    //         if(dir == 'N'){
    //             y2++;
    //         }
    //         else if(dir == 'S'){
    //             y2--;
    //         }
    //         else if(dir == 'E'){
    //             x2++;
    //         }
    //         else{
    //             x2--;
    //         }
    //     }
    //     x = (x2-x1)*(x2-x1);
    //     y = (y2-y1)*(y2-y1);
    //     disp = (float)Math.sqrt(x + y);
    //     return disp;
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the Path : ");
    //     String path = scan.nextLine();
    //     System.out.println("Shorest Path = " + ShortestPath(path));
    //     scan.close();
    // }

    //8. SubString in Java:
    // "stringName.substring(beginIndex, endIndex)" function is used to print the sub string.
    // public static void main(String args[])
    // {
    //     String str = "Hello World";
    //     String substr = str.substring(0, 7);
    //     System.out.println(substr);
    // }

    //9. Print the Largest String: (Lexicographic)
    // Using ".compareTo" & ".compareToIgnoreCase"
    // public static void main(String args[])
    // {
    //     String fruits[] = {"apple", "Mango", "mango", "Banana"};
    //     String largest = fruits[0];

    //     for(int i=0; i<fruits.length; i++){
    //         if(largest.compareTo(fruits[i]) < 0){
    //             largest = fruits[i];
    //         }
    //     }

    //     System.out.println(largest);
    // }

    //10. StringBuilder:
    // It is used when you want to make numerous changes into a single string again and again.
    // So, in this case, to make any changes in the string, you will not have to copy the previous strings again and again.
    // public static void main(String args[])
    // {
    //     StringBuilder sb = new StringBuilder("");
    //     for(char ch='a'; ch<='z'; ch++){
    //         sb.append(ch);
    //     }
    //     System.out.println(sb);
    // }

    //11. For a given String convert first letter of each word to uppercase:
    // Using Character.toUpperCase()
    // public static String UpperCase(String str)
    // {
    //     StringBuilder sb = new StringBuilder("");

    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);

    //     for(int i=1; i<str.length(); i++)
    //     {
    //         if(str.charAt(i) == ' ' && i<str.length()-1)
    //         {
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         }
    //         else{
    //             sb.append(str.charAt(i));
    //         }
    //     }
    //     return sb.toString();
    // }
    // public static void main(String args[])
    // {
    //     String str = "hi, i am bhus";
    //     System.out.println(UpperCase(str));
    // }

    //12. String Compression:
    // T.C = O(n), where n -> length of string
    public static String compress(String str)
    {
        String newStr = "";

        for(int i=0; i<str.length(); i++)
        {
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = scan.nextLine();
        System.out.println(compress(str));
        scan.close();
    }
}