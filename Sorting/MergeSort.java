public class MergeSort {
     public int[] mergeSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = mergeSort(java.util.Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(java.util.Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);

        // mergeSortHelper(nums, 0, nums.length - 1);
        // return nums;

    }

    // private void mergeSortHelper(int[] nums, int left, int right) {
    //     if (left < right) {
    //         int mid = left + (right - left) / 2;
    //         mergeSortHelper(nums, left, mid);
    //         mergeSortHelper(nums, mid + 1, right);
    //         merge(nums, left, mid, right);
    //     }
    // }

    // private void merge(int[] nums, int left, int mid, int right) {
    //     int n1 = mid - left + 1;
    //     int n2 = right - mid;

    //     int[] L = new int[n1];
    //     int[] R = new int[n2];

    //     for (int i = 0; i < n1; i++)
    //         L[i] = nums[left + i];
    //     for (int j = 0; j < n2; j++)
    //         R[j] = nums[mid + 1 + j];

    //     int i = 0, j = 0;
    //     int k = left;
    //     while (i < n1 && j < n2) {
    //         if (L[i] <= R[j]) {
    //             nums[k] = L[i];
    //             i++;
    //         } else {
    //             nums[k] = R[j];
    //             j++;
    //         }
    //         k++;
    //     }

    //     while (i < n1) {
    //         nums[k] = L[i];
    //         i++;
    //         k++;
    //     }

    //     while (j < n2) {
    //         nums[k] = R[j];
    //         j++;
    //         k++;
    //     }
    // }

    private int [] merge(int left[],int right[]){
            int merged[] = new int[left.length + right.length];
            int i = 0, j=0,k=0;
            while(i<left.length && j<right.length){
                if(left[i]<right[j]){
                    merged[k++] = left[i++];
                }else{
                    merged[k++] = right[j++];
                }

            }
            while(i<left.length){
                merged[k++] = left[i++];
            }
            while(j<right.length){
                merged[k++] = right[j++];
            }
            return merged;
    }
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int arr[] = {5, 4, 4, 1, 1};

        int sortedArr[] = ms.mergeSort(arr);

        for (int num : sortedArr) {
            System.out.print(num + " ");
        }


    }
}
