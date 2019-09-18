class MergeSort {
    
    public static void main(String[] args) {

    }

    private static int[] merge(int[] firstHalf, int[] secondHalf) {
        int i = 0, j = 0, k = 0;
        int[] returnArray = new int[firstHalf.length + secondHalf.length];

        while(i < firstHalf.length && j < secondHalf.length) {
            if(firstHalf[i] < secondHalf[j]) {
                returnArray[k] = firstHalf[i];
                i++;
                k++;
            } else {
                returnArray[k] = firstHalf[j];
                k++;
                k++;
            }
        }
        while(i < firstHalf.length) {
            returnArray[k] = firstHalf[i];
            i++;
            k++;
        }
        while(j < secondHalf.length) {
            returnArray[k] = secondHalf[j];
            j++;
            k++;
        }
        return returnArray;
    }

    public static int[] mergeSort(int[] array, int lo, int hi) {
        
        int mid = (lo + hi)/2;
        int[] firstHalf = mergeSort(array, lo, mid);
        int[] secondHalf = mergeSort(array, mid+1, hi);
        return merge(firstHalf, secondHalf);
        
    }

}