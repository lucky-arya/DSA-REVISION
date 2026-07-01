public class FirstAndLastOccurrence {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
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
        FirstAndLastOccurrence floccurrence = new FirstAndLastOccurrence();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = floccurrence.searchRange(nums, target);
        System.out.println(java.util.Arrays.toString(result));
    }
}