public class CountOccurence {
    public int countOccurrences(int[] nums, int target) {
        int first = findFirst(nums, target);
        if (first == -1) {
            return 0; // Target not found
        }
        int last = findLast(nums, target);
        return last - first + 1; // Count of occurrences
    }

    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                firstOccurrence = mid; // Update first occurrence
                right = mid - 1; // Search in the left half
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return firstOccurrence;
    }

    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int lastOccurrence = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                lastOccurrence = mid; // Update last occurrence
                left = mid + 1; // Search in the right half
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return lastOccurrence;
    }

    public static void main(String[] args) {
        CountOccurence co = new CountOccurence();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int count = co.countOccurrences(nums, target);
        System.out.println(count);
    }
}