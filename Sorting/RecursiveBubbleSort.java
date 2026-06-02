public class RecursiveBubbleSort {
    public int[] bubbleSort(int[] nums) {
        // using the java pass by refernce advantage .

        bubbleSortHelper(nums, nums.length);
        return nums;

    }
    private void bubbleSortHelper(int []nums,int n){
        if(n==1) return;

        boolean swapped = false; //for optimisation

        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]) {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
                swapped = true;
            }
        }

        if(!swapped){ // if swapped 
            return;
        }

        bubbleSortHelper(nums,n-1);
    }
    public static void main(String[] args) {
        RecursiveBubbleSort rbs = new RecursiveBubbleSort();
        int[] arr =  {7, 4, 1, 5, 3};
        rbs.bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
