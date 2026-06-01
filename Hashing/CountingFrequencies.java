import java.util.*;
public class CountingFrequencies {
    public List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> keys = map.keySet();
        for(int key : keys){
            List<Integer> list = new ArrayList<>();
            list.add(key);
            list.add(map.get(key));
            result.add(list);
        }
        return result;
    }
public static void main(String []args){
        CountingFrequencies cf = new CountingFrequencies();
        int nums[] = {1, 2, 2, 3};
        int nums2[] = {5,5,5,5};
        List<List<Integer>> result = cf.countFrequencies(nums);
        List<List<Integer>> result2 = cf.countFrequencies(nums2);
        System.out.println(result);
        System.out.println(result2);
   }
}