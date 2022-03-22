package baekjoon.silver.silver5;
//쉽게 푸는 문제
import java.util.Scanner;

public class SolvedEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int result = 0;
        boolean flag = false;
        for(int j = 1; j<1000; j++){
            for(int i = 0; i<j; i++){
                count++;
                if(count>=a&&count<=b){
                    result+=j;
                }else if(count > b){
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        System.out.println(result);
    }
}
