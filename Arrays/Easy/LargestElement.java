public class LargestElement {
     public int largestElement(int[] nums) {
        int max = nums[0];

        for(int i = 1;i<nums.length;i++){
            max = Math.max(max, nums[i]);
        }

        return max;
    
    }
    public static void main(String[] args) {
        LargestElement le = new LargestElement();
        int arr[] = {3, 3, 0, 99, -40};
        System.out.println(le.largestElement(arr));
    }
}
