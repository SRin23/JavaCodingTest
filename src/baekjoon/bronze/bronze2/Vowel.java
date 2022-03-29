package baekjoon.bronze.bronze2;
//모음의 개수
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] vowel  = {'a', 'e', 'i', 'o', 'u'};
        int result = 0;

        for(int i = 0; i<str.length(); i++){
            for(int j = 0; j<vowel.length; j++){
                if(str.charAt(i)==vowel[j]) {
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
