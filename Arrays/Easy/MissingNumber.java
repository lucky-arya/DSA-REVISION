public class MissingNumber {

    public int missingNumber(int[] nums) {
        // Approach 1: Using the formula for the sum of the first n natural numbers
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int num  : nums){
            actualSum += num;
        }
        return expectedSum - actualSum;


        //Approach 2: Using Sorting
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] != i){
        //         return i;
        //     }
        // }
        // return -1;
    }
    public static void main(String[] args) {
        MissingNumber ms = new MissingNumber();
        int nums[] = {0, 1, 2, 4, 5, 6};
        System.out.println(ms.missingNumber(nums));
    }
}
