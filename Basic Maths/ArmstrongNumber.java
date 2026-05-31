public class ArmstrongNumber {

    public boolean isArmstrong(int n) {
        int noOfdigits = Integer.toString(n).length();
        int original = n;
        int sum = 0;
        while(n!=0){
            int lastDigit = n%10;
            sum += Math.pow(lastDigit, noOfdigits);
            n/=10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        ArmstrongNumber asm = new ArmstrongNumber();
        int n = 153;
        int m = 12;
        System.out.println(asm.isArmstrong(n));
        System.out.println(asm.isArmstrong(m));
    }
}
