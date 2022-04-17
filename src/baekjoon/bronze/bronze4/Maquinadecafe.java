package baekjoon.bronze.bronze4;
//M?quina de caf?

import java.util.Scanner;

public class Maquinadecafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1 = sc.nextInt();
        int f2 = sc.nextInt();
        int f3 = sc.nextInt();

        int result1 = f2*2 + f3*4;
        int result2 = f1*2 + f3*2;
        int result3 = f1*4 + f2*2;

        System.out.println(Math.min(result1, Math.min(result2, result3)));
    }
}
