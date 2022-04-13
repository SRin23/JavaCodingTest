package baekjoon.bronze.bronze4;
//Circus
import java.util.Scanner;

public class Circus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long circus = sc.nextLong();
        System.out.println(Math.sqrt(circus/Math.PI)*2*Math.PI);
    }
}
