import java.util.*;

public class ForLoop {
    public int forLoopSum(int low , int high) {
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        return sum;

    }
    public static void main(String[] args) {
        ForLoop fl = new ForLoop();
        System.out.println(fl.forLoopSum(1, 5));
    }
}
