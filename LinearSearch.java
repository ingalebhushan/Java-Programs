public class LinearSearch
{
    public static int element(int arr[], int key)
    {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[])
    {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int key = 12;
        int index = element(numbers, key);
        if(index == -1){
            System.out.println("Element is not present in given array!!");
        }
        else{
            System.out.println("The element " + key + " is present at index " + index);
        }
    }
}