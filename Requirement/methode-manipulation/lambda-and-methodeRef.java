
//lambda functions & methode refrence
//////Lambda Expressions: Allow for the creation of anonymous functions in a more readable and concise manner than anonymous classes.
//////Method References: Provide a more readable and concise way to refer to methods directly.

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        
        // Before lambda expressions
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // After lambda expressions
        list.forEach(fruit -> System.out.println(fruit));

        // Using method references
        list.forEach(System.out::println);
    }
}


public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        
        // Before lambda expressions
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        // After lambda expressions
        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());


        
        System.out.println(list); // Output: [apple, orange, banana]
    }
}


public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

        // Using an anonymous class
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return StringUtils.compareByLength(s1, s2);
            }
        });

        // Using a method reference
        Collections.sort(list, StringUtils::compareByLength);

        System.out.println(list); // Output: [date, apple, banana, cherry]
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        
        // Using lambda expressions
        List<String> uppercasedWords = words.stream()
                                             .map(s -> s.toUpperCase())
                                             .collect(Collectors.toList());
        // Using method references
        List<String> uppercasedWords = words.stream()
                                             .map(String::toUpperCase)
                                             .collect(Collectors.toList());
        
        
        System.out.println(uppercasedWords); // Output: [APPLE, BANANA, CHERRY]
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        
        // Using lambda expressions
        List<Person> people = names.stream()
                                   .map(name -> new Person(name))
                                   .collect(Collectors.toList());
        
        // Using method references
        List<Person> people = names.stream()
                                   .map(Person::new)
                                   .collect(Collectors.toList());
                                   
        people.forEach(System.out::println);
    }
}
//-----------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------

//streams
=> before vs after

//-----------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------------------------

//summary 
    //-Boilerplate est un code passe-partout, ou simplement le code passe-partout, sont des sections de code qui sont répétées à plusieurs endroits avec peu ou pas de variation.