//1. Bubble Sort:
// Basic Idea - Large elements come to the end of array by swapping with the adjacent elements.
// Time Complexity = O(n^2) (Worst Case)
// Time Complexity = O(n) (Best Case)
// Space Complexity = O(1) (Constant, as no extra space was needed)

// public class Sorting
// {
//     public static void BubbleSort(int arr[])
//     {
//         int n = arr.length;
//         for(int i=0; i<(n-1); i++)
//         {
//             int swaps = 0;
//             for(int j=0; j<(n-1-i); j++)
//             {
//                 int temp;
//                 if(arr[j] > arr[j+1])
//                 {
//                     temp = arr[j+1];
//                     arr[j+1] = arr[j];
//                     arr[j] = temp;
//                     swaps++;
//                 }
//             }
//             if(swaps == 0){
//                 System.out.println("Array is already Sorted!");
//                 break;
//             }
//         }
//         for(int i=0; i<n; i++)
//         {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String args[])
//     {
//         int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//         BubbleSort(arr);
//     }
// }



//2. Selection Sort:
// Basic Idea - Pick the smallest element from unsorted array, put it at the beginning of the array.
// Time Complexity = O(n^2) (Worst Case)
// Time Complexity = O(n^2) (Best Case)
// Time Complexity = O(n^2) (Avg Case)
// Space Complexity = O(1) (No extra space is needed)

// public class Sorting
// {
//     public static void SelectionSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             int minPos = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos = j;
//                 }
//             }
//             //Swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
            
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {5, 4, 1, 3, 2};
//         SelectionSort(arr);
//     }
// }



//3. Insertion Sort:
// Basic Idea - Pick an element(from unsorted part) & place it in the right position in sorted part of the array.
// Time Complexity = O(n^2) (Worst Case)
// Time Complexity = O(n) (Best Case)
// Time Complexity = O(n^2) (Avg Case)
// Space Complexity = O(1) (No extra space is needed)

// public class Sorting
// {
//     public static void InsertionSort(int arr[]){
//         for(int i=1; i<arr.length; i++){
//             for(int j=i-1; j>=0; j--){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     //Another Method:
//     // public static void InsertionSort(int arr[]){
//     //     for(int i=1; i<arr.length; i++){
//     //         int curr = arr[i];
//     //         int prev = i-1;
//     //         //finding out the correct position to insert
//     //         while(prev>=0 && arr[prev] > curr){
//     //             arr[prev+1] = arr[prev];
//     //             prev--;
//     //         }
//     //         //insertion
//     //         arr[prev+1] = curr;
//     //     }
//     //     //print the array
//     //     for(int i=0; i<arr.length; i++){
//     //         System.out.print(arr[i] + " ");
//     //     }
//     // }
//     public static void main(String[] args) {
//         int arr[] = {5, 4, 1, 3, 2};
//         InsertionSort(arr);
//     }
// }



//4. Inbuilt Sort Functions:
// For using inbuilt sort functions, we use, "import java.util.Arrays;"
// import java.util.Arrays;
// import java.util.Collections;

// public class Sorting
// {
//     public static void printArray(Integer arr[])
//     {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args)
//     {
//         //1. Arrays.sort(arr);
//         //Time Complexity = O(nlogn)
//         // int arr[] = {10, 9, 5, 22, 14, 2, 1, 0};
//         // Arrays.sort(arr);
//         // printArray(arr);

//         //2. Arrays.sort(arr, startIndex, endIndex);
//         // Here, the endIndex is not included in the sorting.
//         //Time Complexity = O()
//         // int arr[] = {5, 4, 3, 1, 2};
//         // Arrays.sort(arr, 0, 3); //Will sort from index 0 to 2
//         // printArray(arr);

//         //3. Arrays.sort(arr, Collections.reverseOrder())
//         //Time Complexity = O()
//         // reverseOrder() works on the objects and not on the variables.
//         // So, we must use it for Non-Primitive data types.
//         // Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         // Arrays.sort(arr, Collections.reverseOrder());
//         // printArray(arr);

//         //4. Arrays.sort(arr, startIndex, endIndex, Collections.reverseOrder())
//         //Time Complexity = O()
//         // reverseOrder() works on the objects and not on the variables.
//         // So, we must use it for Non-Primitive data types.
//         Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         Arrays.sort(arr, 2, 5, Collections.reverseOrder()); //Will sort from index 2 to 4 in descending order only
//         printArray(arr);
//     }
// }



//5. Counting Sort:
// Use count sort where thee range is small.
// Time Complexity = O(n + range)

public class Sorting
{
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArray(arr);
    }
}