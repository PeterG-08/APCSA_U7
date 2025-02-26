package L7;

import java.util.Arrays;

public class SortTester
{
    public static void main(String[] args)
    {
        int[] arr1 = {-5, -20, 0, -4, 3, 13, 6, 12, 14, 40, 19, 54, 77, 89, 100, 86};
        int[] arr2 = arr1.clone();

        /* --- SELECTION SORT --- */
        // note the selectionSort method modifies the original array (rather than returning a new array that is sorted)
        Sort.selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        /* --- INSERTION SORT --- */
        // note the insertionSort method modifies the original array (rather than returning a new array that is sorted)
        Sort.insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
