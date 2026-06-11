// Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
// A subarray is a contiguous non-empty sequence of elements within an array.
public class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadaneAlgorithm solution = new KadaneAlgorithm();
        System.out.println(solution.maxSubArray(nums));
    }
}
