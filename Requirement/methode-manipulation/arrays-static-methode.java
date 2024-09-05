//java.util.Arrays class contains various static methods for manipulating arrays (such as sorting and searching).
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 4, 3};
        
        // Sort
        Arrays.sort(numbers);        
        System.out.println("Sorted array: " + Arrays.toString(numbers));// Output: Sorted array: [2, 3, 4, 5, 8]

        // Search for a value
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("Index of 4: " + index);// Output: Index of 4: 2

        // Fill the array with a specific value
        int[] numbers = new int[5];
        Arrays.fill(numbers, 7);
        System.out.println("Filled array: " + Arrays.toString(numbers));// Output: Filled array: [7, 7, 7, 7, 7]

        // Check if two arrays are equal
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {3, 2, 1};
        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("array1 and array2 are equal: " + isEqual);// Output: array1 and array2 are equal: true

        //copying
        int[] numbers = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(numbers, numbers.length);        
        System.out.println("Copied array: " + Arrays.toString(copy));// Output: Copied array: [1, 2, 3, 4, 5]
        
        // Copy a range of the array
        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);        
        System.out.println("Range copied array: " + Arrays.toString(rangeCopy));// Output: Range copied array: [2, 3, 4]

        //converting array to list
        String[] array = {"apple", "banana", "cherry"};

        // Convert array to list
        List<String> list = Arrays.asList(array);
        System.out.println("List: " + list);// Output: List: [apple, banana, cherry]
        
        // Modify an element in the list
        list.set(1, "blueberry");
        System.out.println("Modified list: " + list);// Output: Modified list: [apple, blueberry, cherry]
        
        // Note: The underlying array is also modified
        System.out.println("Modified array: " + Arrays.toString(array));// Output: Modified array: [apple, blueberry, cherry]
    }
}
