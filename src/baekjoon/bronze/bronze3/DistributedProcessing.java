package baekjoon.bronze.bronze3;
//�л�ó�� -> �޸��ʰ�
import java.math.BigInteger;
import java.util.Scanner;

public class DistributedProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            BigInteger br = sc.nextBigInteger().pow(sc.nextInt());
            System.out.println(br.remainder(BigInteger.valueOf(10)));
        }
    }
}
