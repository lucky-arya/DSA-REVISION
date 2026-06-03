import java.util.ArrayList;

public class IsSorted {
    public boolean isSorted(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        IsSorted is = new IsSorted();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        // arr.add(0);
        System.out.println(is.isSorted(arr));

        arr.add(0);
        System.out.println(is.isSorted(arr));
    }
}
