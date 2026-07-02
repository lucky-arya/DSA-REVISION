public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is even or odd
            if (mid % 2 == 0) {
                // If mid is even, check if the next element is the same
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 2; // Move to the right half
                } else {
                    right = mid; // Move to the left half
                }
            } else {
                // If mid is odd, check if the previous element is the same
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1; // Move to the right half
                } else {
                    right = mid; // Move to the left half
                }
            }
        }

        return nums[left]; // The single non-duplicate element
    }

    public static void main(String[] args) {
        SingleNonDuplicate finder = new SingleNonDuplicate();
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        int singleElement = finder.singleNonDuplicate(nums);
        System.out.println(singleElement);
    }
}