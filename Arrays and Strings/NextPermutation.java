//Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
//The replacement must be in place and use only constant extra memory.
//Example 1:
//Input: nums = [1,2,3]
//Output: [1,3,2]

// Time Complexity: O(n)
// Space Complexity: O(1)

public class NextPermutation {
public void nextperm(int[] A){
    if(A == null || A.length<=1) return;
    int i = A.length-2;
    while(i >= 0 && A[i] >= A[i+1]) i--;
    if(i >= 0) {
        int j = A.length-1;
        while(A[j] <= A[i]) j--;
        swap(A, i, j);
    }
    reverse(A, i+1, A.length-1);
}
public void swap(int[] A, int i, int j){
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
}
public void reverse(int[] A, int i, int j){
    while(i < j) swap(A, i++, j--);
}

}
