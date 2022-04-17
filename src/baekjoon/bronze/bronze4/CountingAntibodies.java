package baekjoon.bronze.bronze4;
//Counting Antibodies
import java.util.Scanner;

public class CountingAntibodies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lightChainK = sc.nextInt()*sc.nextInt();    //Light Chain K를 조합할 수 있는 경우의 수
        int lightChainR = sc.nextInt()* sc.nextInt();   //Light Chain Ramda를 조할할 수 있는 경우의 수
        long heavyChain = sc.nextInt()*sc.nextInt()*sc.nextInt();   //HeavyChain을 조합할 수 있는 경우의 수
        System.out.println(lightChainK*heavyChain + lightChainR*heavyChain);
    }
}
