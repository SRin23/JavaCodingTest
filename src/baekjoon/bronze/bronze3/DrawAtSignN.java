package baekjoon.bronze.bronze3;

import java.util.Scanner;

public class DrawAtSignN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<(n*5)-n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("@");
            }
            System.out.println();
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n*5; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
