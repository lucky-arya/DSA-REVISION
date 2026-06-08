public class LongestSubarrayWithSumK1 {
    public int longestSubarray(int[] nums, int k) {
       // positive numbers only
        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, i - left + 1);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        LongestSubarrayWithSumK1 ls = new LongestSubarrayWithSumK1();
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(ls.longestSubarray(nums, k));
    }
}
