package baekjoon.bronze.bronze5;
//Rats
import java.util.Scanner;

public class Rats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println((int)((n1+1)*(n2+1)/(n3+1)-1));
    }
}
