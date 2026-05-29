// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



// *****
// *   *
// *   *
// *   *
// *****


public class Pattern_21 {
    public void pattern21(int n){
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=0;j<n-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Pattern_21 p21 = new Pattern_21();
        p21.pattern21(5);
    }
}
