package baekjoon.bronze.bronze3;

import java.util.Scanner;

//��Ÿ�� ��â��
public class MissSpell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            sb.append(sc.next());
            sb.replace(n-1, n, "");
            System.out.println(sb);
        }
    }
}
