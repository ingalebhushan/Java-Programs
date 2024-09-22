import java.util.*;

public class Arrays
{
    //1. Creating an Array:
    // public static void main(String args[])
    // {
    //     int marks[] = new int[40];
    //     int num[] = {1, 2, 3};
    //     String fruits[] = {"Apple", "Banana", "Mango", "Orange"};
    // }
    
    //2. Input, Output and Update:
    public static void main(String args[])
    {
        int marks[] = new int[40];
        //a. Input:
        Scanner scan = new Scanner(System.in);
        marks[0] = scan.nextInt();        
        marks[1] = scan.nextInt();
        marks[2] = scan.nextInt();
        scan.close();

        //b. Output:
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Mathematics : " + marks[2]);

        //c. Update:
        marks[2] = 100;
        System.out.println("Mathematics Updated Marks: " + marks[2]);
    }

    //3. Passing array as arguments (Call By Reference):
    // public static void update(int marks[])
    // {
    //     for(int i=0; i<marks.length; i++){
    //         marks[i] += 10;
    //     }
    // }
    // public static void main(String args[])
    // {
    //     int arr[] = {80, 99, 24, 44};
    //     update(arr);
        
    //     //Print marks:
    //     for(int i=0; i<arr.length; i++){
    //         System.out.println("Updated Marks = " + arr[i]);
    //     }
    // }

    //4. Find the largest & the smallest number in a given array:
    // public static int largestNum(int arr[])
    // {
    //     int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         if(arr[i] > largest){
    //             largest = arr[i];
    //         }
    //         if(smallest > arr[i]){
    //             smallest = arr[i];
    //         }
    //     }
    //     System.out.println("Smallest Number = " + smallest);
    //     return largest;
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     int arr[] = new int[6];
    //     System.out.println("Enter the array elements: ");
    //     for(int i=0; i<6; i++){
    //         arr[i] = scan.nextInt();
    //     }
    //     int result = largestNum(arr);
    //     System.out.println("Largest Number = " + result);
    //     scan.close();
    // }

    //5. Reverse an Array:
    // public static int reverse(int arr[])
    // {
    //     int length = arr.length;
    //     int reversed[] = new int[length];
    
    //     for (int i = 0; i < length; i++) {
    //         reversed[i] = arr[length - 1 - i];
    //     }
    //     return reversed;
    // }
    // public static void main(String args[])
    // {
    //     int arr[] = {2, 4, 6, 8, 10};
    //     int[] rev = reverse(arr);

    //     System.out.println("\nReversed Array:");
    //     printArray(rev);
    // }
    // public static void printArray(int[] arr)
    // {
    //     for(int i : arr){
    //         System.out.print(i + " ");
    //     }
    //     System.out.println();
    // }

    //5. Reverse an Array:
    // public static void reverse(int arr[])
    // {
    //     int start = 0, end = arr.length - 1;
    //     while(start < end)
    //     {
    //         int temp = arr[end];
    //         arr[end] = arr[start];
    //         arr[start] = temp;

    //         start++;
    //         end--;
    //     }
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the array size: ");
    //     int size = scan.nextInt();
    //     int arr[] = new int[size];
    //     System.out.println("Enter the array elements: ");
    //     for(int i=0; i<arr.length; i++){
    //         arr[i] = scan.nextInt();
    //     }
    //     reverse(arr);
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    //     scan.close();
    // }

    //6. Pairs in an Array:
    // public static void pairs(int arr[])
    // {
    //     for(int i=0; i<arr.length-1; i++)
    //     {
    //         for(int j=i+1; j<arr.length; j++)
    //         {
    //             System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[])
    // {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the array size: ");
    //     int size = scan.nextInt();
    //     int arr[] = new int[size];
    //     System.out.println("Enter the array elements: ");
    //     for(int i=0; i<arr.length; i++){
    //         arr[i] = scan.nextInt();
    //     }
    //     pairs(arr);
    //     scan.close();
    // }

    //7. Print Subarrays:
    // public static void PrintSubArrays(int arr[])
    // {
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         int start = i;
    //         for(int j=i; j<arr.length; j++)
    //         {
    //             int end = j;
    //             for(int k=start; k<=end; k++)
    //             {
    //                 System.out.print(arr[k] + " ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void main(String args[])
    // {
    //     int arr[] = {2, 4, 6, 8, 10};
    //     PrintSubArrays(arr);
    // }

