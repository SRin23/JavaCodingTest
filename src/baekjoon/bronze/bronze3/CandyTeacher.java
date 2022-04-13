package baekjoon.bronze.bronze3;

import java.util.Scanner;

public class CandyTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            long candy = 0;
            for(int j = 0; j<n; j++){
                candy+=sc.nextLong();
            }

            if(candy%n==0) System.out.println("YES");
            else System.out.println("NO");

            sc.nextLine();

        }
    }
}
