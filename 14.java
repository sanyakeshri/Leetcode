// 724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {

        int rightSum = 0;

        // Calculate total rightsum
        for (int num : nums) {
            rightSum += num;
        }

        int leftSum = 0;

        // Find pivot index
        for (int i = 0; i < nums.length; i++) {

            rightSum -= nums[i];

            if (rightSum == leftSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}