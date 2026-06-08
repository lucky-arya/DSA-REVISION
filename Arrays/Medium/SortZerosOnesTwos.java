import java.util.Arrays;

public class SortZerosOnesTwos {

    public void sortZeroOneTwo(int[] nums) {
        // Dutch National Flag algo

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            // case : 1 -> mid is 0
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) { // case : 2 -> mid is 1
                mid++;
            } else {
                swap(nums, mid, high); // case : 3 -> mid is two
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        SortZerosOnesTwos szot = new SortZerosOnesTwos();
        int nums[] = { 1, 0, 2, 1, 0 };
        szot.sortZeroOneTwo(nums);

        System.out.println(Arrays.toString(nums));
    }
}
