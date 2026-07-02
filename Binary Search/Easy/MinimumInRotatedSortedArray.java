public class MinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the middle element is greater than the rightmost element,
            // the minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else { // Otherwise, the minimum is in the left half (including mid)
                right = mid;
            }
        }

        return nums[left]; // The minimum element
    }

    public static void main(String[] args) {
        MinimumInRotatedSortedArray finder = new MinimumInRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int minElement = finder.findMin(nums);
        System.out.println(minElement);
    }
}