
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



// A
// AB
// ABC
// ABCD
// ABCDE
public class Pattern_14 {

    public void pattern14(int n){
        for(int i=0;i<n;i++){
            char c='A';
            for(int j=0;j<i+1;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_14 p14 = new Pattern_14();
        p14.pattern14(5);
    }
}
