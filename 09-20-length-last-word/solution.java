class Solution {
    public int lengthOfLastWord(String s) {
        //split the string by space
        s = s.trim();
        String[] result = s.split(" ");
        //extract the last world
        String lastWold = result[result.length-1];

        //calculate the length of last world
        return lastWold.length();
    }
}