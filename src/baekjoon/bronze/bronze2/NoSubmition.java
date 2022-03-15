package baekjoon.bronze.bronze2;
//과제 안 내신 분..?
import java.util.Scanner;

public class NoSubmition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[30];
        for(int i = 0; i<28; i++){
            number[sc.nextInt()-1]++;
        }
        for(int i = 0; i<30; i++){
            if(number[i]==0){
                System.out.println(i+1);
            }
        }
    }
}
