// 66.PlusOne
class Solution {
    public int[] plusOne(int[] digits) {

        // Traverse from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9
            if (digits[i] < 9) {
                digits[i]++;      // Add 1
                return digits;    // Return updated array
            }else{
            // If digit is 9 → make it 0 and carry forward
            digits[i] = 0;
            }
        }

        // If all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
