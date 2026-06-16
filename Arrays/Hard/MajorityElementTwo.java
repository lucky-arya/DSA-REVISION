import java.util.*;

public class MajorityElementTwo {
    public List<Integer> majorityElementTwo(int[] nums) {
        int count1 = 0, count2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;

        List<Integer> ans = new ArrayList<>();

        // Find candidates
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && nums[i] != el2) {
                count1 = 1;
                el1 = nums[i];
            } else if (count2 == 0 && nums[i] != el1) {
                count2 = 1;
                el2 = nums[i];
            } else if (nums[i] == el1) {
                count1++;
            } else if (nums[i] == el2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        // Verify candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == el1) count1++;
            else if (num == el2) count2++;
        }

        if (count1 > nums.length / 3) {
            ans.add(el1);
        }

        if (count2 > nums.length / 3) {
            ans.add(el2);
        }

        return ans;
    }

    public static void main(String args[]) {
        MajorityElementTwo met = new MajorityElementTwo();

        int nums[] = {1, 2, 1, 1, 3, 2, 2};

        List<Integer> result = met.majorityElementTwo(nums);

        System.out.println(result);
    }
}