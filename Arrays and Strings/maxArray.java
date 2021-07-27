//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
// This problem is known as Kadane Algorithm
// Time Complexity: O(N)
// Space Complexity: O(1)

public class maxArray {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int i=0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;

    }
    
}
