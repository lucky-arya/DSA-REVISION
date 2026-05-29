
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// ABCDE
// ABCD
// ABC
// AB
// A

public class Pattern_15 {
    public void pattern15(int n){
        for(int i=0;i<n;i++){
            char c = 'A';
            for(int j=n-i;j>0;j--){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_15 p15 = new Pattern_15();
        p15.pattern15(5);
    }
}
