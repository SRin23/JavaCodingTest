package baekjoon.bronze.bronze3;
//영수증
import java.util.Scanner;

public class Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for(int i = 0; i<9; i++){
            total-=sc.nextInt();
        }
        System.out.println(total);
    }
}
