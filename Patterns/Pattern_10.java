// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *


public class Pattern_10 {
    public void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i+1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern_10 p10 = new Pattern_10();
        p10.pattern10(5);
    }
}
