// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3
// Time complexity : O(n);
// Space Complexity : O(1);
public class MajorityElement {
public static int majority(int[] nums) {
    int count = 0;
    int candidate = 0;
    for(int num : nums){
        if(count == 0){
            candidate = num;
        }
        if(num == candidate) count+=1;
        else
           count-=1;
    }
    return candidate;
}    
}
