public class RecursiveInsertionSort {

    public int[] insertionSort(int[] nums) {

        insertionSortHelper(nums,nums.length);
        return nums;
    }


    public void insertionSortHelper(int[] arr, int n) {

        // Base case
        if (n <= 1) {
            return;
        }

        // Sort first n-1 elements
        insertionSortHelper(arr, n - 1);

        // Insert last element at correct position
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
    }
    public static void main(String[] args) {
        RecursiveInsertionSort ris = new RecursiveInsertionSort();
        int arr[] = {5, 4, 4, 1, 1};

        ris.insertionSort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
