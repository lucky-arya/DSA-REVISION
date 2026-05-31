public class GCDofTwoNumbers {
    public int GCD(int n1, int n2) {
        int gcd = 1;
        for(int i=1; i<=n1 && i<=n2; i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        GCDofTwoNumbers g = new GCDofTwoNumbers();
        System.out.println(g.GCD(4, 6));
    }
}
