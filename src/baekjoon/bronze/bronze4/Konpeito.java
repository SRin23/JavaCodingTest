package baekjoon.bronze.bronze4;
//——¯¡”ÿ (Konpeito)
import java.util.Scanner;

public class Konpeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int result = (max-a) + (max-b) + (max-c);
        System.out.println(result);
    }
}
