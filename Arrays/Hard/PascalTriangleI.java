public class PascalTriangleI{

    public int pascalTriangleI(int r, int c) {
        long ans=1;

        int n = r-1;
        int k = c-1;
        for(int i=0;i<k;i++){
            ans=ans*(n-i);
            ans = ans/(i+1);
        }

        return (int) ans;
    }


    public static void main(String args[]){
        PascalTriangleI psi = new PascalTriangleI();
        System.out.println(psi.pascalTriangleI(5,3));
    }
}