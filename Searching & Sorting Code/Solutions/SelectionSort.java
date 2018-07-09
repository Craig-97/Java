import java.util.Arrays;

public class SelectionSort
{
 
    public static int[] selectionSort(int[] arr)
    {
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;

            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
     
    public static void main(String[] args)
    {
         
        int[] unsorted = {10,34,2,56,7,67,88,42};
        System.out.println("Unsorted Array "+Arrays.toString(unsorted));

        int[] sorted = selectionSort(unsorted);
        System.out.println("Sorted Array "+Arrays.toString(sorted));
    }
}
