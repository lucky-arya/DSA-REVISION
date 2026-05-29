// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1

public class Pattern_11 {

    // Approach -> row+col=even->1 else 0;

    public void pattern11(int n){


        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Pattern_11 p11 = new Pattern_11();
        p11.pattern11(5);
    }
}
