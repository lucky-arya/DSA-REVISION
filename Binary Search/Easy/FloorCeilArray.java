public class FloorCeilArray {
    public int[] floorCeil (int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        int floor = -1; // Initialize floor to -1 (not found)
        int ceil = -1;  // Initialize ceil to -1 (not found)

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                floor = nums[mid];
                ceil = nums[mid];
                break; // Target found, both floor and ceil are the same
            } else if (nums[mid] < target) {
                floor = nums[mid]; // Update floor
                left = mid + 1;    // Search in the right half
            } else {
                ceil = nums[mid];  // Update ceil
                right = mid - 1;   // Search in the left half
            }
        }

        return new int[]{floor, ceil};

    }

    public static void main(String[] args) {
        FloorCeilArray fca = new FloorCeilArray();
        int nums[] = {1, 2, 4, 6, 8};
        int target = 5;

        int result[] = fca.floorCeil(nums, target);
        System.out.println(java.util.Arrays.toString(result));
    }
}