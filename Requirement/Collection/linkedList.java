import java.util.LinkedList;

// -----------------------------------------------------------------------------------------------------
// THEORIE
// -----------------------------------------------------------------------------------------------------

public class linkedList {
    public static void main(String[] args) {
        // Declaration: Creating a new LinkedList
        LinkedList<String> names = new LinkedList<>();

        // Manipulation: Adding elements to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Accessing elements by index
        System.out.println("Element at index 1: " + names.get(1)); // Output: Element at index 1: Bob

        // Adding elements at specific positions
        names.add(1, "David");

        // Removing elements by index
        names.remove(2); // Remove the element at index 2 (Bob)

        // Iterating over the LinkedList
        System.out.println("All Names:");
        for (String name : names) {
            System.out.println(name);
        }
        /* Output:
           All Names:
           Alice
           David
           Charlie
         */

        // Checking if the LinkedList is empty
        boolean isEmpty = names.isEmpty();
        System.out.println("Is the list empty? " + isEmpty); // Output: Is the list empty? false

        // Getting the size of the LinkedList
        int size = names.size();
        System.out.println("Size of the list: " + size); // Output: Size of the list: 3

        // Clearing the LinkedList
        names.clear();
        System.out.println("Size after clearing: " + names.size()); // Output: Size after clearing: 0
    }
}


// -----------------------------------------------------------------------------------------------------
// EXERCICE 2  Reversing a LinkedList
// -----------------------------------------------------------------------------------------------------

// public class Main2 {
//     public static void main(String[] args) {
//         // Create a LinkedList
//         LinkedList<Integer> numbers = new LinkedList<>();
//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);

//         // Print the original LinkedList
//         System.out.println("Original LinkedList: " + numbers);

//         // Reverse the LinkedList
//         reverseLinkedList(numbers);

//         // Print the reversed LinkedList
//         System.out.println("Reversed LinkedList: " + numbers);
//     }

//     // Method to reverse a LinkedList
//     private static void reverseLinkedList(LinkedList<Integer> list) {
//         // Create a temporary LinkedList to store the reversed elements
//         LinkedList<Integer> reversed = new LinkedList<>();

//         // Traverse the original LinkedList in reverse order and add elements to the temporary LinkedList
//         for (int i = list.size() - 1; i >= 0; i--) {
//             reversed.add(list.get(i));
//         }

//         // Clear the original LinkedList
//         list.clear();

//         // Add the reversed elements back to the original LinkedList
//         list.addAll(reversed);
//     }
// }


// -----------------------------------------------------------------------------------------------------
// EXERCICE 2 detectAndRemoveLoop
// -----------------------------------------------------------------------------------------------------

// public class Main {
//     public static void main(String[] args) {
//         // Create a LinkedList with a loop
//         LinkedList<Integer> listWithLoop = createLinkedListWithLoop();

//         // Print the original LinkedList
//         System.out.println("Original LinkedList with loop: " + listWithLoop);

//         // Detect and remove the loop
//         LinkedList<Integer> modifiedList = detectAndRemoveLoop(listWithLoop);

//         // Print the modified LinkedList
//         System.out.println("Modified LinkedList after loop removal: " + modifiedList);
//     }

//     // Method to create a LinkedList with a loop (for demonstration purposes)
//     private static LinkedList<Integer> createLinkedListWithLoop() {
//         LinkedList<Integer> list = new LinkedList<>();
//         for (int i = 1; i <= 5; i++) {
//             list.add(i);
//         }
//         // Create a loop by connecting the last element to the second element
//         list.getLast().next = list.get(1);
//         return list;
//     }

//     // Method to detect and remove a loop in a LinkedList
//     private static LinkedList<Integer> detectAndRemoveLoop(LinkedList<Integer> list) {
//         // Use Floyd's Cycle Detection Algorithm (slow and fast pointers)
//         LinkedList.Node<Integer> slow = list.getFirst();
//         LinkedList.Node<Integer> fast = list.getFirst();

//         // Move slow pointer by one step and fast pointer by two steps
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             // If slow and fast pointers meet, there is a loop
//             if (slow == fast) {
//                 // Remove the loop by finding the start of the loop
//                 slow = list.getFirst();
//                 while (slow.next != fast.next) {
//                     slow = slow.next;
//                     fast = fast.next;
//                 }
//                 // Set the next of the last node to null to break the loop
//                 fast.next = null;
//                 break;
//             }
//         }
//         return list;
//     }
// }
