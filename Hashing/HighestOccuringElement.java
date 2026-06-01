import java.util.HashMap;

public class HighestOccuringElement {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }


        int maxi = Integer.MIN_VALUE;
        int element = Integer.MIN_VALUE;

        for(int key : map.keySet()){
            if(map.get(key) > maxi){
                maxi = map.get(key);
                element = key;
            }
        }

        return element;
     
    }
    public static void main(String[] args) {
        HighestOccuringElement hoe = new HighestOccuringElement();
        int nums[] = { 1, 2, 2, 3, 3, 3 };
        int nums2[] ={4, 4, 5, 5, 6};
        System.out.println(hoe.mostFrequentElement(nums));
        System.out.println(hoe.mostFrequentElement(nums2));

    }
}
