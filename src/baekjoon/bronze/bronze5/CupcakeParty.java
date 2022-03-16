package baekjoon.bronze.bronze5;
//Cupcake Party
import java.util.Scanner;

public class CupcakeParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bigBox = sc.nextInt();
        int smallBox = sc.nextInt();

        int total = (bigBox*8)+(smallBox*3);
        System.out.println(total - 28);

    }
}
