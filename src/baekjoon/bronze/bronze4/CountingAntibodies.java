package baekjoon.bronze.bronze4;
//Counting Antibodies
import java.util.Scanner;

public class CountingAntibodies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lightChainK = sc.nextInt()*sc.nextInt();    //Light Chain K�� ������ �� �ִ� ����� ��
        int lightChainR = sc.nextInt()* sc.nextInt();   //Light Chain Ramda�� ������ �� �ִ� ����� ��
        long heavyChain = sc.nextInt()*sc.nextInt()*sc.nextInt();   //HeavyChain�� ������ �� �ִ� ����� ��
        System.out.println(lightChainK*heavyChain + lightChainR*heavyChain);
    }
}
