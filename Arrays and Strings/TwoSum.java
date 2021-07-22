// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

import java.util.HashMap;
import java.util.Map;
public class TwoSum {
public static int[] twoSumIndex(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i=0; i<numbers.length;i++) {
        if(map.containsKey(target - numbers[i])){
            result[0]= map.get(target-numbers[i]);
            result[1]= i;
            return result;
        }
        map.put(numbers[i], i);
    }
    return result;
}   
}

//Time complexity is: O(n)

//Space complexity is:O(n)