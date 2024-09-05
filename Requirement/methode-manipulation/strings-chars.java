//string manipulation

String str1 = "Hello, World!";
String str2 = new String("Hello, World!");
String str3 = "Java programming";
String helloWorld = str1.concat(", ").concat(str2).concat("!");

int length = helloWorld.length(); // 13

char firstChar = helloWorld.charAt(0); // 'H'

String sub = helloWorld.substring(7, 12); // "World"

int index = helloWorld.indexOf("World"); // 7

String newStr = helloWorld.replace("World", "Java"); // "Hello, Java!"

String strWithSpaces = "  Hello, World!  ";
String trimmedStr = strWithSpaces.trim(); // "Hello, World!"

//chars manipulation

char letterA = 'A';
char letterB = 66; // ASCII value of 'B'
char specialChar = '#';

String str = "The letter is " + letterA; // "The letter is A"

boolean isDigit = Character.isDigit(letterA); // false
boolean isLetter = Character.isLetter(letterA); // true
boolean isUpperCase = Character.isUpperCase(letterA); // true

char lowerA = Character.toLowerCase(letterA); // 'a'
char upperB = Character.toUpperCase(letterB); // 'B'

boolean isEqual = (letterA == 'A'); // true
boolean isGreater = (letterA > 'B'); // false

//convert String to array of chars or string or somethign and loop in it

public class Main {
    public void main(String[] args) {
        String str = "Hello, World!";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Character at index " + i + ": " + ch);
        }
    }
}

public class Main2 {
    public void main(String[] args) {
        String str = "Hello, World!";
        
        for (char ch : str.toCharArray()) {
            System.out.println("Character: " + ch);
        }
    }
}