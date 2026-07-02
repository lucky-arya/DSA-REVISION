public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        // int left = 0;
        // int right = nums.length - 1;

        // while (left <= right) {
        //     int mid = left + (right - left) / 2;

        //     if (nums[mid] == target) {
        //         return mid; // Target found
        //     } else if (nums[mid] < target) {
        //         left = mid + 1; // Search in the right half
        //     } else {
        //         right = mid - 1; // Search in the left half
        //     }
        // }

        // return left; // Position to insert target


        int left = 0;
        int right = nums.length;

        while(left < right) {
            int mid = left + (right -left)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int result = sip.searchInsert(nums, target);
        System.out.println(result);
    }
}