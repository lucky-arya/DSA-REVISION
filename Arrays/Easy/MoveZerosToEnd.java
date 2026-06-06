public class MoveZerosToEnd {
     public void moveZeroes(int[] nums) {

        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }

        while(index<nums.length){
            nums[index]=0;
            index++;
        }

        // if order of non-zero elements doesn't mattter

        // int left = 0;
        // int right = nums.length - 1;

        // while (left < right) {
        //     while (left < right && nums[right] == 0) right--;
        //     while (left < right && nums[left] != 0) left++;
        //     if (left < right) {
        //         nums[left] = nums[right];
        //         nums[right] = 0;
        //         left++;
        //         right--;
        //     }
        // }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int arr2[] = { 0, 0, 0, 1, 3, -2 };
        MoveZerosToEnd mz = new MoveZerosToEnd();
        mz.moveZeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        mz.moveZeroes(arr2);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}