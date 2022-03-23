package baekjoon.silver.silver5;
//°ýÈ£
import java.util.Scanner;

public class Bucket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String bracket = sc.next();
            int flag = 0;
            for(int j = 0; j<bracket.length(); j++){
                if(bracket.charAt(j)=='('){
                    flag++;
                }else if(bracket.charAt(j)==')'){
                    flag--;
                }
                if(flag<0){
                    break;
                }
            }
            if(flag==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
