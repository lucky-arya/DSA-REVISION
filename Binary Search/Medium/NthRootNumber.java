public class NthRootNumber {
    public int nthRoot(int n, int m) {
        if (n == 1) {
            return m;
        }

        int left = 1, right = m;


        while (left <= right) {
            int mid = left + (right - left) / 2;
            long power = power(mid, n, m);

            if (power == m) {
                return mid;
            } else if (power < m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private long power(int base, int exp ,long limit) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
            if (result > limit) {
                return result; 
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NthRootNumber obj = new NthRootNumber();
        int m = 69, n = 4;
        System.out.println(obj.nthRoot(n, m));
    }
}