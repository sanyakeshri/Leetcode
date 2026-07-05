// 389. Find the Difference

class Solution {
    public char findTheDifference(String s, String t) {

        char result = 0; 
        // start with 0 (empty XOR value)

        for (char c : s.toCharArray()) {
            result ^= c; 
            // XOR all characters in s
        }

        for (char c : t.toCharArray()) {
            result ^= c; 
            // XOR all characters in t
        }

        return result; 
        // remaining character is the added letter
    }
}