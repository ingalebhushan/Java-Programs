import java.util.*;

public class Arrays2D
{
    //1. Creating an 2D Array:
    // public static void main(String args[])
    // {
    //     int arr[][] = new int[3][3];
    //     int num[][] = {{10, 20, 30}, {20, 30}};
    //     System.out.println("Element = " + num[1][1]);
    // }

    //2. Input, Output and Update:
    // public static void main(String args[])
    // {
    //     int matrix[][] = new int[3][3];
    //     //1. Input:
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the Array Elements: ");
    //     for(int i=0; i<(matrix.length); i++)
    //     {
    //         for(int j=0; j<(matrix[0].length); j++)
    //         {
    //             matrix[i][j] = scan.nextInt();
    //         }
    //     }
    //     scan.close();

    //     //2. Output:
    //     for(int i=0; i<(matrix.length); i++)
    //     {
    //         for(int j=0; j<(matrix[0].length); j++)
    //         {
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }

    //     //3. Update:
    //     matrix[1][1] = 10;
    //     System.out.println(matrix[1][1]);
    // }

    //3. Find the max and min elements from array:
    // public static void MinMax(int arr[][])
    // {
    //     int max = Integer.MIN_VALUE;
    //     int min = Integer.MAX_VALUE;
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         for(int j=0; j<arr[0].length; j++)
    //         {
    //             if(arr[i][j] > max){
    //                 max = arr[i][j];
    //             }
    //             if(arr[i][j] < min){
    //                 min = arr[i][j];
    //             }
    //         }
    //     }
    //     System.out.println("Smallest Element = " + min);
    //     System.out.println("Largest Element = " + max);
    // }
    // public static void main(String args[])
    // {
    //     int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //     MinMax(arr);
    // }

    //4. Spiral Matrix Problem:
    // public static void Spiral(int matrix[][])
    // {
    //     int startRow = 0, endRow = matrix.length - 1;
    //     int startCol = 0, endCol = matrix[0].length - 1;
    //     while((startRow <= endRow) && (startCol <= endCol))
    //     {
    //         //top:
    //         for(int j=startCol; j<=endCol; j++){
    //             System.out.print(matrix[startRow][j] + " ");
    //         }

    //         //right:
    //         for(int i=startRow+1; i<=endRow; i++){
    //             System.out.print(matrix[i][endCol] + " ");
    //         }

    //         //bottom:
    //         for(int j=endCol-1; j>=startCol; j--){
    //             if(startRow == endRow){
    //                 break;
    //             }
    //             System.out.print(matrix[endRow][j] + " ");
    //         }

    //         //left:
    //         for(int i=endRow-1; i>startRow; i--){
    //             if(startCol == endCol){
    //                 break;
    //             }
    //             System.out.print(matrix[i][startCol] + " ");
    //         }

    //         startRow++;
    //         endRow--;
    //         startCol++;
    //         endCol--;
    //     }
    //     System.out.println();
    // }
    // public static void main(String args[])
    // {
    //     int matrix[][] = {{1, 2, 3, 4},
    //                       {5, 6, 7, 8},
    //                       {9, 10, 11, 12},
    //                       {13, 14, 15, 16}};
    //     Spiral(matrix);
    // }

    //5. Diagonal Elements Sum:
    public static int DiagonalSum(int matrix[][])
    {
        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            //Left Diagonal Sum:
            sum = sum + matrix[i][i];

            //Right Diagonal Sum:
            if(i != matrix.length - 1 - i){
                sum = sum + matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and cols: ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        int matrix[][] = new int[row][col];
        if(row == col){
            System.out.println("Enter the array elements: ");
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    matrix[i][j] = scan.nextInt();
                }
            }
            System.out.println("Diagonal Sum = " + DiagonalSum(matrix));
        }
        else{
            System.out.println("Enter Square Matrix!!");
        }
        scan.close();
    }

    //6. Search in Sorted Matrix:
    // public static boolean StairCaseSearch(int matrix[][], int key)
    // {
    //     int row = 0, col = matrix[0].length-1;

    //     while(row < matrix.length && col >=0){
    //         if(matrix[row][col] == key){
    //             System.out.println("Found Key at (" + row + ", " + col + ")");
    //             return true;
    //         }
    //         else if(key < matrix[row][col]){
    //             col--;
    //         }
    //         else{
    //             row++;
    //         }
    //     }
    //     System.out.println("Key Not Found!!");
    //     return false;
    // }
    // public static void main(String args[])
    // {
    //     int matrix[][] = {{10, 20, 30, 40},
    //                       {15, 25, 35, 45},
    //                       {27, 29, 37, 48},
    //                       {32, 33, 39, 50}};
    //     int key = 33;
    //     StairCaseSearch(matrix, key);
    // }
}