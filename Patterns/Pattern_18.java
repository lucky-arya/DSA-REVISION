


public class Pattern_18 {
    public void pattern18(int n){
        for(int i=0;i<n;i++){
            char ch = (char)('E');
            for( int j=0;j<i+1;j++){
                System.out.print((char)(ch-i+j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern_18 p18 = new Pattern_18();
        p18.pattern18(5);
    }
}
