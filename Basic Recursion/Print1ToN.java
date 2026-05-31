

public class Print1ToN {
    public void printNumbers(int n) {
        if(n==0){
            return;
        }
        printNumbers(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 5;
        Print1ToN p = new Print1ToN();
        p.printNumbers(n);
    }
}
