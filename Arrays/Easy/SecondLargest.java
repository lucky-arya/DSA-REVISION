public class SecondLargest {
    public int secondLargestElement(int[] nums) {

        if (nums.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        SecondLargest sl = new SecondLargest();
        int arr[] = { 3, 3, 0, 99, -40 };
        System.out.println(sl.secondLargestElement(arr));
    }
}
