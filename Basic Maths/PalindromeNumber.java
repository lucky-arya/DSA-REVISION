public class PalindromeNumber{
    public boolean isPalindrome(int n) {
        // int reverse =0;
        // int original = n;

        // while(n!=0){
        //     int lastDigit = n%10;
        //     reverse = reverse*10 + lastDigit;
        //     n/=10;
        // }

        // return original==reverse;

        String str = Integer.toString(n);
         int j=str.length()-1;

        for(int i=0;i<j;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        int n = 12321;
        int m = 12345;
        System.out.println(p.isPalindrome(n));
        System.out.println(p.isPalindrome(m));
    }
}