import java.util.*;

public class WhileLoop {

    public int whileLoop(int d) {

        int count = 1;
        int sum = 0;
        int num=d;


        while (count <= 50) {
            sum += num;
            num += 10;   
            count++;
        }

        return sum;
    }
    public static void main(String args[]){
        WhileLoop wl = new WhileLoop();
        System.out.println(wl.whileLoop(1));;
    }
}
