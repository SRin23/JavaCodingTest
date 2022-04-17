package baekjoon.bronze.bronze4;
//計算 (Calculation)
import java.util.Scanner;

public class Calcuation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        System.out.println(Math.max(sum, sub));
        System.out.println(Math.min(sum, sub));
    }
}
