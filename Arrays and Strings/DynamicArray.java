public class DynamicArray {
    private int arr[];
    private int count;
    private int sizeofarray;

    public DynamicArray() {
        arr = new int[1];
        count = 0;
        sizeofarray = 1;
    }

    public void addElement(int a) {
        if (count == sizeofarray) {
            growSize();
        }
        arr[count] = a;
        count++;
    }

    public void growSize() {
        int temp[] = null;
        if (count == sizeofarray) {
            temp = new int[sizeofarray * 2];
            {
                for (int i = 0; i < sizeofarray; i++) {
                    temp[i] = arr[i];
                }
            }
        }
        arr = temp;
        sizeofarray = sizeofarray * 2;

    }

    public void addElement(int index, int a) {
        if (count == sizeofarray) {
            growSize();
        }
        for (int i = count - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = a;
        count++;
    }
}
