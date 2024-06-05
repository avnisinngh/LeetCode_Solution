class Solution {
    public String makeGood(String s) {
        int endPosition = 0; // Represents the end position of the modified string
        char[] charArray = s.toCharArray(); // Convert the string to a character array
        
        // Loop through each character in the string
        for (int currentPosition = 0; currentPosition < s.length(); currentPosition++) {
            // Check if the current character can be removed
            if (endPosition > 0 && Math.abs(charArray[currentPosition] - charArray[endPosition - 1]) == 32){
                endPosition--; // Decrement the end position if the current character can be removed
            }else {
                // Otherwise, keep the current character and increment the end position
                charArray[endPosition] = charArray[currentPosition];
                endPosition++;
            }
        }

        // Convert the modified character array to a string and return only the valid portion
        return new String(charArray).substring(0, endPosition);
    }
}