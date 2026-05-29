
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5


// Approach:
//  For each cell,  calculate the minimum distance from the four borders(top, left, right, bottom) and then subtract that minimum distance from n to get the value to be printed in that cell.


public class Pattern_22 {
    public void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int bottom = (2 * n - 2) - i;
                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n - min + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern_22 p22 = new Pattern_22();
        p22.pattern22(5);
    }

}
