
// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 1
// 12
// 123
// 1234
// 12345


public class Pattern_03 {

    public void pattern3(int n){
        for(int i= 0 ;i < n; i++){
            for(int j = 0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_03 p3 = new Pattern_03();
        p3.pattern3(5);
    }
}
