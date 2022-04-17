package baekjoon.bronze.bronze4;
//Rulltrappa
import java.util.Scanner;

public class Rulltrappa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        int g = sc.nextInt();

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        int l = sc.nextInt();
        int r = sc.nextInt();


        double right = m/s + r/b;
        double left = m/g + l/a;

        if(right<left) System.out.println("latmask");
        else System.out.println("friskus");
    }
}
