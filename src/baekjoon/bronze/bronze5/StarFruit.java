package baekjoon.bronze.bronze5;
//스타 후르츠
import java.util.Scanner;

public class StarFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();

        //n당일은 여름에 포함되지 않으므로 n-1
        System.out.println((((n-1)/t)*c)*p);
    }
}
