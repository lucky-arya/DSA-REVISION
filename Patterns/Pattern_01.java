
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// *****
// *****
// *****
// *****
// *****

public class Pattern_01 {

    public void pattern1 (int n) {
        for(int i = 0 ; i < n ;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
            Pattern_01 p1 = new Pattern_01();
            p1.pattern1(5);
    }
}
