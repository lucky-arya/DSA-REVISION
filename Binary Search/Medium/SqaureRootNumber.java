public class SquareRootNumber {

    public int floorSqrt(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int left = 1, right = n / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            } else if (square < n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 8;
        SquareRootNumber obj = new SquareRootNumber();
        System.out.println(obj.floorSqrt(n));
    }
}