public class BinarySearch
{
    public static int element(int arr[], int key)
    {
        int start = 0, end = arr.length - 1, mid;

        while(start <= end){
            mid = (start + end)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int index = element(arr, key);
        if(index == -1){
            System.out.println("The element is not present!");
        }
        else{
            System.out.println("The element " + key + " at index " + index);
        }
    }
}