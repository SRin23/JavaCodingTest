package baekjoon.bronze.bronze4;
//Equality
import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String form = sc.nextLine();
        int[] num = new int[3];
        int k = 0;
        for (int i = 0; i < form.length(); i++) {
            char ch = form.charAt(i);
            if (48 <= ch && ch <= 57) {
                num[k++] = ch-'0';
            }
        }
        if(num[0] + num[1]==num[2]){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
