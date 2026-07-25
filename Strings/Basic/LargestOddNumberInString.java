public class LargestOddNumberInString {
    public String largeOddNum(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        LargestOddNumberInString obj = new LargestOddNumberInString();
        String num = "0214638";
        System.out.println(obj.largeOddNum(num));
    }
}