public class insertion_sort {
    public static void sort(int[] array) {
        for (int end = 1; end < array.length; end++) {
            int i = end;
            while (i > 0 && array[i - 1] > array[i]) {
                swap(array, i - 1, i);
                i--;
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
