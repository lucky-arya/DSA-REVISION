
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15

public class Pattern_13 {
    public void pattern13(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern_13 p13 = new Pattern_13();
        p13.pattern13(5);
    }
}
