package baekjoon.bronze.bronze4;
//Σ­φά (Hour Hand)
import java.util.Scanner;

public class HourHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int pass = sc.nextInt();
        int result = (hour+pass)%12;
        System.out.println(result==0?12:result);
    }
}
