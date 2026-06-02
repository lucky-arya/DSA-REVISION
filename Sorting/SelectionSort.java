public class SelectionSort {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i< n-1;i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }

            if(min != i){
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
            }

        }

        return nums;
    }
    public void printArray(int arr[]){
        System.out.print("[");
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int arr[] =  {7, 4, 1, 5, 3};
        int sortedArr[] = ss.selectionSort(arr);
        ss.printArray(sortedArr);
    }
}
