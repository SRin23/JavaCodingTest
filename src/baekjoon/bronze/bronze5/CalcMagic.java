package baekjoon.bronze.bronze5;
//Арифметическая магия(사칙마술)
import java.util.Scanner;

public class CalcMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //((x+1)*(y+1)-xy-x-y)^n
        int n = sc.nextInt();
        System.out.println((int)Math.pow(1, n));
    }
}
