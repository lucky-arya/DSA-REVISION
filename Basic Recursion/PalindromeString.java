public class PalindromeString {
    public boolean palindromeCheck(String s) {
        if(s.length() == 0 || s.length() == 1){
            return true;
        }

        // if(s.charAt(0) == s.charAt(s.length()-1)){
        //     return palindromeCheck(s.substring(1, s.length()-1));
        // }
        // return false;
        return helper(s, 0, s.length()-1);
    }

    private boolean helper(String s, int left, int right){
        if(left >= right){
            return true;
        }

        if(s.charAt(left) == s.charAt(right)){
            return helper(s, left+1, right-1);
        }
        return false;
    }
    public static void main(String[] args) {
        PalindromeString p = new PalindromeString();
        String s = "hannah";
        String s2 = "aabbaA";
        System.out.println(p.palindromeCheck(s));
        System.out.println(p.palindromeCheck(s2));
    }
}
