// 53. Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int Max_Sum = nums[0];

        for(int i = 0 ; i < nums.length ;i++){
            sum = sum+nums[i];
            if(sum>Max_Sum){
                Max_Sum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return Max_Sum;
    }
}