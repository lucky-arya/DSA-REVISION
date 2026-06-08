import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int lesser = target - nums[i];
            if (map.containsKey(lesser)) {
                return new int[] { map.get(lesser), i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int nums[] = { 1, 3, 5, -7, 6, -3 };
        int target = 0;

        System.out.println(Arrays.toString(ts.twoSum(nums, target)));
    }
}