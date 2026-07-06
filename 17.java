// 1051. Height Checker

class Solution {
    public int heightChecker(int[] heights) {

        int[] expected = heights.clone(); 
        // copy original array

        Arrays.sort(expected); 
        // sort to get correct order

        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++; 
                // mismatch found
            }
        }

        return count;
    }
}  