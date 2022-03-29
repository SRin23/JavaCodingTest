package baekjoon.bronze.bronze3;
//¾ó¸¶?
import java.util.Scanner;

public class CarOption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int carPrice = sc.nextInt();
            int n = sc.nextInt();
            for(int j = 0; j<n; j++){
                carPrice += sc.nextInt() * sc.nextInt();
            }
            System.out.println(carPrice);
        }
    }
}
