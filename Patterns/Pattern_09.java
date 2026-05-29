

// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



//     * 
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

public class Pattern_09 {

    public void pattern09(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 0 ;j<(n-i);j++){
                System.out.print(" ");
            }

            for( int j = 0; j<(2*i-1);j++ ){
                System.out.print("*");
            }
            System.out.println();

            
        }



        for(int i=1;i<=n;i++){
            for(int j= 0 ;j<i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<(2*(n-i)+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_09 p9 = new Pattern_09();
        p9.pattern09(5);
    }
}
