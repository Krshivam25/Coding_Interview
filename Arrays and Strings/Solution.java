//Given an unsorted array of size n. Array elements are in the range from 1 to n. One number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

//We are using HashMap here
// Time complexity is O(N)
import java.util.*;
public class Solution {
     public static void main(String[] args) {
        int[] arr = {4,3,6,2,1,1};
        Map<Integer, Boolean>numberMap = new HashMap<>();
        int max = arr.length;
        for(Integer i : arr) {
            if(numberMap.get(i) == null){
                numberMap.put(i, true);
            }
            else {
                System.out.println("Repeating = " + i);
            }
        }
        for(int i = 1; i <= max; i++) {
            if(numberMap.get(i) == null) {
                System.out.println("Missing = " + i);
            }
        }
    }
    
}
