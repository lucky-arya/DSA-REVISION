import java.util.*;

public class InputOutput {

    public void printNumber(Scanner sc) {
        int input = sc.nextInt();
        System.out.println(input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputOutput io = new InputOutput();
        io.printNumber(sc);
        sc.close();
    }
}