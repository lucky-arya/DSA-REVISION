import java.util.Arrays;

public class UnionOfTwoSortedArrays {

    public int[] unionArray(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;

        int[] result = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                if (k == 0 || result[k - 1] != nums1[i]) {
                    result[k++] = nums1[i];
                }
                i++;
            } 
            else if (nums1[i] > nums2[j]) {
                if (k == 0 || result[k - 1] != nums2[j]) {
                    result[k++] = nums2[j];
                }
                j++;
            } 
            else { // nums1[i] == nums2[j]
                if (k == 0 || result[k - 1] != nums1[i]) {
                    result[k++] = nums1[i];
                }
                i++;
                j++;
            }
        }

        // Remaining elements of nums1
        while (i < nums1.length) {
            if (k == 0 || result[k - 1] != nums1[i]) {
                result[k++] = nums1[i];
            }
            i++;
        }

        // Remaining elements of nums2
        while (j < nums2.length) {
            if (k == 0 || result[k - 1] != nums2[j]) {
                result[k++] = nums2[j];
            }
            j++;
        }

        return Arrays.copyOf(result, k);
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        UnionOfTwoSortedArrays ua = new UnionOfTwoSortedArrays();
        int[] result = ua.unionArray(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}