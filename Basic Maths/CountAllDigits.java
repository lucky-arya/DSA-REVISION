public class CountAllDigits {
    public int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountAllDigits c = new CountAllDigits();
        int n = 123456789;
        System.out.println( c.countDigit(n));
    }
}