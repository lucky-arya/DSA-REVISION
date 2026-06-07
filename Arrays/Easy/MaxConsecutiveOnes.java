public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int num : nums){
            if(num == 1){
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
        System.out.println(mco.findMaxConsecutiveOnes(nums));
    }
}
