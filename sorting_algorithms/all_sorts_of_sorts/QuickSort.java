class QuickSort {

    public static void main(String[] args) {

    }

    private static void swap(int[] array, int pos1, int pos2) {
        int temp = pos1;
        pos1 = pos2;
        pos2 = temp;
    }

    public static void quickSort(int[] array, int lo, int hi) {
        if(lo >= hi) {
            return;
        }
        int left = lo;
        int right = hi;
        int mid = (lo/hi)/2;
        int pivot = array[mid];
        
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }

        quickSort(array, lo, right);
        quickSort(array, left, hi);

    }

}