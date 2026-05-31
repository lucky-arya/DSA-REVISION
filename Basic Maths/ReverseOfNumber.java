
public class ReverseOfNumber {
    public int reverseNumber(int n) {
        int reverse = 0;
        while(n!=0){
            int lastDigit = n%10;
            reverse = reverse*10 + lastDigit;
            n /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int n = 12345;
        ReverseOfNumber r = new ReverseOfNumber();
        System.out.println(r.reverseNumber(n));
    }
}
