package baekjoon.bronze.bronze4;
//?�� (Homecoming)
import java.util.Scanner;

public class Homecoming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<=c&&b>c) System.out.println(1);
        else System.out.println(0);
    }
}
