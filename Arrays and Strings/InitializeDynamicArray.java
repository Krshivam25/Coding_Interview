public class InitializeDynamicArray {
    public static void main(String[] args) {
        // declaring an array
        int arr[];
        // initialize an array
        arr = new int[4];
        arr[0] = 1;
        arr[1] = 45;
        arr[2] = 33;
        arr[3] = 12;
        System.out.println("Elements in arrays is: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
