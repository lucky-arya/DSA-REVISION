// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA
public class Pattern_17 {

    public void pattern17(int n){
        for(int i = 0; i < n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char c = 'A';

            for(int j=0;j<i+1;j++){
                System.out.print(c);
                c++;
            }

            if(i>=1){
                char ch = (char)('A' + i - 1);
                for(int j=0;j<i;j++){
                    System.out.print((char)(ch - j));
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_17 p17 = new Pattern_17();
        p17.pattern17(5);
    }
}
