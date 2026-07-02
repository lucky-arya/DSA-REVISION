public class UpperBound {
    public int upperBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid; // Search in the left half
            }
        }

        return left; // Upper bound index
    }

    public static void main(String[] args) {
        UpperBound ub = new UpperBound();
        int[] nums = {1, 2, 4, 4, 5};
        int target = 4;

        int result = ub.upperBound(nums, target);
        System.out.println(result);
    }
}