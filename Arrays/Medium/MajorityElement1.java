
// Given an integer array nums of size n, return the majority element of the array.



// The majority element of an array is an element that appears more than n/2 times in the array. The array is guaranteed to have a majority element.

import java.util.HashMap;

public class MajorityElement1{
     public int majorityElement(int[] nums) {
        // // frequency map
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int num : nums){
        //    map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for(int num : map.keySet()){
        //     if(map.get(num) > nums.length / 2){
        //         return num;
        //     }
        // }

        // return -1; // This line will never be reached as the array is guaranteed to have a majority element

        // Boyer-Moore Voting Algorithm
        int count  = 0;
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }

            count += (num == candidate) ?  1 : -1;
        }
        return candidate;
    }
    
    public static void main(String[] args) {
        int nums[] = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        MajorityElement1 solution = new MajorityElement1();
        System.out.println(solution.majorityElement(nums));
    }
}