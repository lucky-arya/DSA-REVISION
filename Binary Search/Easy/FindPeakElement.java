public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            if (nums[mid] > nums[mid + 1]) {
                // If mid is greater than the next element, move to the left half
                right = mid;
            } else {
                // If mid is less than or equal to the next element, move to the right half
                left = mid + 1;
            }
        }

        return left; // The index of a peak element
    }

    public static void main(String[] args) {
        FindPeakElement finder = new FindPeakElement();
        int[] nums = {1, 2, 3, 1};

        int peakIndex = finder.findPeakElement(nums);
        System.out.println(peakIndex);
    }
}