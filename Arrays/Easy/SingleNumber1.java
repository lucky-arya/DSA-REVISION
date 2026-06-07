import java.util.HashMap;

public class SingleNumber1 {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        // int result = 0;
        // for (int num : nums) {
        //     result ^= num;
        // }
        // return result;

        // Using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 4, 3, 1, 4 };
        SingleNumber1 sn = new SingleNumber1();
        System.out.println(sn.singleNumber(nums));
    }
}
