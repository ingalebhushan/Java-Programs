// import java.util.*;

public class BasicPatterns
{
    public static void main(String args[])
    {
        //1st Example: Star-Pattern
        for(int i=1; i<10; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Example: Star-Pattern
        // for(int i=1; i<=4; i++){
        //     for(int j=4; j>=i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //3rd Example: Half-Pyramid Pattern:
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //4th Example: Character Pattern:
        // char ch = 'A';
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
    }
}
