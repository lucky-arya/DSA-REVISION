// Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.

// Ensure only the 1st letter of the answer is capitalised.



import java.util.Scanner;



public class SwitchCase {

    public void whichWeekDay(int day) {

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        SwitchCase scase = new SwitchCase();
        int day = sc.nextInt();
        scase.whichWeekDay(day);
        sc.close();
    }
}
