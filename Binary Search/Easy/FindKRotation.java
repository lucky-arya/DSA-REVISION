public class FindKRotation {
    public int findKRotation(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the middle element is greater than the rightmost element,
            // the rotation point is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else { // Otherwise, the rotation point is in the left half (including mid)
                right = mid;
            }
        }

        return left; // The index of the smallest element (rotation count)
    }

    public static void main(String[] args) {
        FindKRotation finder = new FindKRotation();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int rotationCount = finder.findKRotation(nums);
        System.out.println(rotationCount);
    }
}