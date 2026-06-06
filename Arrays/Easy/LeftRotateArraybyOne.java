public class LeftRotateArraybyOne {
    public void rotateArrayByOne(int[] nums) {
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        LeftRotateArraybyOne lr = new LeftRotateArraybyOne();
        lr.rotateArrayByOne(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
