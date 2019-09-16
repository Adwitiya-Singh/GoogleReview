class SortingAlgorithms {

    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] array) {
        int counter = 1;
        while(counter < array.length){
            for(int i = 0; i < array.length - counter; i++) {
                if(array[i] > array[i+1]) {
                    swap(array, i, i + 1);
                }
            }
            counter++;
        }
    }

    public static void insertionSort(int[] array) {
        int counter = 1;
        while(counter < array.length) {
            for(int i = counter; i > 0; i--) {
                if(array[i] < array[i-1]) {
                    swap(array, i, i-1);
                }
            }
            counter++;
        }
    }

    public static void selectionSort(int[] array) {
        int counter = 1;
        while(counter < array.length) {
            for(int i = counter; i < array.length; i++) {
                if(array[i] < array[counter - 1]) {
                    swap(array, i, counter - 1);
                }
            }
            counter++;
        }
    }

    public static void swap(int[] array, int pos1, int pos2) {
        int temp = pos1;
        pos1 = pos2;
        pos2 = temp;
    }
}