//In this question we are sorting an array for 0's , 1's and 2's .
// This problem is commonly known as Dutch national flag algorithm
//Time Complexity: O(N)

public class DutchSort{
    public static void sort(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        int temp;
        while(mid <= high){
            switch(arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
                

                 
            }
        }

    }
}