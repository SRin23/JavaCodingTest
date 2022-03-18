package baekjoon.bronze.bronze5;
//나는 행복합니다~~
import java.util.Scanner;

public class ImHappy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k/m + " " + k%m);
    }
}
