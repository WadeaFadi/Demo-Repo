public class BubbleSort implements SortMethod{
    @Override
    public int[] Sort(int[] array) {
        int i, j, temp;
        for (i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        return array;
    }
}
