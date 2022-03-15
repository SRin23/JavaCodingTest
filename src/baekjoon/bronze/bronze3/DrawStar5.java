package baekjoon.bronze.bronze3;
//별찍기 - 5
import java.util.Scanner;

public class DrawStar5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for(int i = n; i>0; i--){
            for(int j = 0; j<i-1; j++){
                System.out.print(" ");
            }

            for(int j = n-i+1+k; j>0; j--){
                System.out.print("*");

            }
            k++;
            System.out.println();
        }
    }
}
