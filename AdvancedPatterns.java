//1. Hollow Rectangle Pattern:
// public class AdvancedPatterns 
// {
//     public static void main(String args[])
//     {
//         for(int i=0; i<4; i++){
//             for(int j=0; j<5; j++){
//                 if((i==0 || i==3) || (j==0 || j==4)){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//2. Inverted and Rotated Half Pyramid:
// import java.util.*;
// public class AdvancedPatterns 
// {
//     public static void HalfPyramid(int row, int col){
//         for(int i=0; i<row; i++){
//             for(int j=0; j<col; j++){
//                 if(i + j < row-1){
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the rows and cols num: ");
//         int row = scan.nextInt();
//         int col = scan.nextInt();
//         if(row == col){
//             HalfPyramid(row, col);
//         }
//         scan.close();
// 	}
// }



//3. Inverted Half Pyramid with Numbers:
// import java.util.*;
// public class AdvancedPatterns
// {
//     public static void HalfPyramidWithNumbers(int dim){
//         for(int i=0; i<dim; i++){
//             for(int j=1; j<=dim; j++){
//                 if(i + j <= dim){
//                     System.out.print(j);
//                 }
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the dimension: ");
//         int dim = scan.nextInt();
//         HalfPyramidWithNumbers(dim);
//         scan.close();
//     }
// }



//4. Floyd's Triangle:
// import java.util.*;
// public class AdvancedPatterns
// {
//     public static void FloydTriangle(int dim){
//         int counter = 1;
//         for(int i=1; i<=dim; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(counter + " ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the dimension: ");
//         int dim = scan.nextInt();
//         FloydTriangle(dim);
//         scan.close();
//     }
// }



//5. 0-1 Triangle:
// import java.util.*;
// public class AdvancedPatterns
// {
//     public static void zero_one_triangle(int dim){
//         for(int i=1; i<=dim; i++){
//             for(int j=1; j<=i; j++){
//                 if((i + j) % 2 == 0){
//                     System.out.print("1 ");
//                 }
//                 else{
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the dimension: ");
//         int dim = scan.nextInt();
//         zero_one_triangle(dim);
//         scan.close();
//     }
// }



//6. Butterfly Pattern:
public class AdvancedPatterns
{
    public static void main(String args[]){

    }
}