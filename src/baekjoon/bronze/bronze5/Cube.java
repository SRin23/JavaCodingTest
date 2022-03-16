package baekjoon.bronze.bronze5;
//立方体 (Cube)
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((int)Math.pow(x, 3));
    }
}
