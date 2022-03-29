package baekjoon.bronze.bronze2;

import java.util.Scanner;

public class RoomSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int student = sc.nextInt();

        if(student%c%b%a==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