    //8. Print Sum of all SubArrays and Max and Min Sum:
    // public static void PrintSubArrays(int arr[])
    // {
    //     int sum;
    //     int min = Integer.MAX_VALUE;
    //     int max = Integer.MIN_VALUE;

    //     for(int i=0; i<arr.length; i++)
    //     {
    //         int start = i;
    //         for(int j=i; j<arr.length; j++)
    //         {
    //             sum = 0;
    //             int end = j;
    //             for(int k=start; k<=end; k++)
    //             {
    //                 System.out.print(arr[k] + " ");
    //                 sum += arr[k];
    //             }
    //             System.out.println();
    //             System.out.println("Sum = " + sum);
    //             if(min > sum){
    //                 min = sum;
    //             }
    //             if(max < sum){
    //                 max = sum;
    //             }
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Max Sum = " + max);
    //     System.out.println("Min Sum = " + min);
    // }
    // public static void main(String args[])
    // {
    //     int arr[] = {2, 4, 6, 8, 10};
    //     PrintSubArrays(arr);
    // }

    //9. Max SubArray Sum using Prefix Array: (V.V.Imp!!)
    // public static void PrintSubArrays(int arr[])
    // {
    //     int sum;
    //     int max = Integer.MIN_VALUE;
    //     int prefix[] = new int[arr.length];

    //     prefix[0] = arr[0];
    //     //Calculate Prefix Array
    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + arr[i];
    //     }

    //     for(int i=0; i<arr.length; i++)
    //     {
    //         int start = i;
    //         for(int j=i; j<arr.length; j++)
    //         {
    //             sum = 0;
    //             int end = j;
    //             sum = (start==0 ? prefix[end] : prefix[end] - prefix[start-1]);

    //             if(max < sum){
    //                 max = sum;
    //             }
    //         }
    //     }
    //     System.out.println("Max Sum = " + max);
    // }
    // public static void main(String args[])
    // {
    //     int arr[] = {2, 4, 6, 8, 10};
    //     PrintSubArrays(arr);
    // }

    //10. Max SubArray Sum using Kadane's Algorithm: (V.V.Imp!!)
    // public static void SumSubArray(int arr[])
    // {
    //     int currentSum = 0;
    //     int max = Integer.MIN_VALUE;

    //     for(int i=0; i<arr.length; i++)
    //     {
    //         currentSum = currentSum + arr[i];
    //         if(currentSum < 0){
    //             currentSum = 0;
    //         }
    //         if(max < currentSum){
    //             max = currentSum;
    //         }
    //     }
    //     System.out.println("Maximum Subarray Sum = " + max);
    // }
    // public static void main(String args[])
    // {
    //     int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    //     SumSubArray(arr);
    // }

    //11. Trapping Rainwater Problem:
    // public static int trappedRainwater(int height[])
    // {
    //     int n = height.length;
    //     //calculate left max boundary - array
    //     int leftMax[] = new int[n];
    //     leftMax[0] = height[0];
    //     for(int i=1; i<n; i++){
    //         leftMax[i] = Math.max(height[i], leftMax[i-1]);
    //     }

    //     //calculate right max boundary - array
    //     int rightMax[] = new int[n];
    //     rightMax[n - 1] = height[n - 1];
    //     for(int i=n-2; i>=0; i--){
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //     }

    //     int trappedWater = 0;
    //     //loop
    //     for(int i=0; i<n; i++){
    //         //calculate waterlevel
    //         int waterlevel = Math.min(leftMax[i], rightMax[i]);
    //         //calculate trapped water
    //         trappedWater += (waterlevel - height[i]);
    //     }

    //     return trappedWater;
    // }
    // public static void main(String args[])
    // {
    //     int height[] = {4, 2, 0, 6, 3, 2, 5};
    //     System.out.println(trappedRainwater(height));
    // }

    //12. Buy and Sell Stocks:
    // public static int Stocks(int prices[])
    // {
    //     int buyPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for(int i=0; i<prices.length; i++)
    //     {
    //         if(buyPrice < prices[i])
    //         {
    //             int profit = prices[i] - buyPrice;  //Today's Profit
    //             maxProfit = Math.max(maxProfit, profit);
    //         }
    //         else{
    //             buyPrice = prices[i];
    //         }
    //     }

    //     return maxProfit;
    // }
    // public static void main(String args[])
    // {
    //     int prices[] = {7, 1, 5, 3, 6, 4};
    //     System.out.println(Stocks(prices));
    // }
}