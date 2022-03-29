package baekjoon.bronze.bronze3;

import java.util.Scanner;

//배수와 약수
public class FactorAndMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int m = sc.nextInt();
            int n = sc.nextInt();

            //만약, 들어온 두 수가 0이라면 while문 벗어남
            if(m==0&&n==0) break;

            boolean factor = false;
            boolean multiple = false;

            if(n>m&&n%m==0) factor = true;
            if(m>n&&m%n==0) multiple = true;

            if(!factor&&!multiple) System.out.println("neither");
            else if(factor) System.out.println("factor");
            else if(multiple) System.out.println("multiple");
        }
    }
}
