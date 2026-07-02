public class SearchInRotatedSortedTwo{
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
      int left = 0;
      int right = nums.length - 1;

      while (left <= right) {
          int mid = left + (right - left) / 2;

          if (nums[mid] == k) {
              return true; // Target found
          }

          // Handle duplicates: If nums[left] == nums[mid], we can't determine the sorted half
          if (nums[left] == nums[mid]) {
              left++; // Move left pointer to skip duplicates
              continue;
          }

          // Check if the left half is sorted
          if (nums[left] < nums[mid]) {
              // Target is in the left half
              if (nums[left] <= k && k < nums[mid]) {
                  right = mid - 1;
              } else {
                  left = mid + 1;
              }
          } else { // Right half is sorted
              // Target is in the right half
              if (nums[mid] < k && k <= nums[right]) {
                  left = mid + 1;
              } else {
                  right = mid - 1;
              }
          }
      }
      return false; // Target not found
    }

    public static void main(String[] args) {
        SearchInRotatedSortedTwo searcher = new SearchInRotatedSortedTwo();
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        boolean found = searcher.searchInARotatedSortedArrayII(nums, target);
        System.out.println(found);
    }
}