package baekjoon.bronze.bronze1;

import java.util.Scanner;

public class MakeOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 0;
        while(x!=1){
            if(x%3==0){
                x/=3;
            }else if(x%2==0){
                x/=2;
            }else if(x>=1){
                x--;
            }
            result++;
        }
        System.out.println(result);
    }
}
