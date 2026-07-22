// 34. Find First and Last Position of Element in Sorted Array

class Solution {

    public static void main(String[] args) {

    }

    // Function to find first and last position of target
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };

        int start = search(nums, target, true);   // find first index
        int end = search(nums, target, false);    // find last index

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // Function to return the next greatest letter
    public char nextGreaterLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // if start goes outside array, wrap around
        return letters[start % letters.length];
    }

    // Binary search helper function
    public static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid; // potential answer
                if (findStartIndex) {
                    end = mid - 1;  // search left side
                } else {
                    start = mid + 1; // search right side
                }
            }
        }

        return ans;
    }
}
