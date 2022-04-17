package baekjoon.bronze.bronze4;
//³ì»ö°ÅÅ¾
import java.util.Scanner;

public class GreenTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        System.out.println((int)Math.pow(2, height));
    }
}
