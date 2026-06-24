public class LargestSubarrayWithSumZero {
    public int maxLen(int[] arr) {
         Map<Integer, Integer> Map = new HashMap<>();
        int maxLength = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLength = i + 1;
            }

            if (Map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - Map.get(sum));
            } else {
                Map.put(sum, i);
            }
        }

        return maxLength;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2, -2};
        LargestSubarrayWithSumZero solution = new LargestSubarrayWithSumZero();
        int result = solution.maxLen(arr);
        System.out.println(result);
    }
}