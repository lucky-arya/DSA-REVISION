import java.util.*;
// Given an integer array nums, return a list of all the leaders in the array.
// A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.



public class LeadersInArray{
    public List<Integer> leaders(int[] nums) {
        List<Integer> leadersList = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                leadersList.add(nums[i]);
                maxFromRight = nums[i];
            }
        }

        Collections.reverse(leadersList);
        return leadersList;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 3, 1, 2};
        LeadersInArray solution = new LeadersInArray();
        List<Integer> leaders = solution.leaders(arr);
        System.out.println(leaders);
    }
}