package baekjoon.bronze.bronze3;
//»ç°ú

import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = 0;
        for(int i = 0; i<n; i++){
            int student = sc.nextInt();
            int apple = sc.nextInt();
            left+=apple%student;
        }
        System.out.println(left);
    }
}
