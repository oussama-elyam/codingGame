import java.util.*;
import java.util.stream.*;

public class streams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "", "banana", "cherry", "");
        
        //The collect method is used to gather the elements of a Stream into a collection or another form of result container.
        List<String> list = words.stream()
                                 .collect(Collectors.toList());
        System.out.println(list); // Output: [apple, banana, cherry]

        //Filter
        List<String> nonEmptyWords = words.stream()
                                          .filter(s -> !s.isEmpty())
                                          .collect(Collectors.toList());
        System.out.println(nonEmptyWords); // Output: [apple, banana, cherry]

        //Map
        List<String> uppercasedWords = words.stream()
                                             .map(String::toUpperCase)
                                             .collect(Collectors.toList());
        System.out.println(uppercasedWords); // Output: [APPLE, BANANA, CHERRY]

        //Sort
        List<String> sortedWords = words.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        
        System.out.println(sortedWords); // Output: [apple, banana, cherry]

        //forEach
        words.stream().forEach(System.out::println);

        //distinct 
        List<String> wordss = Arrays.asList("apple", "banana", "apple", "cherry", "banana");        
        List<String> distinctWordss = wordss.stream()
                                          .distinct()
                                          .collect(Collectors.toList());
        
        System.out.println(distinctWordss); // Output: [apple, banana, cherry]

        //limit
        //skip
        //reduce
        //flatMap

    }
}