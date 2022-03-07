package baekjoon.bronze.bronze4;
//AFC 윔블던
import java.util.Scanner;

public class AFCSoccer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if ((a + b) % 2 != 0 || a < b) {
            System.out.println("-1");
        }
        else {
            int m = (a - b) / 2;
            int n = a - m;
            System.out.println(n + " " + m);
        }
    }
}