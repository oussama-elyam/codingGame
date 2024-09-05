//hashMap
import java.util.HashMap;

//-----------------------------------------------------------------------------------------------------
//THEORIE
//-----------------------------------------------------------------------------------------------------

public class map {
    public static void main(String[] args) {
        // Declaration: Creating a new HashMap
        HashMap<String, Integer> scores = new HashMap<>();

        // Manipulation: Adding key-value pairs
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);

        // Accessing values by key
        int bobScore = scores.get("Bob");
        System.out.println("Bob's Score: " + bobScore); // Output: Bob's Score: 87

        // Updating a value
        scores.put("Charlie", 96); // Charlie's score updated to 96

        // Checking if a key exists
        boolean hasAlice = scores.containsKey("Alice");
        System.out.println("Has Alice? " + hasAlice); // Output: Has Alice? true

        // Removing a key-value pair
        scores.remove("Bob");

        // Iterating over key-value pairs
        System.out.println("All Scores:");
        for (String name : scores.keySet()) {
            int score = scores.get(name);
            System.out.println(name + ": " + score);
        }
        /* Output:
           All Scores:
           Alice: 95
           Charlie: 96
         */

        // Checking if the map is empty
        boolean isEmpty = scores.isEmpty();
        System.out.println("Is the map empty? " + isEmpty); // Output: Is the map empty? false

        // Clearing the map
        scores.clear();
        System.out.println("Size after clearing: " + scores.size()); // Output: Size after clearing: 0
    }
}

//-----------------------------------------------------------------------------------------------------
//Exercise: Word Frequency Counter
//-----------------------------------------------------------------------------------------------------



// public class exerice {
//     public static void main(String[] args) {
//         String text = "Java is a programming language. Java is widely used in software development.";

//         // Count word frequencies
//         HashMap<String, Integer> wordFreqMap = countWordFrequencies(text);

//         // Print word frequencies
//         System.out.println("Word Frequencies:");
//         for (String word : wordFreqMap.keySet()) {
//             System.out.println(word + ": " + wordFreqMap.get(word));
//         }
//     }

//     // Method to count word frequencies in a string
//     private static HashMap<String, Integer> countWordFrequencies(String text) {
//         HashMap<String, Integer> wordFreqMap = new HashMap<>();
//         String[] words = text.split("\\s+"); // Split text into words

//         // Iterate over words and count frequencies
//         for (String word : words) {
//             word = word.toLowerCase(); // Convert word to lowercase for case-insensitive comparison
//             wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
//         }
//         return wordFreqMap;
//     }
// }
