class Solution {

    public static int romanToInt(String s) {
        // Convert the string to a char array
        char[] stringArray = s.toCharArray();
        int total = 0;

        for (int i = 0; i < stringArray.length; i++) {
            // Check if this is the last character or if the current character is less than the next character
            if (i + 1 < stringArray.length && convertSingleRoman(stringArray[i]) < convertSingleRoman(stringArray[i + 1])) {
                total += convertSingleRoman(stringArray[i + 1]) - convertSingleRoman(stringArray[i]);
                i++; // Skip the next character
            } else {
                total += convertSingleRoman(stringArray[i]);
            }
        }
        return total;
    }

    public static int convertSingleRoman(char s) {
        switch (s) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
}