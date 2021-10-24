public class DynamicArray2 {
    private int arr[];
    private int count;
    private int size;

    public DynamicArray2() {
        arr = new int[5];
        count = 0;
        size = 1;

    }

    public void addElem(int a) {
        if (count == size) {
            growSize();
        }
        arr[count] = a;
        count++;

    }

    public void growSize() {
        int temp[] = null;
        if (count == size) {
            temp = new int[size * 2];
            {
                for (int i = 0; i < size; i++) {
                    temp[i] = arr[i];
                }
            }
        }
        arr = temp;
        size = size * 2;
    }

    public void addElementAt(int index, int a) {
        if (count == size) {
            growSize();
        }
        for (int i = count - 1; i >= index; i++) {
            arr[i + 1] = arr[i];
        }
        arr[index] = a;
        count++;
    }

    public static void main(String[] args) {
        DynamicArray2 da = new DynamicArray2();
        da.addElem(23);
        da.addElem(45);
        da.addElem(12);
        da.addElem(80);

        System.out.println("Elements of the array:");
        for (int i = 0; i < da.size; i++) {
            System.out.println(da.arr[i] + " ");
        }
        System.out.println();
    }

}
