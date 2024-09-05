// Def and use case
// ---> Dynamic size, can grow or shrink as needed.
// ---> Slower due to dynamic resizing and additional functionalities, but more flexible.
// ---> Part of the Java Collections Framework, provides various utility methods like add(), remove(), contains(), indexOf(), and more.
// ---> Can only be used for objects, not primitives (use Integer instead of int).

// -----------------------------------------------------------------------------------------------------
// THEORIE
// -----------------------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {

        // Declaration
        ArrayList<Integer> numbers = new ArrayList<>(); // Declaration
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie")); // Initialization with
                                                                                             // values

        // Manipulation
        numbers.add(20);

        int firstNumber = numbers.get(0); // Access
        numbers.set(1, 30); // Modify
        int firstNumber2 = numbers.get(0); // Access
        numbers.set(1, 30); // Modify
        numbers.remove(0); // Remove element at index 0
        numbers.remove(Integer.valueOf(20)); // Remove first occurrence of 20

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (int number : numbers) {// Enhanced for-loop
            System.out.println(number);
        }
    }
}
