public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5 };
        int newLength = rd.removeDuplicates(arr);
        System.out.println(newLength);
    }

}
