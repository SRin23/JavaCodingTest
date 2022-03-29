package baekjoon.bronze.bronze3;

import java.util.Scanner;

//����� ���
public class FactorAndMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int m = sc.nextInt();
            int n = sc.nextInt();

            //����, ���� �� ���� 0�̶�� while�� ���
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
