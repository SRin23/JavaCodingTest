package baekjoon.bronze.bronze1;

//펠린드롬 확인하기
import java.util.Scanner;

public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int flag = 1;
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                flag = 0;
                break;
            }
        }
        System.out.println(flag);
    }
}
