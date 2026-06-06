public class LinearSearch {
    public int linearSearch(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }   
     public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        int target2 = 6;
        int result = ls.linearSearch(arr, target);
        int result2 = ls.linearSearch(arr, target2);
        System.out.println(result);
        System.out.println(result2);
    }
}
