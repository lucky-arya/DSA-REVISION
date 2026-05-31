import java.util.*;
public class DivisorsOfaNumber {
     public int[] divisors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for(int i=2;i<=n;i++){
            if(n%i==0){
                ans.add(i);
            }
        }
        return ans.stream().mapToInt(i->i).toArray();
    }

    public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DivisorsOfaNumber don = new DivisorsOfaNumber();
        int [] ans1 = don.divisors(6);
        int [] ans2 = don.divisors(8);
        don.printArray(ans1);
        don.printArray(ans2);

    }
}
