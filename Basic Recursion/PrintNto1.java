

public class PrintNto1 {
    public void printNumbers(int n) {
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        PrintNto1 p = new PrintNto1();
        p.printNumbers(n);
    }
}
