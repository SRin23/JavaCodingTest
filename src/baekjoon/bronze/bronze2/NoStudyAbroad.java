package baekjoon.bronze.bronze2;
//유학 금지
import java.util.Scanner;

public class NoStudyAbroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cambridge = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
        String str = sc.next();
        String result = "";

        for(int i = 0; i<str.length(); i++){
            boolean flag = true;
            for(int j = 0;j<cambridge.length; j++){
                if(str.charAt(i)==cambridge[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result = result.concat(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(result);
    }
}
