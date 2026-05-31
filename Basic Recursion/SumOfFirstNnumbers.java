
public class SumOfFirstNnumbers {
    public int NnumbersSum(int N) {
        if(N==0){
            return 0;
        }
        return N + NnumbersSum(N-1);
    }
    public static void main(String[] args) {
        SumOfFirstNnumbers s = new SumOfFirstNnumbers();
        System.out.println(s.NnumbersSum(5));
    }
}
