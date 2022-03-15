package baekjoon.bronze.bronze2;
//10개씩 끊어 출력하기
import java.util.Scanner;

public class SplitByTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(str.charAt(0));
        for(int i = 1; i<str.length(); i++){
            if(i%10==0){
                System.out.println();
            }
            System.out.print(str.charAt(i));
        }
    }
}
