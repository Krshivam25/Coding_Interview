// This is a basic implementation of reverse array.

// This is traditional solution to reverse an array elements. 
public class reverseArray {
    public static void reverse(int[]arr, int n){
        int arr_2[] = new int[n];
        int j = n;
        for(int i=0;i<n;i++){
            arr_2[j-1] = arr[i];
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.println(arr_2[k]);
        }

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        reverse(arr,arr.length);
    }
    
}
