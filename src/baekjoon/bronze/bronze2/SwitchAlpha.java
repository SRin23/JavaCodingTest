package baekjoon.bronze.bronze2;
//대소문자 바꾸기
import java.util.Scanner;

public class SwitchAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        StringBuilder newWord = new StringBuilder();

        for(int i = 0; i<word.length(); i++){
            char temp = word.charAt(i);
            if(Character.isLowerCase(temp)){
                newWord.append(Character.toUpperCase(temp));
            }
            else{
                newWord.append(Character.toLowerCase(temp));
            }
        }
        System.out.println(newWord);
    }
}
