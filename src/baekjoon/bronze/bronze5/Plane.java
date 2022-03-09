package baekjoon.bronze.bronze5;
//Plane
import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int business = sc.nextInt() * sc.nextInt();
        int economic = sc.nextInt() * sc.nextInt();

        System.out.println(business + economic);
    }
}
