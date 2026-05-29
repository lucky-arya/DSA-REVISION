
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// A
// BB
// CCC
// DDDD
// EEEEE

public class Pattern_16 {

    public void pattern16(int n){
        char c = 'A';
        for(int i=0 ; i< n ;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_16 p16 = new Pattern_16();
        p16.pattern16(5);
    }
}
