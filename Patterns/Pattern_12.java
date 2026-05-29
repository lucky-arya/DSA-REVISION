// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321


// Print the pattern in the function given to you.



public class Pattern_12 {
    public void pattern12(int n){
        for(int i=0 ; i < n ; i++){
            for(int j=1 ;j < i+2;j++){
                System.out.print(j);
            }

            for(int j=0;j<(2*(n-i-1));j++){
                System.out.print(" ");
            }




            for(int j=i+1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_12 p12 = new Pattern_12();
        p12.pattern12(5);
    }
}
