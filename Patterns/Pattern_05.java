// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *****
// ****
// ***
// **
// *



public class Pattern_05 {
    public void pattern_05(int n){
        for(int i=0 ;i<n ;i++){
            for(int j = n ;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_05 p5 = new Pattern_05();
        p5.pattern_05(5);

    }
}
